package com.min.edu;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.edu.dtos.Admin_Dto;
import com.min.edu.model.ByeongDaon_IService;


@Controller
public class ByeongController {
	
	
	
	private Logger logger = LoggerFactory.getLogger(ByeongController.class);
	
	@Autowired
	private ByeongDaon_IService service;
	
	@RequestMapping(value = "/admin_login.do", method = RequestMethod.GET)
	public String home() {
		logger.info("시작!");
		
		
		return "login_Admin";
	}
	
	@RequestMapping(value = "/loginAdbsame.do", method = RequestMethod.POST)
	public String loginAdbsame(Admin_Dto dto, HttpSession session) {
		logger.info("관리자 로그인 아이디{}, 비밀번호{}", dto);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("adm_id", dto.getAdm_id());
		map.put("adm_pw", dto.getAdm_pw());
		
		Admin_Dto mdto = service.loginAdbsame(map);
		if(mdto !=null) {
			session.setAttribute("ADto", mdto);
		}else {
			return "redirect:/admin_login.do";
		}
		
		
		return "Main_admin";
	}
	
	@RequestMapping(value = "/logout_Admin.do", method = RequestMethod.GET)
	public String logout_Admin(HttpSession session) {
		session.removeAttribute("dto");
		return "redirect:./admin_login.do";
	}
	
	@RequestMapping(value="/loginCheckMap.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> loginCheckMap(String adm_id){
		Map<String, String> map = new HashMap<String, String>();
		logger.info("Login 확인 : \t{}", adm_id);
		String adm = service.aidCheck(adm_id);
		System.out.println(adm);
		
		if(adm==null) {
			map.put("isc", "실패");
		}else {
			map.put("isc", "성공");
		}
		return map;
	}
	
	/*
	 * @RequestMapping(value="/signUpForm.do", method = RequestMethod.GET) public
	 * String signUpForm() { return "signUpForm"; }
	 */
	
	@RequestMapping(value="/idCheck.do", method=RequestMethod.GET)
	public String aidCheck(Model model, String adm_id){
		String idChk = service.aidCheck(adm_id);
		model.addAttribute("isc", idChk==null?true:false);
		return "idCheck";
	}
	
	@RequestMapping(value="/signUp.do", method=RequestMethod.GET)
	public String signUp() {
		
		return "signUpForm";
	}
	
	@RequestMapping(value="/signUp.do", method=RequestMethod.POST)
	public String singUp(Admin_Dto dto) {
		boolean isc = service.admdbSave(dto);
		return isc?"redirect:/admin_login.do":"redirect:/signUp.do";
		
	}
	
	
}