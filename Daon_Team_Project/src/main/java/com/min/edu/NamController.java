package com.min.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
	
	@RequestMapping(value = "/poolgi.do", method = RequestMethod.GET)
	public String moonjepoolgi(String cur_code, Model model) {
		logger.info("moonjepoolgi {}.");
		List<SelectSel_Dto> listS = service.gaekExasel(cur_code);
		List<DescPortSel_Dto> listD = service.sesulExasel(cur_code);
		model.addAttribute("lists", listS);
		model.addAttribute("lists", listD);
		return "Poolgi";
	}
}
