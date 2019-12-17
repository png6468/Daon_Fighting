package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.Admin_Dto;

public interface ByeongDaon_IService {

	public String idCheckAdmin(String adm_id);
	public Admin_Dto login_Admin(Map<String, String> map);
	public Admin_Dto myPageAdmin(String adm_id);
	public List<Admin_Dto> allAdmin();
}
