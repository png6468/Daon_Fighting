package com.min.edu.model;

import java.util.Map;

import com.min.edu.dtos.AnswerScore_Dto;
import com.min.edu.dtos.DescPortSel_Dto;

public interface WanDaon_IService {

	public DescPortSel_Dto  sesulExasel(String cur_code);
	public DescPortSel_Dto popolExasel(String cur_code);
	public int gaekAutochae(Map<String, String> map);
	public AnswerScore_Dto answerSsp(Map<String, String> map);
	public AnswerScore_Dto chaeHightjumsu(Map<String, String> map);
	public int sepoDabchae(AnswerScore_Dto dto);
}
