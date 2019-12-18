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
	public List<String> searchsel1(Map<Object, Object> map) {
		List<String> list = dao.searchsel1(map);
		return list;
	}

	@Override
	public List<ExamSelect_Dto> searchsel2(Map<Object, Object> map) {
		
		return dao.searchsel2(map);
	}

	@Override
	public List<String> searchdes1(Map<Object, Object> map) {
		List<String> list = dao.searchdes1(map);
		return list;
	}

	@Override
	public List<ExamDesc_Dto> searchdes2(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.searchdes2(map);
	}

	@Override
	public List<String> searchport1(Map<Object, Object> map) {
		List<String> list = dao.searchport1(map);
		return list;
	}

	@Override
	public List<ExamDesc_Dto> searchport2(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.searchport2(map);
	}
	
	
	

}
