package com.min.edu.model;

import java.util.List;

import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.SelectSel_Dto;

public interface NamDaon_IService {

	public List<SelectSel_Dto> gaekExasel(String cur_code);
	public List<DescPortSel_Dto> sesulExasel(String cur_code);
}
