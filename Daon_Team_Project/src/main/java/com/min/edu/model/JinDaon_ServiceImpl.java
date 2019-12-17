package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Curriculum_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.dtos.StuAvgSel_Dto;
import com.min.edu.dtos.StuCouSel_Dto;
import com.min.edu.dtos.StuCou_Dto;
import com.min.edu.dtos.Subject_Dto;

@Service
public class JinDaon_ServiceImpl implements JinDaon_IService {

	@Autowired
	private JinDaon_IDao dao;
	
	private Logger logger = LoggerFactory.getLogger(JinDaon_ServiceImpl.class);
	
	//과정복사
	@Override
	public List<Course_Dto> selCopy(String cou_name) {
		logger.info("selCopy 과정 복사, {}",cou_name);
		return dao.selCopy(cou_name);
	}

	//과정생성
	@Override
	public boolean insertCourse(Course_Dto dto) {
		logger.info("insertCourse 과정 생성, {}",dto);
		return dao.insertCourse(dto);
	}

	//현재 과정 조회
	@Override
	public List<Course_Dto> iselCourse(Paging_Dto dto) {
		logger.info("iselCourse 현재 과정 조회, {}",dto);
		return dao.iselCourse(dto);
	}

	//과정 상세 조회
	@Override
	public List<Course_Dto> detailCourse(String cou_code) {
		logger.info("detailCourse 과정 상세 조회, {}",cou_code);
		return dao.detailCourse(cou_code);
	}

	//학생의 현재 과정 조회
	@Override
	public List<StuCouSel_Dto> stuiselCourse(String stu_id) {
		logger.info("stuiselCourse 학생의 현재 과정 조회, {}",stu_id);
		return dao.stuiselCourse(stu_id);
	}

	//과정에 학생 등록
	@Override
	public boolean studentCourse(StuCou_Dto dto) {
		logger.info("studentCourse 과정에 학생 등록, {}",dto);
		return dao.studentCourse(dto);
	}

	//과목 등록
	@Override
	public boolean insertSubject(Subject_Dto dto) {
		logger.info("insertSubject 과목 등록, {}",dto);
		return dao.insertSubject(dto);
	}

	//과목 조회
	@Override
	public List<Subject_Dto> selSubject(Paging_Dto dto) {
		logger.info("selSubject 과목 조회, {}",dto);
		return dao.selSubject(dto);
	}

	//과목 상세조회
	@Override
	public Subject_Dto detailSubject(String sub_code) {
		logger.info("detailSubject 과목 상세조회, {}",sub_code);
		return dao.detailSubject(sub_code);
	}

	//커리큘럼 등록
	@Override
	public boolean insertCurriculum(Curriculum_Dto dto) {
		logger.info("insertCurriculum 커리큘럼 등록, {}",dto);
		return dao.insertCurriculum(dto);
	}

	//학생의 커리큘럼 조회
	@Override
	public List<StuAvgSel_Dto> stuselCurriculu(Map<String, String> map) {
		logger.info("stuselCurriculu 학생의 커리큘럼 조회, {}",map);
		return dao.stuselCurriculu(map);
	}

}
