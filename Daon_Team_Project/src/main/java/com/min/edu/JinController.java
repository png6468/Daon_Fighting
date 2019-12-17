package com.min.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.model.JinDaon_IService;

@Controller
public class JinController {
	
	private static final Logger logger = LoggerFactory.getLogger(JinController.class);
	
	@Autowired
	private JinDaon_IService service;
	
	@RequestMapping(value = "/sijak.do", method = RequestMethod.GET)
	public String jintest() {
		logger.info("과정메인으로 가보자");
		return "gwajungmain";
	}
	
}