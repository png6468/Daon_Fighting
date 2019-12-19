package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.Admin_Dto;

public interface ByeongDaon_IService {

	public String aidCheck(String adm_id);
	public Admin_Dto loginAdbsame(Map<String, String> map);
	public Admin_Dto admDetailsel(String adm_id);
	public List<Admin_Dto> admAllselect();
	public boolean admdbSave(Admin_Dto dto);
}
