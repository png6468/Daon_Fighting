package com.min.edu.dtos;

import java.io.Serializable;

public class StuCou_Dto implements Serializable{

	private static final long serialVersionUID = -3893938027685520651L;
	private String scseq;
	private String cou_code;
	private String stu_id;
	public StuCou_Dto() {
		// TODO Auto-generated constructor stub
	}
	public StuCou_Dto(String scseq, String cou_code, String stu_id) {
		super();
		this.scseq = scseq;
		this.cou_code = cou_code;
		this.stu_id = stu_id;
	}
	@Override
	public String toString() {
		return "StuCou_Dto [scseq=" + scseq + ", cou_code=" + cou_code + ", stu_id=" + stu_id + "]";
	}
	public String getScseq() {
		return scseq;
	}
	public void setScseq(String scseq) {
		this.scseq = scseq;
	}
	public String getCou_code() {
		return cou_code;
	}
	public void setCou_code(String cou_code) {
		this.cou_code = cou_code;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	
	
}
