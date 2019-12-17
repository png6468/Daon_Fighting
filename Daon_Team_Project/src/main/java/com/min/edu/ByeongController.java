package com.min.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dtos.Admin_Dto;
import com.min.edu.model.ByeongDaon_IService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ByeongController {
	
	private static final Logger logger = LoggerFactory.getLogger(ByeongController.class);
	
	@Autowired
	private ByeongDaon_IService service;
	
	@RequestMapping(value = "/admin_login.do", method = RequestMethod.GET)
	public String home() {
		logger.info("시작!");
		
		
		return "login_Admin";
	}
	
	@RequestMapping(value = "/login_Admin.do", method = RequestMethod.POST)
	public String login_Admin(String adm_id, String adm_pw, HttpSession session) {
		logger.info("관리자 로그인 아이디{}, 비밀번호{}",adm_id,adm_pw);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("adm_id", adm_id);
		map.put("adm_pw", adm_pw);
		
		Admin_Dto dto = service.login_Admin(map);
		session.setAttribute("dto", dto);
		
		return "Main_admin";
	}
}