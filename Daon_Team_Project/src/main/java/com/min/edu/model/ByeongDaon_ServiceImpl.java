package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dtos.Admin_Dto;

@Service
public class ByeongDaon_ServiceImpl implements ByeongDaon_IService {

	@Autowired
	private ByeongDaon_IDao dao;
	
	@Override
	public String aidCheck(String adm_id) {
		// TODO Auto-generated method stub
		return dao.aidCheck(adm_id);
	}

	@Override
	public Admin_Dto loginAdbsame(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.loginAdbsame(map);
	}

	@Override
	public Admin_Dto admDetailsel(String adm_id) {
		// TODO Auto-generated method stub
		return dao.admDetailsel(adm_id);
	}

	@Override
	public List<Admin_Dto> admAllselect() {
		// TODO Auto-generated method stub
		return dao.admAllselect();
	}
	
	@Override
	public boolean admdbSave(Admin_Dto dto) {
		return dao.admdbSave(dto);
	}

}
