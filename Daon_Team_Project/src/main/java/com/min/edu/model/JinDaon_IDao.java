package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.Course_Dto;
import com.min.edu.dtos.Curriculum_Dto;
import com.min.edu.dtos.Paging_Dto;
import com.min.edu.dtos.StuAvgSel_Dto;
import com.min.edu.dtos.StuCouSel_Dto;
import com.min.edu.dtos.StuCou_Dto;
import com.min.edu.dtos.Student_Dto;
import com.min.edu.dtos.Subject_Dto;

public interface JinDaon_IDao {

	// 과정 복사
	public List<Course_Dto> selCopy(String cou_name); 	
	// 과정 생성
	public boolean insertCourse(Course_Dto dto); 
	// 과정 삭제
	public boolean deleteCourse(String cou_code);
	// 예정 과정  수정
	public boolean wupdateCourse(Course_Dto dto);
	// 과정에 속한 학생 조회
	public List<Student_Dto> courseinStusel(String cou_code);
	//현재 과정 조회
	public List<Course_Dto> iselCourse(Map<String, String> map);
	//종료 과정 조회
	public List<Course_Dto> bselCourse(Map<String, String> map);
	//예정 과정 조회
	public List<Course_Dto> wselCourse(Map<String, String> map);
	// 과정 상세 조회
	public Course_Dto detailCourse(String cou_code);	
	// 강사 현재 과정 조회
	public List<Course_Dto> teaiselCourse(Map<String, String> map);
	// 강사 종료 과정 조회
	public List<Course_Dto> teabselCourse(Map<String, String> map);
	// 강사 예정 과정 조회
	public List<Course_Dto> teawselCourse(Map<String, String> map);
	// 학생 현재 과정 조회
	public List<Course_Dto> stuiselCourse(String stu_id);
	// 학생 종료 과정 조회
	public List<Course_Dto> stubselCourse(String stu_id);
	// 학생 예정 과정 조회
	public List<Course_Dto> stuwselCourse(String stu_id);
	// 과정에 속한 학생 등록
	public boolean studentCourse(Map<String, String> map);
	// 과목 등록
	public boolean insertSubject(Subject_Dto dto);
	//과목 조회
	public List<Subject_Dto> selSubject(Map<String, String> map);
	// 과목 상세 조회
	public Subject_Dto detailSubject(String sub_code);
	// 과목 수정
	public boolean updateSubject(Subject_Dto dto);
	// 과목 삭제
	public boolean deleteSubject(Map<String, String> map);
	// 커리큘럼 등록
	public boolean insertCurriculum(Curriculum_Dto dto);
	//커리큘럼 조회(관리자)
	public List<Curriculum_Dto> adminselCurriculum(Map<String, String> map);
	//커리큘럼 조회 (강사)
	public List<Curriculum_Dto> teaselCurriculum(String cou_code);
	//커리큘럼 조회(학생)
	public List<Curriculum_Dto> stuselCurriculum(Map<String, String> map);
	//커리큘럼 삭제
	public boolean deleteCurriculum(String cur_code);


}
