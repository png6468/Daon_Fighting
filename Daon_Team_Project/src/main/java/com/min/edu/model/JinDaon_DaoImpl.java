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

//		int i = sqlSession.insert(NS + "insertCourse", dto);
//		return i > 0 ? true : false;
			return false;
	}

	// 과정 삭제
	@Override
	public boolean deleteCourse(String cou_code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wupdateCourse(Course_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StuCou_Dto> courseinStusel(String cou_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> iselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> bselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> wselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course_Dto detailCourse(String cou_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> teaiselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> teabselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> teawselCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> stuiselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> stubselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course_Dto> stuwselCourse(String stu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean studentCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertSubject(Subject_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Subject_Dto> selSubject(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject_Dto detailSubject(String sub_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateSubject(Subject_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSubject(Map<String, String> map) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertCurriculum(Curriculum_Dto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Curriculum_Dto> adminselCurriculum(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curriculum_Dto> teaselCurriculum(String cou_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curriculum_Dto> stuselCurriculum(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCurriculum(String cur_code) {
		// TODO Auto-generated method stub
		return false;
	}

}
