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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Curriculum_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.dtos.StuCou_Dto;
import com.min.edu.dtos.Student_Dto;
import com.min.edu.dtos.Subject_Dto;
import com.min.edu.dtos.Teacher_Dto;
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
		map.put("endList", "20");
		List<Course_Dto> clists = service.iselCourse(map);

		model.addAttribute("clists", clists);
		return "iselCourse_List";
	}

	@RequestMapping(value = "/iCourseform.do", method = RequestMethod.GET)
	public String insertCouform() {
		logger.info("iCourseform 들어옴", new Date());

		return "insertCou";
	}

	@RequestMapping(value = "/insert_Course.do", method = RequestMethod.POST)
	public String insert_Course(Course_Dto dto, HttpSession session) {
		logger.info("insertCourse 가 들어 옵니다");
		Course_Dto Cdto = new Course_Dto();
		Cdto.setCou_name(dto.getCou_name());
		Cdto.setTea_id(dto.getTea_id());
		Cdto.setStartdate(dto.getStartdate());
		Cdto.setCou_exp(dto.getCou_exp());
		boolean isc = service.insertCourse(Cdto);
		return isc ? "redirect:/wselCourse.do" : "redirect:/iCourseform.do";
	}

	@RequestMapping(value = "/delCou.do", method = RequestMethod.POST)
	public String deleteCourse(String cou_code) {
		logger.info("deleteCourse");
		boolean isc = service.deleteCourse(cou_code);
		return isc ? "redirect:/wselCourse.do" : "redirect:/sijak.do";
	}

	@RequestMapping(value = "/bselCourse.do", method = RequestMethod.GET)
	public String bselCourseList(Model model) {
		logger.info("종료된 전체 과정 조회");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "20");
		List<Course_Dto> clists = service.bselCourse(map);
		model.addAttribute("clists", clists);
		return "bselCourse_List";
	}

	@RequestMapping(value = "/wselCourse.do", method = RequestMethod.GET)
	public String wselCourseList(Model model) {
		logger.info("예정된 전체 과정 조회");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "20");
		List<Course_Dto> clists = service.wselCourse(map);
		model.addAttribute("clists", clists);
		return "wselCourse_List";
	}

	////////////

	@RequestMapping(value = "/detailCou.do", method = RequestMethod.GET)
	public String dCourse(Model model, String cou_code) {
		logger.info("detailCourse가들어가는중,{}");
		Course_Dto cdto = service.detailCourse(cou_code);
		model.addAttribute("cdto", cdto);
		return "detailCourse";
	}

	@RequestMapping(value = "/coustu.do", method = RequestMethod.GET)
	public String courseinStu(Model model, String cou_code) {
		logger.info("courseinStu,{}", cou_code);
		List<Student_Dto> sclist = service.courseinStusel(cou_code);
		model.addAttribute("sclist", sclist);
		return "cou_stuList";
	}

	@RequestMapping(value = "/sublist.do", method = RequestMethod.GET)
	public String Subjectlist(Model model) {
		logger.info("Subjectlist,{}");
		Map<String, String> map = new HashMap<String, String>();
		map.put("startList", "1");
		map.put("endList", "20");
		List<Subject_Dto> sulist = service.selSubject(map);
		model.addAttribute("sulist", sulist);
		return "Sub_list";
	}

	@RequestMapping(value = "/de_sub.do", method = RequestMethod.GET)
	public String detailSub(String sub_code, Model model) {

		logger.info("detailSub,{}", sub_code);
		Subject_Dto sdto = service.detailSubject(sub_code);
		model.addAttribute("sdto", sdto);
		return "detailSub";
	}

	@RequestMapping(value = "/modfysubform.do", method = RequestMethod.GET)
	public String modfy_subform(String sub_code, Model model) {
		logger.info("modfy_subform 진입,{}", sub_code);
		Subject_Dto subdto = service.detailSubject(sub_code);
		model.addAttribute("subdto", subdto);
		return "modfysubform";
	}

	@RequestMapping(value = "/modfysub.do", method = RequestMethod.POST)
	public String modfy_sub(Subject_Dto dto, Curriculum_Dto cdto) {
		Subject_Dto sdto = new Subject_Dto();
		sdto.setSub_code(cdto.getSub_code());
//		sdto.setSub_code(dto.getSub_code());
		sdto.setSub_exp(dto.getSub_exp());
		sdto.setSub_name(dto.getSub_name());
		sdto.setSub_time(dto.getSub_time());
		boolean isc = service.updateSubject(sdto);
		return isc ? "redirect:/sublist.do" : "redirect:/modfysubform.do";

	}

	@RequestMapping(value = "/iSubjectform.do", method = RequestMethod.GET)
	public String insertSubform() {
		logger.info("insertSubform 들어옴", new Date());

		return "insertSub";
	}

	@RequestMapping(value = "/iSubject.do", method = RequestMethod.POST)
	public String insertSub(Subject_Dto dto) {
		Subject_Dto sdto = new Subject_Dto();
//		sdto.setSub_code(dto.getSub_code());
		sdto.setSub_exp(dto.getSub_exp());
		sdto.setSub_name(dto.getSub_name());
		sdto.setSub_time(dto.getSub_time());

		boolean isc = service.insertSubject(dto);
		return isc ? "redirect:/sublist.do" : "redirect:/iSubjectform.do";

	}

	@RequestMapping(value = "/delSub.do", method = RequestMethod.POST)
	public String deleteSubject(String sub_code) {
		logger.info("deleteSubject,{}");
		boolean isc = service.deleteSubject(sub_code);
		return isc ? "redirect:/sublist.do" : "redirect:/sijak.do";
	}

	@RequestMapping(value = "/modfycouform.do", method = RequestMethod.GET)
	public String modfy_couform(Model model, String cou_code) {
		Course_Dto coudto = service.detailCourse(cou_code);
		logger.info("modfy_cou,{}", cou_code);
		model.addAttribute("coudto", coudto);
		return "modfycouform";
	}

	@RequestMapping(value = "/modfycou.do", method = RequestMethod.POST)
	public String modfy_cou(Course_Dto dto,Teacher_Dto tdto) {
		Course_Dto Cdto = new Course_Dto();
		
		Cdto.setCou_code( dto.getCou_code());
		Cdto.setCou_name(dto.getCou_name());
		Cdto.setTea_id(tdto.getTea_id());
		Cdto.setStartdate(dto.getStartdate());
		Cdto.setCou_exp(dto.getCou_exp());

		boolean isc = service.wupdateCourse(Cdto);
		return isc ? "redirect:/wselCourse.do" : "redirect:/modfycouform.do";
	}
}