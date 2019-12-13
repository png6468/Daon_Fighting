package com.min.edu.dtos;

import java.io.Serializable;

public class StuDetailSel_Dto implements Serializable{

	private static final long serialVersionUID = 3292902839357338172L;
	private String stu_id;
	private String stu_name;
	private String stu_phone;
	private String stu_delflag;
	private String cou_name;
	public StuDetailSel_Dto() {
		// TODO Auto-generated constructor stub
	}
	public StuDetailSel_Dto(String stu_id, String stu_name, String stu_phone, String stu_delflag, String cou_name) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_phone = stu_phone;
		this.stu_delflag = stu_delflag;
		this.cou_name = cou_name;
	}
	@Override
	public String toString() {
		return "StuDetailSel_Dto [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_phone=" + stu_phone
				+ ", stu_delflag=" + stu_delflag + ", cou_name=" + cou_name + "]";
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
	public String getCou_name() {
		return cou_name;
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	
	
}
