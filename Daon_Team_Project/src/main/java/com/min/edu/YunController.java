package com.min.edu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;
import com.min.edu.model.YunDaon_IDao;
import com.min.edu.model.YunDaon_IService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class YunController {
	
	private static final Logger logger = LoggerFactory.getLogger(YunController.class);
	
	@Autowired
	private YunDaon_IService service;
	
	
	@RequestMapping(value = "/test_domain.do", method = RequestMethod.GET)
	public String td(){
		logger.info("문제 보기 화면");
		System.out.println("아직 문제화면 구성 전이야");
		
		return "munsel";
	}
	@RequestMapping(value = "/munlist.do", method = RequestMethod.GET)
	public String munlist(String sub, String mean, Model model) {
		logger.info("이 페이지가 어떻게 나오는 걸까 munlist.do  sub={}",sub);
		System.out.println(mean);
		System.out.println(sub);
		Map<Object, Object> map = new HashMap<Object, Object>();
		Map<Object, Object> map2 = new HashMap<Object, Object>();
		String[] ss = null;
		map2.put("start", 1);
		map2.put("end", 10);
		map.put("sub_code", sub);
		if(mean.equalsIgnoreCase("S")) {
			List<String> list = service.searchsel1(map);
			ss = new String[list.size()];
			for (int i = 0; i < list.size(); i++) {
				ss[i] = list.get(i);
				System.out.println(ss[i]);
			}
			map2.put("exa_code_", ss);
			List<ExamSelect_Dto> lists = service.searchsel2(map2);
			model.addAttribute("lists", lists);
			
		}else{
			System.out.println("여기 찍히는거니? 안찍히니? 제발");
			if(mean.equalsIgnoreCase("D")) {
				List<String> list = service.searchdes1(map);
				ss = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					ss[i] = list.get(i);
					System.out.println(ss[i]);
				}
				map2.put("exa_code_", ss);
				List<ExamDesc_Dto> lists = service.searchdes2(map2);
				model.addAttribute("lists", lists);
				
				
			}else if(mean.equalsIgnoreCase("P")) {
				List<String> list = service.searchport1(map);
				ss = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					ss[i] = list.get(i);
					System.out.println(ss[i]);
				}
				map2.put("exa_code_", ss);
				List<ExamDesc_Dto> lists = service.searchport2(map2);
				model.addAttribute("lists", lists);
				
			}
			
		}
		
		
		model.addAttribute("mean", mean);
		
		return "selmun";
	}
	
	@RequestMapping(value = "/createmun.do", method = RequestMethod.GET)
	public String createmun(String sub) {
		logger.info("문제 생성 화면");
		return "createmun";
	}
	
	
}