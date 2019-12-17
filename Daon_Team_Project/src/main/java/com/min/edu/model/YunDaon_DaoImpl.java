package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.YunController;
import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;

@Repository
public class YunDaon_DaoImpl implements YunDaon_IDao {

	private final Logger logger = LoggerFactory.getLogger(YunDaon_DaoImpl.class);
	private final String ns = "com.min.edu.model.YunDaon_DaoImpl.yunwoo.";
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<String> searchsel1(Map<Object, Object> map) {
		logger.info("커리큘럼이 선택되 있다는 가정하에서 문제 리스트 선택1 {}", map);
		List<String> munlist = session.selectList(ns+"searchsel1", map);
		return munlist;
	}
	@Override
	public List<ExamSelect_Dto> searchsel2(Map<Object, Object> map) {
		logger.info("커리큘럼이 선택되 있다는 가정하에서 문제 상세 정보1");
		List<ExamSelect_Dto> lists = session.selectList(ns+"searchsel2", map);
		
		return lists;
	}
	@Override
	public List<String> searchdes1(Map<Object, Object> map) {
		logger.info("야 자슥아 여기는 들르는거 맞냐?!! {}", map);
		List<String> munlist = session.selectList(ns+"searchdes1", map);
		return munlist;
	}
	@Override
	public List<ExamDesc_Dto> searchdes2(Map<Object, Object> map) {
		logger.info("여기 확실히 들러????");
		List<ExamDesc_Dto> lists = session.selectList(ns+"searchdes2", map);
		
		return lists;
	}
	@Override
	public List<String> searchport1(Map<Object, Object> map) {
		logger.info("이거슨 포폴이다 커리큘럼이 선택되 있다는 가정하에서 문제 리스트 선택3 {}", map);
		List<String> munlist = session.selectList(ns+"searchport1", map);
		return munlist;
	}
	@Override
	public List<ExamDesc_Dto> searchport2(Map<Object, Object> map) {
		logger.info("포폴문제 조회 페이징");
		List<ExamDesc_Dto> lists = session.selectList(ns+"searchport2", map);
		
		return lists;
	}
	
	

	

}
