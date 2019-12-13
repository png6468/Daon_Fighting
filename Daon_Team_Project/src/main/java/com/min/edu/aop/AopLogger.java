package com.min.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Advice => pointcut에서 실행되는 메소드
// @Before ~~~
// Dao에서 실행되는 모든 메소드를 자동 로그처리 하겠다.
public class AopLogger {

	//전달받는 augument 메소드명
	public void before(JoinPoint j) {
		Logger logger = LoggerFactory.getLogger(j.getTarget()+"");
		logger.info("=============logger 시작=============");
		
		Object[] args =  j.getArgs();
		
		if(args!=null) {
			logger.info("Method 명 :\t"+j.getSignature().getName());
			for (int i = 0; i < args.length; i++) {
				logger.info(i+":번째:\t"+args[i]);
			}
			logger.info("Method 명 :\t"+j.getSignature().getName());
		}
	}
	
	//반환타입이 있을때
	public void afterReturning(JoinPoint j) {
		Logger logger = LoggerFactory.getLogger(j.getTarget()+"");
		logger.info("=============   끝     =============");
	}
	
	//예외가 발생 했을때
	public void daoException(JoinPoint j) {
		Logger logger = LoggerFactory.getLogger(j.getTarget()+"");
		logger.info("에러:\t"+j.getArgs());
		logger.info("에러:\t"+j.toString());
		
	}
	
	
	
}




