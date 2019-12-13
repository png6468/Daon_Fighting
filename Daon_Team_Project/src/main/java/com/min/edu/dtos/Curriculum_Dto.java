package com.min.edu.dtos;

import java.io.Serializable;

public class Curriculum_Dto implements Serializable{

	private static final long serialVersionUID = 3015517834393028365L;
	private String cur_code;
	private String cou_code;
	private String sub_code;
	public Curriculum_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Curriculum_Dto(String cur_code, String cou_code, String sub_code) {
		super();
		this.cur_code = cur_code;
		this.cou_code = cou_code;
		this.sub_code = sub_code;
	}
	@Override
	public String toString() {
		return "Curriculum_Dto [cur_code=" + cur_code + ", cou_code=" + cou_code + ", sub_code=" + sub_code + "]";
	}
	public String getCur_code() {
		return cur_code;
	}
	public void setCur_code(String cur_code) {
		this.cur_code = cur_code;
	}
	public String getCou_code() {
		return cou_code;
	}
	public void setCou_code(String cou_code) {
		this.cou_code = cou_code;
	}
	public String getSub_code() {
		return sub_code;
	}
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}
	
	
}
