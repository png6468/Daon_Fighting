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
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.model.JinDaon_IService;

@Controller
public class JinController {
	
	private static final Logger logger = LoggerFactory.getLogger(JinController.class);
	
	@Autowired
	private JinDaon_IService service;
	
	@RequestMapping(value = "/sijak.do", method = RequestMethod.GET)
	public String jintest() {
		logger.info("시작페이지 이동");
		return "gwajungmain";
	}
	
	@RequestMapping(value = "/Course_List.do",method = RequestMethod.GET)
	public String CourseList(Paging_Dto dto, Model model) {
		logger.info("현재 진행중인 전체 과정 조회");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "5");
		List<Course_Dto> lists = service.iselCourse(map);
		model.addAttribute("lists", lists);
		return "Course_List";
	}
	
}