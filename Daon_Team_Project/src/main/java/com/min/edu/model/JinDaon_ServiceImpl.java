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
import com.min.edu.dtos.Student_Dto;
import com.min.edu.dtos.Subject_Dto;

@Service
public class JinDaon_ServiceImpl implements JinDaon_IService {

	@Autowired
	private JinDaon_IDao dao;

	private Logger logger = LoggerFactory.getLogger(JinDaon_ServiceImpl.class);

	// 과정 복사
	@Override
	public List<Course_Dto> selCopy(String cou_name) {
		// TODO Auto-generated method stub
		return null;
	}

	// 과정 생성
	@Override
	public boolean insertCourse(Course_Dto dto) {

		logger.info("insertCourse과정생성,{}", dto);
		return dao.insertCourse(dto);
	
	}

	// 과정 삭제
	@Override
	public boolean deleteCourse(String cou_code) {
		// TODO Auto-generated method stub
		return false;
	}
	// 예정 과정 수정
	@Override
	public boolean wupdateCourse(Course_Dto dto) {
		
		return false;
	}
	// 과정에속한 학생 조회
	@Override
	public List<Student_Dto> courseinStusel(String cou_code) {
		logger.info("과정에속한 학생 조회,{}",cou_code);
	
		return dao.courseinStusel(cou_code);
	}
// 현재 과정 조회
	@Override
	public List<Course_Dto> iselCourse(Map<String, String> map) {
		logger.info("현재과정 조회,{}",map);
		return dao.iselCourse(map);
	}
// 종료 과정 조회
	@Override
	public List<Course_Dto> bselCourse(Map<String, String> map) {
		logger.info("종료과정 조회, {}",map);
		return dao.bselCourse(map);
	}
// 예정 과정 조회
	@Override
	public List<Course_Dto> wselCourse(Map<String, String> map) {
		logger.info("예정 과정 조회,{}",map);
		return dao.wselCourse(map);
	}
// 과정 상세 조회
	@Override
	public Course_Dto detailCourse(String cou_code) {
		logger.info("과정 상세조회,{}",cou_code);
		return dao.detailCourse(cou_code);
	}
//강사 현재 과정 조회
	@Override
	public List<Course_Dto> teaiselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}
//강사 종료 과저 조회
	@Override
	public List<Course_Dto> teabselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}
// 강사 예정 과정 조회
	@Override
	public List<Course_Dto> teawselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}
//학생 현재과정 조회
	@Override
	public List<Course_Dto> stuiselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}
//학샹 종료과정 조회
	@Override
	public List<Course_Dto> stubselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}
//학생 예정 과정 조회
	@Override
	public List<Course_Dto> stuwselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}
//과정 + 학생 등록
	@Override
	public boolean studentCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return false;
	}
// 과목 등록
	@Override
	public boolean insertSubject(Subject_Dto dto) {
		logger.info("과목 등록,{}",dto);
		return dao.insertSubject(dto);
	}
// 과목조회
	@Override
	public List<Subject_Dto> selSubject(Map<String, String> map) {
		logger.info("과목조회,{}",map);
		return dao.selSubject(map);
	}
// 과목 상세 조회
	@Override
	public Subject_Dto detailSubject(String sub_code) {
		logger.info("과목 상세 조회,{}",sub_code);
		return dao.detailSubject(sub_code);
	}
//과목 수정
	@Override
	public boolean updateSubject(Subject_Dto dto) {
		logger.info("과목수정,{}",dto);
		return dao.updateSubject(dto);
	}
//과목 삭제
	@Override
	public boolean deleteSubject(Map<String, String> map) {
		// TODO Auto-generated method stub
		return false;
	}
// 커리큘롬 등록
	@Override
	public boolean insertCurriculum(Curriculum_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}
// 커리큘롬 조회(관리자)
	@Override
	public List<Curriculum_Dto> adminselCurriculum(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}
// 커리큘럼 조회(강사)
	@Override
	public List<Curriculum_Dto> teaselCurriculum(String cou_code) {
		// TODO Auto-generated method stub
		return null;
	}
// 커리큘럼 조회(학생)
	@Override
	public List<Curriculum_Dto> stuselCurriculum(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}
//커리뮬럼 삭제
	@Override
	public boolean deleteCurriculum(String cur_code) {
		// TODO Auto-generated method stub
		return false;
	}

}
