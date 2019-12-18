package com.min.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.SelectSel_Dto;
import com.min.edu.model.NamDaon_IService;

@Controller
public class NamController {
	
	private static final Logger logger = LoggerFactory.getLogger(NamController.class);
	
	@Autowired
	private NamDaon_IService service;
	
	@RequestMapping(value = "/Poolgi.do", method = RequestMethod.GET)
	public String moonjepoolgi(String cur_code, Model model, String sub_name) {
		logger.info("moonjepoolgi");
		System.out.println(cur_code);
		System.out.println(sub_name);
		List<SelectSel_Dto> listS = service.gaekExasel(cur_code);
		System.out.println("객관식 curcode 뜨나?"+listS);
		List<DescPortSel_Dto> listD = service.sesulExasel(cur_code);
		System.out.println("서술형 curcode 뜨나?"+listD);	
		model.addAttribute("lists", listS);
		model.addAttribute("lists", listD);
		model.addAttribute("sub_name", sub_name);
		return "Poolgi";
	}
	
	@RequestMapping(value = "/jechool.do", method = RequestMethod.GET)
	public String jechool() {
		logger.info("제출 성공해써");
		return "Course_List";
	}
}
