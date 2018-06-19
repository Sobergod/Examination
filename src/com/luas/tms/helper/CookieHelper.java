package com.luas.tms.helper;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieHelper {
	private String charset = "UTF-8";
	private int expiry = -1;  //秒

	private HttpServletRequest request;
	private HttpServletResponse response;
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public CookieHelper(HttpServletRequest request,
			HttpServletResponse response, String charset, int expiry,
			String path) {
		this(request, response, charset, expiry);
		this.path = path;

	}
	public CookieHelper(HttpServletRequest request) {
		super();
		this.request = request;
	}
	public CookieHelper(HttpServletRequest request,
			HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;
	}
	
	public CookieHelper(HttpServletRequest request,
			HttpServletResponse response, String charset) {
		super();
		this.charset = charset;
		this.request = request;
		this.response = response;
	}

	public CookieHelper(HttpServletRequest request,
			HttpServletResponse response, String charset, int expiry) {
		super();
		this.charset = charset;
		this.expiry = expiry;
		this.request = request;
		this.response = response;
	}

	public CookieHelper(String charset, int expiry) {
		super();
		this.charset = charset;
		this.expiry = expiry;
	}

	public CookieHelper() {
		super();
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public int getExpiry() {
		return expiry;
	}

	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}

	// 1.写cookie
	/**
	 * 写cookie
	 * 
	 * @param request
	 * @param response
	 * @param map
	 *            想要写入的数据，放在一个map对象中
	 * @param expiry
	 *            过期时间
	 * @param charset
	 *            字符编码
	 */
	public void writeCookie(Map<String, String> map) {
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Entry<String, String> e = it.next();

			this.writeCookie(e.getKey(), e.getValue());

		}
	}

	// a.写一个键值到cookie中（注意编码，有效期，路径）
		public void writeCookie(String name, String value,int expiry) {
			try {
				String n = URLEncoder.encode(name, charset);
				String v = URLEncoder.encode(value, charset);
				Cookie c = new Cookie(n, v);
				
				c.setMaxAge(expiry);
				
				if (this.path == null || this.path.length() == 0) {
					path = request.getContextPath();
				}
				c.setPath(path);
				response.addCookie(c);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		
	// a.写一个键值到cookie中（注意编码，有效期，路径）
	public void writeCookie(String name, String value) {
		try {
			String n = URLEncoder.encode(name, charset);
			String v = URLEncoder.encode(value, charset);
			Cookie c = new Cookie(n, v);
			if (expiry >= 0) {
				c.setMaxAge(expiry);
			}
			if (this.path == null || this.path.length() == 0) {
				path = request.getContextPath();
			}
			c.setPath(path);
			response.addCookie(c);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	// b.写一个cookie对象到cookie中(有效期，路径)
	public void writeCookie(Cookie c) {
		response.addCookie(c);
	}

	// 2.读cookie
	/**
	 * 把cookie信息读取到map中
	 * 
	 * @param request
	 * @param charset
	 *            编码格式
	 * @return
	 */
	public Map<String, String> getCookies() {
		Map<String, String> map = new HashMap<String, String>();
		Cookie[] cs = request.getCookies();
		if (cs == null) {
			return map;
		}
		try {
			for (int i = 0; i < cs.length; i++) {
				Cookie c = cs[i];
				String name = c.getName();
				String value = c.getValue();
				name = URLDecoder.decode(name, charset);
				value = URLDecoder.decode(value, charset);
				map.put(name, value);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return map;
	}

	/**
	 * 根据cookie的nme，从cookie中读取一个value
	 * 
	 * @param request
	 * @param name
	 * @param charset
	 * @return
	 */
	public String getCookieByName(String name) {
		Map<String, String> map = this.getCookies();
		String v = map.get(name);
		return v == null ? "" : v;
	}

	// 3.删cookie
	/**
	 * 删一堆cookie名称
	 * 
	 * @param request
	 * @param response
	 * @param map
	 *            想要写入的数据，放在一个map对象中
	 * @param expiry
	 *            过期时间
	 * @param charset
	 *            字符编码
	 */
	public void removeCookie(Set<String> set) {
		for (String name : set) {
			this.removeCookie(name);
		}
	}

	/**
	 * 删除cookie集合
	 * 
	 * @param request
	 * @param response
	 * @param map
	 *            想要写入的数据，放在一个map对象中
	 * @param expiry
	 *            过期时间
	 * @param charset
	 *            字符编码
	 */
	public void removeCookie(Map<String, String> map) {
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			this.removeCookie(e.getKey());
		}
	}

	/**
	 * 删除一个cookie
	 * 
	 * @param name
	 */
	public void removeCookie(String name) {
		try {
			String n = URLEncoder.encode(name, charset);
			String v = "suibian";
			Cookie c = new Cookie(n, v);

			c.setMaxAge(0);

			if (this.path == null || this.path.length() == 0) {
				path = request.getContextPath();
			}
			c.setPath(path);
			response.addCookie(c);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
