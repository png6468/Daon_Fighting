package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;

public interface YunDaon_IService {

	
	public List<String> subGaekallsel(Map<Object, Object> map);
	public List<ExamSelect_Dto> gaekListsel(Map<Object, Object> map2);
	public List<ExamDesc_Dto> popolListsel(Map<Object, Object> map);
	public List<String> subPoexaallsel(Map<Object, Object> map);
	public List<ExamDesc_Dto> sesulListsel(Map<Object, Object> map);
	public List<String> subSesulallsel(Map<Object, Object> map);
	public String filename();
	
}
