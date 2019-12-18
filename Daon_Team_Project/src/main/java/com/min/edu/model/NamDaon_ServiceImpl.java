package com.min.edu.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.SelectSel_Dto;

@Service
public class NamDaon_ServiceImpl implements NamDaon_IService {

	@Autowired
	private NamDaon_IDao dao;
	
	private Logger logger = LoggerFactory.getLogger(NamDaon_ServiceImpl.class);
	
	@Override
	public List<SelectSel_Dto> gaekExasel(String cur_code) {
		logger.info("gaekExasel 실행!!");
		return dao.gaekExasel(cur_code);
	}

	@Override
	public List<DescPortSel_Dto> sesulExasel(String cur_code) {
		logger.info("sesulExasel 실행!!");
		return dao.sesulExasel(cur_code);
	}

}
