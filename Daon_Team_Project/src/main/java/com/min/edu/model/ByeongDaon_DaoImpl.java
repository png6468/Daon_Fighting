package com.min.edu.model;

import java.util.List;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.min.edu.dtos.Admin_Dto;

@Repository
public class ByeongDaon_DaoImpl implements ByeongDaon_IDao {

	@Autowired
	private SqlSessionTemplate session;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private Logger log = LoggerFactory.getLogger(ByeongDaon_DaoImpl.class);
	private final String ns = "com.min.edu.model.ByeongDaon_DaoImpl.byeong.";
	
	@Override
	public String aidCheck(String adm_id) {
		String idcheck = session.selectOne(ns+"aidCheck", adm_id);
		return idcheck;
	}

	@Override
	public Admin_Dto loginAdbsame(Map<String, String> map) {
		Admin_Dto dto = session.selectOne(ns+"loginAdbsame", map);
		return dto;
	}

	@Override
	public Admin_Dto admDetailsel(String adm_id) {
		Admin_Dto dto = session.selectOne(ns+"admDetailsel", adm_id);
		return dto;
	}

	@Override
	public List<Admin_Dto> admAllselect() {
		List<Admin_Dto> lists = session.selectList(ns+"admAllselect");
		return lists;
	}
	
	@Override
	public boolean admdbSave(Admin_Dto dto) {
		String enPassword = passwordEncoder.encode(dto.getAdm_pw());
		dto.setAdm_pw(enPassword);
		int cnt = session.insert(ns+"admdbSave", dto);
		return cnt==1?true:false;
		
	}

}
