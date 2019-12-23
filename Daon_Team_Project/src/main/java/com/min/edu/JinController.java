package com.min.edu;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.dtos.StuCou_Dto;
import com.min.edu.dtos.Student_Dto;
import com.min.edu.dtos.Subject_Dto;
import com.min.edu.model.JinDaon_IService;

@Controller
public class JinController {

	private static final Logger logger = LoggerFactory.getLogger(JinController.class);

	@Autowired
	private JinDaon_IService service;

	@RequestMapping(value = "/sijak.do", method = RequestMethod.GET)
	public String jintest() {
		logger.info("시작페이지 이동");
		return "Course_List";
	}

	@RequestMapping(value = "/insertCouForm.do", method = RequestMethod.GET)
	public String Make_Course() {
		logger.info("insertCouForm.do:{}", new Date());
		return "insertCourseForm";
	}

	@RequestMapping(value = "/iselCourse.do", method = RequestMethod.GET)
	public String iselCourseList(Model model) {
		logger.info("현재 진행중인 전체 과정 조회");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "5");
		List<Course_Dto> clists = service.iselCourse(map);

		model.addAttribute("clists", clists);
		return "iselCourse_List";
	}

	@RequestMapping(value = "/bselCourse.do", method = RequestMethod.GET)
	public String bselCourseList(Model model) {
		logger.info("종료된 전체 과정 조회");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "5");
		List<Course_Dto> clists = service.bselCourse(map);
		model.addAttribute("clists", clists);
		return "bselCourse_List";
	}

	@RequestMapping(value = "/wselCourse.do", method = RequestMethod.GET)
	public String wselCourseList(Model model) {
		logger.info("예정된 전체 과정 조회");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "5");
		List<Course_Dto> clists = service.wselCourse(map);
		model.addAttribute("clists", clists);
		return "wselCourse_List";
	}

	@RequestMapping(value = "/insert_Course.do", method = RequestMethod.POST)
	public String insert_Course(Course_Dto dto, HttpSession session) {
		logger.info("insertCourse 가 들어 옵니다");
		Course_Dto Cdto = (Course_Dto) session.getAttribute("mem");
		dto.setCou_code(Cdto.getCou_cnt());
		boolean isc = service.insertCourse(dto);
		System.out.println(isc + "는 뭘까요?");
		System.out.println(dto + "얘는 뭘까요??");
		return isc ? "redirect:/insertCourse" : "redirect:/gwajungmain";
	}

	@RequestMapping(value = "/detailCou.do", method = RequestMethod.GET)
	public String dCourse(Model model, String cou_code) {
		logger.info("detailCourse가들어가는중,{}");
		Course_Dto cdto = service.detailCourse(cou_code);
		model.addAttribute("cdto", cdto);
		return "detailCourse";
	}

	@RequestMapping(value = "/coustu.do", method = RequestMethod.GET)
	public String courseinStu(Model model, String cou_code) {
		logger.info("courseinStu,{}",cou_code);
		List<Student_Dto> sclist = service.courseinStusel(cou_code);
		model.addAttribute("sclist", sclist);	
		return "cou_stuList";
	}
	
	@RequestMapping(value = "/sublist.do" ,method = RequestMethod.GET)
	public String Subjectlist(Model model) {
		logger.info("Subjectlist,{}");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "5");
		List<Subject_Dto> sulist =	service.selSubject(map);
		model.addAttribute("sulist", sulist);
		return"Sub_list";
	}
}