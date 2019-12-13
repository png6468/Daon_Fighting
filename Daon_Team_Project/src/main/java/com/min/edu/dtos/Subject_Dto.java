package com.min.edu.dtos;

import java.io.Serializable;

public class Subject_Dto implements Serializable{

	private static final long serialVersionUID = 571760821645222050L;
	private String sub_code;
	private String sub_name;
	private String sub_exp;
	private String sub_time;
	public Subject_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Subject_Dto(String sub_code, String sub_name, String sub_exp, String sub_time) {
		super();
		this.sub_code = sub_code;
		this.sub_name = sub_name;
		this.sub_exp = sub_exp;
		this.sub_time = sub_time;
	}
	@Override
	public String toString() {
		return "Subject_Dto [sub_code=" + sub_code + ", sub_name=" + sub_name + ", sub_exp=" + sub_exp + ", sub_time="
				+ sub_time + "]";
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
	public String getSub_exp() {
		return sub_exp;
	}
	public void setSub_exp(String sub_exp) {
		this.sub_exp = sub_exp;
	}
	public String getSub_time() {
		return sub_time;
	}
	public void setSub_time(String sub_time) {
		this.sub_time = sub_time;
	}
}
