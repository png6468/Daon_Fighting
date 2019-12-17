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

public class JinDaon_ServiceImpl implements JinDaon_IService {

	@Override
	public List<Course_Dto> selCopy(String cou_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCourse(Course_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course_Dto> iselCourse(Paging_Dto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> detailCourse(String cou_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StuCouSel_Dto> stuiselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean studentCourse(StuCou_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertSubject(Subject_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Subject_Dto> selSubject(Paging_Dto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject_Dto detailSubject(String sub_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCurriculum(Curriculum_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StuAvgSel_Dto> stuselCurriculu(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
