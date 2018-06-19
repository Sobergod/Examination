package com.luas.tms.mvc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * ActionMapping类
 * 
 * 该类中封装了一个HashMap,键为一个请求的路径，对应的值为某个Action类中的一个具体方法
 * 
 * @author 可
 * 
 */
public class ActionMapping {
	private static HashMap<String, ActionConfig> map = new HashMap<String, ActionConfig>();

	public static void saveActionConfig(String url, ActionConfig actionConfig) {
		map.put(url, actionConfig);
	}

	public static ActionConfig getActionConfig(String url) {
		return map.get(url);
	}

	public static void init(String realPath) {
		File file = new File(realPath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			Element root = document.getDocumentElement(); // 拿到mvcConfig元素
			NodeList nl = root.getChildNodes(); // 拿到mvcConfig元素的所有子节点 --
												// 其实用的就是actionMapping
			for (int i = 0; i < nl.getLength(); i++) {
				Node node = nl.item(i);
				if (node.getNodeName().equals("actionMapping")) { // 切实拿到了actionMapping元素
					Element actionsMapping = (Element) node;
					initActionsMapping(actionsMapping);
				}
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private static void initActionsMapping(Element actionsMapping)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		NodeList aciontList = actionsMapping.getChildNodes(); // 拿到了所有的action元素
		for (int i = 0; i < aciontList.getLength(); i++) {
			Node node = aciontList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE
					&& node.getNodeName().equals("action")) {
				Element actionElement = (Element) node;
				String url = actionElement.getAttribute("name");
				String className = actionElement.getAttribute("class");
				String methodName = actionElement.getAttribute("method");
				System.out.println(url + ":" + className + ":" + methodName);
				if (url != null && !url.equals("") && className != null
						&& !className.equals("")) {
					if (methodName == null || methodName.equals("")) {
						methodName = "execute";
					}
					Class clazz = Class.forName(className);
					Object actionObj = clazz.newInstance();
					Action action = (Action) actionObj;
					ActionConfig ac = new ActionConfig();
					ac.setMethodName(methodName);
					ac.setAction(action);
					saveActionConfig(url, ac);
				}
			}
		}

	}

}
