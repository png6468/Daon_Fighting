package com.min.edu.dtos;

import java.io.Serializable;

public class Student_Dto implements Serializable{

	private static final long serialVersionUID = -4544546606986952119L;
	private String stu_id;
	private String stu_name;
	private String stu_pw;
	private String stu_phone;
	private String stu_delflag;
	public Student_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Student_Dto(String stu_id, String stu_name, String stu_pw, String stu_phone, String stu_delflag) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_pw = stu_pw;
		this.stu_phone = stu_phone;
		this.stu_delflag = stu_delflag;
	}
	@Override
	public String toString() {
		return "Student_Dto [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_pw=" + stu_pw + ", stu_phone="
				+ stu_phone + ", stu_delflag=" + stu_delflag + "]";
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_pw() {
		return stu_pw;
	}
	public void setStu_pw(String stu_pw) {
		this.stu_pw = stu_pw;
	}
	public String getStu_phone() {
		return stu_phone;
	}
	public void setStu_phone(String stu_phone) {
		this.stu_phone = stu_phone;
	}
	public String getStu_delflag() {
		return stu_delflag;
	}
	public void setStu_delflag(String stu_delflag) {
		this.stu_delflag = stu_delflag;
	}
	
	
}
