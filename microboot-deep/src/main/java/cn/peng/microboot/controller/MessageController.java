package cn.peng.microboot.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class MessageController {
	@RequestMapping("/echo/{message}")
	@ResponseBody
	public String echo(@PathVariable("message") String msg) {
		return "【echo返回】" + msg;
	}
	@RequestMapping("/inner")
	@ResponseBody
	public Object innerObject(HttpServletRequest request,HttpServletResponse response) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("requset.contextPath", request.getContextPath());
		map.put("session-id", request.getSession().getId());
		map.put("application-realPath", request.getServletContext().getRealPath("/"));
		map.put("response-contentType", response.getContentType());
		return map;
	}
	@RequestMapping("/inner1")
	@ResponseBody
	public Object innerObject() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() ;
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse() ;
		Map<String,String> map = new HashMap<String,String>() ;
		map.put("request-contextPath", request.getContextPath()) ;
		map.put("session-id", request.getSession().getId()) ;
		map.put("application-realPath", request.getServletContext().getRealPath("/")) ;
		map.put("response-contentType", response.getContentType()) ;
		return map ;
	}
}
