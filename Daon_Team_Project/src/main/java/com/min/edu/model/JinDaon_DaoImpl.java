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
import com.min.edu.dtos.Student_Dto;
import com.min.edu.dtos.Subject_Dto;

@Repository
public class JinDaon_DaoImpl implements JinDaon_IDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	private final String NS = "com.min.edu.model.JinDaon_DaoImpl.jingu.";

	// 과정 복사
	@Override
	public List<Course_Dto> selCopy(String cou_name) {
		// TODO Auto-generated method stub
		return null;
	}

	// 과정 생성
	@Override
	public boolean insertCourse(Course_Dto dto) {

		int i = sqlSession.insert(NS + "insertCourse", dto);
		return i > 0 ? true : false;
	}

	// 과정 삭제
	@Override
	public boolean deleteCourse(String cou_code) {
		int d = sqlSession.delete(NS + "deleteCourse", cou_code);
		return d > 0 ? true : false;
	}

	// 예정 과정 수정
	@Override
	public boolean wupdateCourse(Course_Dto dto) {
		int u = sqlSession.update(NS + "wupdateCourse", dto);
		return u > 0 ? true : false;
	}

	// 과정에속한 학생 조회
	@Override
	public List<Student_Dto> courseinStusel(String cou_code) {
		return sqlSession.selectList(NS + "courseinStusel", cou_code);
	}

// 현재 과정 조회
	@Override
	public List<Course_Dto> iselCourse(Map<String, String> map) {

		return sqlSession.selectList(NS + "iselCourse", map);
	}

// 종료 과정 조회
	@Override
	public List<Course_Dto> bselCourse(Map<String, String> map) {

		return sqlSession.selectList(NS + "bselCourse", map);
	}

// 예정 과정 조회
	@Override
	public List<Course_Dto> wselCourse(Map<String, String> map) {

		return sqlSession.selectList(NS + "wselCourse", map);
	}

// 과정 상세 조회
	@Override
	public Course_Dto detailCourse(String cou_code) {

		return sqlSession.selectOne(NS + "detailCourse", cou_code);
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
		int i = sqlSession.insert(NS + "insertSubject", dto);
		return i > 0 ? true : false;
	}

// 과목조회
	@Override
	public List<Subject_Dto> selSubject(Map<String, String> map) {

		return sqlSession.selectList(NS + "selSubject", map);
	}

// 과목 상세 조회
	@Override
	public Subject_Dto detailSubject(String sub_code) {
		return sqlSession.selectOne(NS + "detailSubject", sub_code);
	}

//과목 수정
	@Override
	public boolean updateSubject(Subject_Dto dto) {
		int i = sqlSession.update(NS + "updateSubject", dto);
		return i > 0 ? true : false;
	}

//과목 삭제
	@Override
	public boolean deleteSubject(String sub_code) {
		int d = sqlSession.delete(NS + "deleteSubject", sub_code);
		return d > 0 ? true : false;
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
