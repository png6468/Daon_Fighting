package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.YunController;
import com.min.edu.dtos.CurExa_Dto;
import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;

@Repository
public class YunDaon_DaoImpl implements YunDaon_IDao {

	private final Logger logger = LoggerFactory.getLogger(YunDaon_DaoImpl.class);
	private final String ns = "com.min.edu.model.YunDaon_DaoImpl.yunwoo.";
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<String> subGaekallsel(Map<Object, Object> map) {
		logger.info("커리큘럼이 선택되 있다는 가정하에서 문제 리스트 선택1 {}", map);
		List<String> munlist = session.selectList(ns+"subGaekallsel", map);
		return munlist;
	}
	@Override
	public List<ExamSelect_Dto> gaekListsel(Map<Object, Object> map) {
		logger.info("커리큘럼이 선택되 있다는 가정하에서 문제 상세 정보1");
		List<ExamSelect_Dto> lists = session.selectList(ns+"gaekListsel", map);
		
		return lists;
	}
	@Override
	public List<String> subSesulallsel(Map<Object, Object> map) {
		logger.info("야 자슥아 여기는 들르는거 맞냐?!! {}", map);
		List<String> munlist = session.selectList(ns+"subSesulallsel", map);
		return munlist;
	}
	@Override
	public List<ExamDesc_Dto> sesulListsel(Map<Object, Object> map) {
		logger.info("여기 확실히 들러????");
		List<ExamDesc_Dto> lists = session.selectList(ns+"sesulListsel", map);
		
		return lists;
	}
	@Override
	public List<String> subPoexaallsel(Map<Object, Object> map) {
		logger.info("이거슨 포폴이다 커리큘럼이 선택되 있다는 가정하에서 문제 리스트 선택3 {}", map);
		List<String> munlist = session.selectList(ns+"subPoexaallsel", map);
		return munlist;
	}
	@Override
	public List<ExamDesc_Dto> popolListsel(Map<Object, Object> map) {
		logger.info("포폴문제 조회 페이징");
		List<ExamDesc_Dto> lists = session.selectList(ns+"popolListsel", map);
		
		return lists;
	}
	@Override
	public String filename() {
		logger.info("업로드 될 파일 이름");
		return session.selectOne(ns+"filename");
	}
	@Override
	public boolean copyinsert(CurExa_Dto dto) {
		logger.info("복사된 문제를 시험에 입력");
		int n = session.insert(ns+"copyinsert", dto);
		return n>0?true:false;
	}
	@Override
	public boolean curexaDelete(CurExa_Dto dto) {
		logger.info("문제를 시험에서 삭제");
		int n = session.delete(ns+"curexaDelete", dto);
		return n>0?true:false;
	}
	@Override
	public boolean deldefault(String cur_code) {
		// TODO Auto-generated method stub
		logger.info("초기시험점수가 0점인 것을 위해 만들어 둔 연결 제거");
		int n = session.delete(ns+"deldefault", cur_code);
		return n>0?true:false;
	}
	@Override
	public boolean addExagaek() {
		// TODO Auto-generated method stub
		logger.info("객관식 유형 문제 추가");
		int n = session.insert(ns+"addExagaek");
		return n>0?true:false;
	}
	@Override
	public boolean gaekExacontents(ExamSelect_Dto dto) {
		// TODO Auto-generated method stub
		logger.info("객관식 문제의 내용 추가");
		int n = session.insert(ns+"gaekExacontents", dto);
		return n>0?true:false;
	}
	@Override
	public boolean curGaekexa(CurExa_Dto dto) {
		// TODO Auto-generated method stub
		logger.info("추가된 문제를 시험에 추가");
		int n = session.insert(ns+"curGaekexa", dto);
		return n>0?true:false;
	}
	@Override
	public boolean addExasesul() {
		// TODO Auto-generated method stub
		logger.info("서술형 유형 문제 추가");
		int n = session.insert(ns+"addExasesul");
		return n>0?true:false;
	}
	@Override
	public boolean sesulExacontents(ExamDesc_Dto dto) {
		// TODO Auto-generated method stub
		logger.info("서술형 문제의 내용 추가");
		int n = session.insert(ns+"sesulExacontents", dto);
		return n>0?true:false;
	}
	@Override
	public boolean curSesulexa(CurExa_Dto dto) {
		// TODO Auto-generated method stub
		logger.info("추가된 문제를 시험에 추가");
		int n = session.insert(ns+"curSesulexa", dto);
		return n>0?true:false;
	}
	@Override
	public boolean addExapopol() {
		// TODO Auto-generated method stub
		logger.info("포폴형 유형 문제 추가");
		int n = session.insert(ns);
		return n>0?true:false;
	}
	@Override
	public boolean popolExacontents(ExamDesc_Dto dto) {
		// TODO Auto-generated method stub
		logger.info("포폴형 문제의 내용 추가");
		int n = session.insert(ns+"popolExacontents", dto);
		return n>0?true:false;
	}
	@Override
	public boolean curPopolexa(CurExa_Dto dto) {
		// TODO Auto-generated method stub
		logger.info("추가된 문제를 시험에 추가");
		int n = session.insert(ns+"curPopolexa", dto);
		return n>0?true:false;
	}
	
	

	

}
