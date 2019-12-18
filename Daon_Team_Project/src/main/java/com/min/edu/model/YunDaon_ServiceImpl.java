package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.YunController;
import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;

@Service
public class YunDaon_ServiceImpl implements YunDaon_IService {

	@Autowired
	private YunDaon_IDao dao;

	
	@Override
	public List<String> subGaekallsel(Map<Object, Object> map) {
		List<String> list = dao.subGaekallsel(map);
		return list;
	}

	@Override
	public List<ExamSelect_Dto> gaekListsel(Map<Object, Object> map) {
		
		return dao.gaekListsel(map);
	}

	@Override
	public List<String> subSesulallsel(Map<Object, Object> map) {
		List<String> list = dao.subSesulallsel(map);
		return list;
	}

	@Override
	public List<ExamDesc_Dto> sesulListsel(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.sesulListsel(map);
	}

	@Override
	public List<String> subPoexaallsel(Map<Object, Object> map) {
		List<String> list = dao.subPoexaallsel(map);
		return list;
	}

	@Override
	public List<ExamDesc_Dto> popolListsel(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.popolListsel(map);
	}
	
	
	

}
