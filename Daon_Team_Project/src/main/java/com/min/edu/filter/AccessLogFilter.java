package com.min.edu.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessLogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(AccessLogFilter.class);
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		
		// remoteAddr, URL, queryString , referer, User-Agent
		
		String remoteAddr 	= req.getRemoteAddr();
		String url 			= req.getRequestURL().toString();
		String queryString 	= req.getQueryString();
		String referer 		= req.getHeader("Referer");
		String UserAgent 	= req.getHeader("User-Agent");
		
//		System.out.println(remoteAddr 	);
//		System.out.println(url 			);
//		System.out.println(queryString 	);
//		System.out.println(referer 		);
//		System.out.println(UserAgent 	);
		
		StringBuffer sb = new StringBuffer();
		sb.append(":").append(remoteAddr).append(":").append(url).append("?").append(queryString).append(":").append(referer).append(":").append(UserAgent);
		
		logger.info("++++++++++ 필터 통과중 ++++++++++");
		logger.info("Log Filter "+ sb.toString());
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		logger.info("++++++++++ 필터 생성 ++++++++++");
	}

	public void destroy() {
		logger.info("++++++++++ 필터 종료 ++++++++++");
	}
	

}
