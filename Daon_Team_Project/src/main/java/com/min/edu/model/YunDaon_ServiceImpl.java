package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.YunController;
import com.min.edu.dtos.ExamSelect_Dto;

@Service
public class YunDaon_ServiceImpl implements YunDaon_IService {

	@Autowired
	private YunDaon_IDao dao;

	private final Logger logger = LoggerFactory.getLogger(YunDaon_ServiceImpl.class);
	
	@Override
	public List<String> searchsel1(Map<Object, Object> map) {
		logger.info("여기 나오니");
		List<String> list = dao.searchsel1(map);
		return list;
	}

	@Override
	public List<ExamSelect_Dto> searchsel2(Map<Object, Object> map) {
		
		return dao.searchsel2(map);
	}
	
	
	

}
