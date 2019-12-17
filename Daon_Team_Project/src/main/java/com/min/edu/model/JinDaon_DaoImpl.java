package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Curriculum_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.dtos.StuAvgSel_Dto;
import com.min.edu.dtos.StuCouSel_Dto;
import com.min.edu.dtos.StuCou_Dto;
import com.min.edu.dtos.Subject_Dto;

@Repository
public class JinDaon_DaoImpl implements JinDaon_IDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String NS="com.min.edu.model.JinDaon_DaoImpl.jingu.";
	
	//과정 복사
	@Override
	public List<Course_Dto> selCopy(String cou_name) {
		return sqlSession.selectList(NS+"selCopy", cou_name);
	}

	//과정 생성
	@Override
	public boolean insertCourse(Course_Dto dto) {
		int cnt = sqlSession.insert(NS+"insertCourse", dto);
		return cnt>0?true:false;
	}

	//현재 과정 조회
	@Override
	public List<Course_Dto> iselCourse(Paging_Dto dto) {
		return sqlSession.selectList(NS+"iselCourse", dto);
	}

	//과정상세조회
	@Override
	public List<Course_Dto> detailCourse(String cou_code) {
		return sqlSession.selectList(NS+"detailCourse", cou_code);
	}

	//학생의 현재과정 조회
	@Override
	public List<StuCouSel_Dto> stuiselCourse(String stu_id) {
		return sqlSession.selectList(NS+"stuiselCourse", stu_id);
	}

	//과정에 학생 등록
	@Override
	public boolean studentCourse(StuCou_Dto dto) {
		int cnt = sqlSession.insert(NS+"studentCourse", dto);
		return cnt>0?true:false;
	}

	//과목 등록
	@Override
	public boolean insertSubject(Subject_Dto dto) {
		int cnt = sqlSession.insert(NS+"insertSubject", dto);
		return cnt>0?true:false;
	}

	//과목 조회
	@Override
	public List<Subject_Dto> selSubject(Paging_Dto dto) {
		return sqlSession.selectList(NS+"selSubject", dto);
	}

	//과목 상세 조회
	@Override
	public Subject_Dto detailSubject(String sub_code) {
		return sqlSession.selectOne(NS+"detailSubject", sub_code);
	}

	//커리큘럼 등록
	@Override
	public boolean insertCurriculum(Curriculum_Dto dto) {
		int cnt = sqlSession.insert(NS+"insertCurriculum", dto);
		return cnt>0?true:false;
	}

	//학생의 커리큘럼 조회
	@Override
	public List<StuAvgSel_Dto> stuselCurriculu(Map<String, String> map) {
		return sqlSession.selectList(NS+"stuselCurriculu", map);
	}

}
