package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dtos.AnswerScore_Dto;
import com.min.edu.dtos.DescPortSel_Dto;
@Service
public class WanDaon_ServiceImpl implements WanDaon_IService {

	@Autowired
	private WanDaon_IDao dao;
	
	@Override
	public List<DescPortSel_Dto> sesulExasel(String cur_code) {
		List<DescPortSel_Dto> lists = (List<DescPortSel_Dto>) dao.sesulExasel(cur_code);
		return lists;
	}

	@Override
	public List<DescPortSel_Dto> popolExasel(String cur_code) {
		List<DescPortSel_Dto> lists =(List<DescPortSel_Dto>) dao.popolExasel(cur_code);
		return lists;
	}

	@Override
	public boolean gaekAutochae(Map<String, String> map) {
		int n =dao.gaekAutochae(map);
		return n>0?true:false;
	}

	@Override
	public AnswerScore_Dto answerSsp(Map<String, String> map) {
		AnswerScore_Dto dto =dao.answerSsp(map);
		return dto;
	}

	@Override
	public AnswerScore_Dto chaeHightjumsu(Map<String, String> map) {
		AnswerScore_Dto dto =dao.chaeHightjumsu(map);
		return dto;
	}

	@Override
	public boolean sepoDabchae(AnswerScore_Dto dto) {
		int n =dao.sepoDabchae(dto);
		return n>0?true:false;
	}

}
