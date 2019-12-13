package com.min.edu.dtos;

import java.io.Serializable;

public class StuCouSel_Dto implements Serializable{

	private static final long serialVersionUID = -950496107032094429L;
	private String scseq;
	private String stu_id; 
	private String tea_id; 
	private String cou_name; 
	private String cou_exp; 
	private String startdate; 
	private String totaltime;
	private String enddate;
	private String cou_cnt;
	private String state;
	public StuCouSel_Dto() {
		// TODO Auto-generated constructor stub
	}
	public StuCouSel_Dto(String scseq, String stu_id, String tea_id, String cou_name, String cou_exp, String startdate,
			String totaltime, String enddate, String cou_cnt, String state) {
		super();
		this.scseq = scseq;
		this.stu_id = stu_id;
		this.tea_id = tea_id;
		this.cou_name = cou_name;
		this.cou_exp = cou_exp;
		this.startdate = startdate;
		this.totaltime = totaltime;
		this.enddate = enddate;
		this.cou_cnt = cou_cnt;
		this.state = state;
	}
	@Override
	public String toString() {
		return "StuCouSel_Dto [scseq=" + scseq + ", stu_id=" + stu_id + ", tea_id=" + tea_id + ", cou_name=" + cou_name
				+ ", cou_exp=" + cou_exp + ", startdate=" + startdate + ", totaltime=" + totaltime + ", enddate="
				+ enddate + ", cou_cnt=" + cou_cnt + ", state=" + state + "]";
	}
	public String getScseq() {
		return scseq;
	}
	public void setScseq(String scseq) {
		this.scseq = scseq;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getTea_id() {
		return tea_id;
	}
	public void setTea_id(String tea_id) {
		this.tea_id = tea_id;
	}
	public String getCou_name() {
		return cou_name;
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	public String getCou_exp() {
		return cou_exp;
	}
	public void setCou_exp(String cou_exp) {
		this.cou_exp = cou_exp;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(String totaltime) {
		this.totaltime = totaltime;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getCou_cnt() {
		return cou_cnt;
	}
	public void setCou_cnt(String cou_cnt) {
		this.cou_cnt = cou_cnt;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
