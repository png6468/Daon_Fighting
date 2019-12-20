package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.min.edu.YunController;
import com.min.edu.dtos.CurExa_Dto;
import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;

@Service
public class YunDaon_ServiceImpl implements YunDaon_IService {

	@Autowired
	private YunDaon_IDao dao;

	@Override
	public List<String> subGaekallsel(Map<Object, Object> map) {
		List<String> list = dao.subGaekallsel(map);
		return list;
	}

	@Override
	public List<ExamSelect_Dto> gaekListsel(Map<Object, Object> map) {
		
		return dao.gaekListsel(map);
	}

	@Override
	public List<String> subSesulallsel(Map<Object, Object> map) {
		List<String> list = dao.subSesulallsel(map);
		return list;
	}

	@Override
	public List<ExamDesc_Dto> sesulListsel(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.sesulListsel(map);
	}

	@Override
	public List<String> subPoexaallsel(Map<Object, Object> map) {
		List<String> list = dao.subPoexaallsel(map);
		return list;
	}

	@Override
	public List<ExamDesc_Dto> popolListsel(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.popolListsel(map);
	}

	@Override
	public String filename() {
		// TODO Auto-generated method stub
		return dao.filename();
	}

	@Override
	public boolean copyinsert(CurExa_Dto dto) {
		// TODO Auto-generated method stub
		return dao.copyinsert(dto);
	}

	/**
	 * 여기가 이제 문제 유형을 정하고
	 * 문제 내용을 입력하고
	 * 문제를 커리큘럼에 연결하는 부분
	 */
	@Override
	@Transactional
	public boolean addselect(ExamSelect_Dto seldto, CurExa_Dto curdto) {
		boolean isc1 = dao.addExagaek();
		boolean isc2 = dao.gaekExacontents(seldto);
		boolean isc3 = dao.curGaekexa(curdto);
		return isc3?true:false;
	}

	@Override
	@Transactional
	public boolean adddesc(ExamDesc_Dto desdto, CurExa_Dto curdto) {
		boolean isc1 = dao.addExasesul();
		boolean isc2 = dao.sesulExacontents(desdto);
		boolean isc3 = dao.curSesulexa(curdto);
		return isc3?true:false;
	}

	@Override
	@Transactional
	public boolean addport(ExamDesc_Dto desdto, CurExa_Dto curdto) {
		boolean isc1 = dao.addExapopol();
		boolean isc2 = dao.popolExacontents(desdto);
		boolean isc3 = dao.curPopolexa(curdto);
		return isc3?true:false;
	}

	@Override
	public boolean deldefault(String cur_code) {
		// TODO Auto-generated method stub
		return dao.deldefault(cur_code);
	}
	
	
	

}
