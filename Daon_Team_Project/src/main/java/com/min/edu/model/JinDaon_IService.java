package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Curriculum_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.dtos.StuAvgSel_Dto;
import com.min.edu.dtos.StuCouSel_Dto;
import com.min.edu.dtos.StuCou_Dto;
import com.min.edu.dtos.Subject_Dto;

public interface JinDaon_IService {

	//현재 과정 조회
	public List<Course_Dto> iselCourse(Map<String, String> map);
	//과정 상세 조회
	public List<Course_Dto> detailCourse(String cou_code);
	// 학생의 현재 과정조회
	public List<StuCouSel_Dto> stuiselCourse(String stu_id);
	// 과목조회
	public List<Subject_Dto> selSubject(Paging_Dto dto);
	// 과목 상세조회
	public Subject_Dto detailSubject(String sub_code);
	// 학생의 커리큘럼 조회
	public List<StuAvgSel_Dto> stuselCurriculu(Map<String, String> map);
}
