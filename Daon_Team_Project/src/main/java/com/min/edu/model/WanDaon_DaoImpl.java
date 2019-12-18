package com.min.edu.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WanDaon_DaoImpl implements WanDaon_IDao {

	
	private final Logger logger = LoggerFactory.getLogger(YunDaon_DaoImpl.class);
	private final String ns = "com.min.edu.model.WanDaon_DaoImpl.wanjong.";
	
	@Autowired
	private SqlSessionTemplate session;
	
	
}
