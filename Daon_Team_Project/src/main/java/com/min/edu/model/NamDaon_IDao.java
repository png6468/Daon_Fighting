package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.SelectSel_Dto;

public interface NamDaon_IDao {

	public List<SelectSel_Dto> gaekExasel(Map<Object, Object> cur_code);
	public List<DescPortSel_Dto> sesulExasel(Map<Object, Object> cur_code);
	
}
