package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dtos.Admin_Dto;

@Repository
public class ByeongDaon_DaoImpl implements ByeongDaon_IDao {

	@Autowired
	private SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(ByeongDaon_DaoImpl.class);
	private final String ns = "com.min.edu.model.ByeongDaon_DaoImpl.byeong.";
	
	@Override
	public String idCheckAdmin(String adm_id) {
		String idcheck = session.selectOne(ns+"idCheckAdmin", adm_id);
		return idcheck;
	}

	@Override
	public Admin_Dto login_Admin(Map<String, String> map) {
		Admin_Dto dto = session.selectOne(ns+"login_Admin", map);
		return dto;
	}

	@Override
	public Admin_Dto myPageAdmin(String adm_id) {
		Admin_Dto dto = session.selectOne(ns+"myPageAdmin", adm_id);
		return dto;
	}

	@Override
	public List<Admin_Dto> allAdmin() {
		List<Admin_Dto> lists = session.selectList(ns+"allAdmin");
		return lists;
	}

	
}
