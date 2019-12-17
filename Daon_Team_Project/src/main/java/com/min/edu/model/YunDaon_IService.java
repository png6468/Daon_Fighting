package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.ExamSelect_Dto;

public interface YunDaon_IService {

	
	public List<String> searchsel1(Map<Object, Object> map);
	public List<ExamSelect_Dto> searchsel2(Map<Object, Object> map2);
	
}
