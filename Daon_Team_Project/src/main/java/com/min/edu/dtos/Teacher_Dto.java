package com.min.edu.dtos;

import java.io.Serializable;

public class Teacher_Dto implements Serializable{

	
	private static final long serialVersionUID = 946126799439761636L;
	private String tea_id;
	private String tea_name;
	private String tea_pw;
	private String tea_phone;
	private String filename;
	private String tea_delflag;
	
	public Teacher_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Teacher_Dto(String tea_id, String tea_name, String tea_pw, String tea_phone, String filename,
			String tea_delflag) {
		super();
		this.tea_id = tea_id;
		this.tea_name = tea_name;
		this.tea_pw = tea_pw;
		this.tea_phone = tea_phone;
		this.filename = filename;
		this.tea_delflag = tea_delflag;
	}
	@Override
	public String toString() {
		return "Teacher_Dto [tea_id=" + tea_id + ", tea_name=" + tea_name + ", tea_pw=" + tea_pw + ", tea_phone="
				+ tea_phone + ", filename=" + filename + ", tea_delflag=" + tea_delflag + "]";
	}
	public String getTea_id() {
		return tea_id;
	}
	public void setTea_id(String tea_id) {
		this.tea_id = tea_id;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	public String getTea_pw() {
		return tea_pw;
	}
	public void setTea_pw(String tea_pw) {
		this.tea_pw = tea_pw;
	}
	public String getTea_phone() {
		return tea_phone;
	}
	public void setTea_phone(String tea_phone) {
		this.tea_phone = tea_phone;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getTea_delflag() {
		return tea_delflag;
	}
	public void setTea_delflag(String tea_delflag) {
		this.tea_delflag = tea_delflag;
	}
	
	
}
