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
	public String idCheckAdmin(String adm_id) {
		// TODO Auto-generated method stub
		return dao.idCheckAdmin(adm_id);
	}

	@Override
	public Admin_Dto login_Admin(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.login_Admin(map);
	}

	@Override
	public Admin_Dto myPageAdmin(String adm_id) {
		// TODO Auto-generated method stub
		return dao.myPageAdmin(adm_id);
	}

	@Override
	public List<Admin_Dto> allAdmin() {
		// TODO Auto-generated method stub
		return dao.allAdmin();
	}

}
