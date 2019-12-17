package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;

public interface YunDaon_IService {

	
	public List<String> searchsel1(Map<Object, Object> map);
	public List<ExamSelect_Dto> searchsel2(Map<Object, Object> map2);
	List<ExamDesc_Dto> searchport2(Map<Object, Object> map);
	List<String> searchport1(Map<Object, Object> map);
	List<ExamDesc_Dto> searchdes2(Map<Object, Object> map);
	List<String> searchdes1(Map<Object, Object> map);
	
}
