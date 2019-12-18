package com.min.edu.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.min.edu.dtos.AnswerScore_Dto;
import com.min.edu.dtos.DescPortSel_Dto;

public class WanDaon_ServiceImpl implements WanDaon_IService {

	@Autowired
	private WanDaon_IDao dao;
	
	@Override
	public DescPortSel_Dto sesulExasel(String cur_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DescPortSel_Dto popolExasel(String cur_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int gaekAutochae(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AnswerScore_Dto answerSsp(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerScore_Dto chaeHightjumsu(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sepoDabchae(AnswerScore_Dto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
