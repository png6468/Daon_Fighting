package com.min.edu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Spring <mvc:interceptor> 를 통해 특정하시 실행되면 Requestmapping 전에 <br>
 * 실행되어 로직을 수행하고 수행 결과에 따라 흐름제어를 함
 * ex) 로그인이 되어 있어야지만 처리 되는 화면  
 * @author JMK
 *
 */
public class Interceptor extends HandlerInterceptorAdapter{

	private Logger logger = LoggerFactory.getLogger(Interceptor.class);
	
	//**.do 실행되지 전에 처리해주는 Handler
	// 로그인 정보(ServletRequest>HttpServletRequest>HttpSession)를 확인 -> false -> 로그인 폼으로 보냄
	// 로그인 정보를 담는 Session 객체의 name ex) session명은 "mem" = null
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 인터셉터 시작 ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		try {
			if (request.getSession().getAttribute("mem") == null) {
				response.sendRedirect("./loginForm.do");
				return false;
			} 
		} catch (Exception e) {
			logger.info("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 나 intercepor야 이름 확인해 봐  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				e.printStackTrace();
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		logger.info("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 인터셉터 종료  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	
	
	
}










