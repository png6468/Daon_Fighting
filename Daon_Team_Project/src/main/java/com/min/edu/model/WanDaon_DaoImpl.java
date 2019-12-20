package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dtos.AnswerScore_Dto;
import com.min.edu.dtos.DescPortSel_Dto;

@Repository
public class WanDaon_DaoImpl implements WanDaon_IDao {

	
	private final Logger logger = LoggerFactory.getLogger(YunDaon_DaoImpl.class);
	private final String NS = "com.min.edu.model.WanDaon_DaoImpl.wanjong.";
	
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public List<DescPortSel_Dto> sesulExasel(String cur_code) {
		logger.info("sesulExasel 서술형 문제 조회!!");
		List<DescPortSel_Dto> lists = session.selectList(NS+"sesulExasel", cur_code);
		return lists;
	}

	@Override
	public List<DescPortSel_Dto> popolExasel(String cur_code) {
		logger.info("popolExasel 포트폴리오 문제 조회!!");
		List<DescPortSel_Dto> lists=session.selectList(NS+"popolExasel", cur_code);
		return lists;
	}

	@Override
	public int gaekAutochae(Map<String, String> map) {
		logger.info("gaekAutochae 객관식 자동 채점!!");
		 int n = session.update(NS+"gaekAutochae", map);
		return n;
	}

	@Override
	public AnswerScore_Dto answerSsp(Map<String, String> map) {
		logger.info("answerSsp 학생의정답조회 주관식/포폴!!");
		return (AnswerScore_Dto) session.selectList(NS+"answerSsp", map);
		
	}

	@Override
	public AnswerScore_Dto chaeHightjumsu(Map<String, String> map) {
		logger.info("chaeHightjumsu 채점시 들어갈수있는 최고점점수 조회!!");
		return (AnswerScore_Dto) session.selectList(NS+"chaeHightjumsu", map);
	}

	@Override
	public int sepoDabchae(AnswerScore_Dto dto) {
		logger.info("sepoDabchae 서/포 문제 채점!!");
		int n =session.update(NS+"sepoDabchae", dto);
		return n;
	}
	
	
}
