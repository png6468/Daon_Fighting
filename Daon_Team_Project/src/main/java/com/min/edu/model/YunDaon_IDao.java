package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dtos.CurExa_Dto;
import com.min.edu.dtos.DescPortSel_Dto;
import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;
import com.min.edu.dtos.SelectSel_Dto;

public interface YunDaon_IDao {

	public List<String> subGaekallsel(Map<Object, Object> map);
	public List<ExamSelect_Dto> gaekListsel(Map<Object, Object> map);
	public List<String> subSesulallsel(Map<Object, Object> map);
	public List<String> subPoexaallsel(Map<Object, Object> map);
	public List<ExamDesc_Dto> sesulListsel(Map<Object, Object> map);
	public List<ExamDesc_Dto> popolListsel(Map<Object, Object> map);
	public String filename();
	
	public boolean copyinsert(CurExa_Dto dto);
	public boolean curexaDelete(CurExa_Dto dto);
	public boolean deldefault(String cur_code);
	public boolean addExagaek();
	public boolean gaekExacontents(ExamSelect_Dto dto);
	public boolean curGaekexa(CurExa_Dto dto);
	public boolean addExasesul();
	public boolean sesulExacontents(ExamDesc_Dto dto);
	public boolean curSesulexa(CurExa_Dto dto);
	public boolean addExapopol();
	public boolean popolExacontents(ExamDesc_Dto dto);
	public boolean curPopolexa(CurExa_Dto dto);
	public List<SelectSel_Dto> sihumExaSList(String cur_code);
	public List<DescPortSel_Dto> sihumExaDList(String cur_code);
	public List<DescPortSel_Dto> sihumExaPList(String cur_code);
	
	public boolean jumsuSet(CurExa_Dto dto);
	
}
