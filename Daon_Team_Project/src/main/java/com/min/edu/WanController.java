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

import com.min.edu.dtos.AnswerScore_Dto;
import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.Exam_Dto;
import com.min.edu.dtos.Subject_Dto;
import com.min.edu.model.JinDaon_IService;
import com.min.edu.model.WanDaon_IService;

/**
 * Handles requests for the application home page.
 * 객관식 문제 채점, 서/포문제 채점 갈게요 그거 어렵지 않아요 할만해요
 * 출제에 비하면...
 */
@Controller
public class WanController {
	
	private static final Logger logger = LoggerFactory.getLogger(WanController.class);
	
	@Autowired
	private WanDaon_IService service;

	@RequestMapping(value="/view.do", method=RequestMethod.GET)
	public String viewf() {
		return "view";
	}
	@RequestMapping(value = "/pointing.do", method = RequestMethod.GET)
	public String pointing(String cur_code, Model model, String exa_code, String exa_mean) {
		logger.info("〓〓〓〓〓〓〓〓〓 pointing.do 컨트롤러 나오나요??〓〓〓〓〓〓〓〓");
		List<DescPortSel_Dto> lists =service.sesulExasel(cur_code);
		System.out.println("이거 나오는건가요?? 주관식 리스트 " + lists);
		model.addAttribute("lists", lists);	
		return "pointdp";
	}
	
	@RequestMapping(value="/jungdabstu.do", method=RequestMethod.GET)
	public String jungdabstu(Model model,String exa_code, String stu_id) {
		logger.info("〓〓〓〓〓〓〓〓〓 jungdabstu.do 컨트롤러 나오나요??〓〓〓〓〓〓〓〓");
		Map<String, String> map = new HashMap<String, String>();
		map.put("exa_code", "1");
		map.put("stu_id", "qwer");
		System.out.println("이거 맵 나오나요?? : "+ map);
		List<AnswerScore_Dto> lists = service.answerSsp(map);
		model.addAttribute("lists", lists);
		return "jungdabstu";
	}

}
























