package com.min.edu.dtos;

import java.io.Serializable;

public class StuAvgSel_Dto implements Serializable{

	private static final long serialVersionUID = -6605244330663828119L;
	private String sub_code; 
	private String sub_name; 
	private String sub_time;
	private String cou_name; 
	private String cur_code;
	private String jumsu;
	public StuAvgSel_Dto() {
		// TODO Auto-generated constructor stub
	}
	public StuAvgSel_Dto(String sub_code, String sub_name, String sub_time, String cou_name, String cur_code,
			String jumsu) {
		super();
		this.sub_code = sub_code;
		this.sub_name = sub_name;
		this.sub_time = sub_time;
		this.cou_name = cou_name;
		this.cur_code = cur_code;
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "StuAvgSel_Dto [sub_code=" + sub_code + ", sub_name=" + sub_name + ", sub_time=" + sub_time
				+ ", cou_name=" + cou_name + ", cur_code=" + cur_code + ", jumsu=" + jumsu + "]";
	}
	public String getSub_code() {
		return sub_code;
	}
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getSub_time() {
		return sub_time;
	}
	public void setSub_time(String sub_time) {
		this.sub_time = sub_time;
	}
	public String getCou_name() {
		return cou_name;
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	public String getCur_code() {
		return cur_code;
	}
	public void setCur_code(String cur_code) {
		this.cur_code = cur_code;
	}
	public String getJumsu() {
		return jumsu;
	}
	public void setJumsu(String jumsu) {
		this.jumsu = jumsu;
	} 
	
	
	
	
}
