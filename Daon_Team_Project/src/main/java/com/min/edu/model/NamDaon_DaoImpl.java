package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.SelectSel_Dto;

@Repository
public class NamDaon_DaoImpl implements NamDaon_IDao {

	@Autowired
	private SqlSessionTemplate sqlsession;
	
	private final String NS="com.min.edu.model.NamDaon_DaoImpl.namgyu.";
	
	@Override
	public List<SelectSel_Dto> gaekExasel(Map<Object, Object> cur_code) {
		return sqlsession.selectList(NS+"gaekExasel", cur_code);
	}

	@Override
	public List<DescPortSel_Dto> sesulExasel(Map<Object, Object> cur_code) {
		return sqlsession.selectList(NS+"sesulExasel", cur_code);
	}

	
	
	
}
