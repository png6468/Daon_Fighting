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
	public String moonjepoolgi(String cur, Model model,String mean) {
		logger.info("moonjepoolgi, {}",mean);
		System.out.println("여기가 cur"+cur);
		System.out.println(mean);
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("cur_code", cur);
		if (mean.equalsIgnoreCase("S")) {
			List<SelectSel_Dto> listS = service.gaekExasel(map);			
			System.out.println("객관식 curcode 뜨나?"+listS);
			model.addAttribute("listS", listS);
		}else {
			List<DescPortSel_Dto> listD = service.sesulExasel(map);
			System.out.println("서술형 curcode 뜨나?"+listD);
			model.addAttribute("listD", listD);
		}
		model.addAttribute("mean",mean);
		return "Poolgi";
	}
	
	@RequestMapping(value = "/jechool.do", method = RequestMethod.POST)
	public String jechool(String cur_code) {
		logger.info("제출 성공해써");
		return "Course_List";
	}
}
