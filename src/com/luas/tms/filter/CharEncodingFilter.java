package com.luas.tms.filter;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CharEncodingFilter implements Filter {
	private String oldEncoding = "iso-8859-1";
	private String newEncoding = "utf-8";

	public void destroy() {
		System.out.println("�ַ������������ע��...");
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		// ����ת�͵õ�request����
		HttpServletRequest request = (HttpServletRequest) req;
		// �ж�request���ύ��ʽ
		if (request.getMethod().equalsIgnoreCase("post")) {
			// post��ʽ�ύ
			request.setCharacterEncoding(newEncoding);
		} else {
			// get��ʽ�ύ
			Map<String, String[]> map = request.getParameterMap();
			Set<Entry<String, String[]>> entrySet = map.entrySet();
			for (Entry<String, String[]> entry : entrySet) {
				// �п����Ǹ�ѡ���ύ�����ڶ��ֵ�������ʹ��String[]
				String[] value = entry.getValue();
				for (int i = 0; i < value.length; i++) {
					value[i] = new String(value[i].getBytes(oldEncoding),
							newEncoding);
				}
			}
		}

		// ����������
		chain.doFilter(req, resp);
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("�ַ����������������...");
		String tmpEncoding = config.getInitParameter("newEncoding");
		if (tmpEncoding != null && tmpEncoding.length() > 0) {
			newEncoding = tmpEncoding;
		}
	}
}
