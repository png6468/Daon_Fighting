package com.min.edu.dtos;

import java.io.Serializable;

public class Exam_Dto implements Serializable{

	private static final long serialVersionUID = 2500676618220291879L;
	private String exa_code;
	private String exa_mean;
	public Exam_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Exam_Dto(String exa_code, String exa_mean) {
		super();
		this.exa_code = exa_code;
		this.exa_mean = exa_mean;
	}
	@Override
	public String toString() {
		return "Exam_Dto [exa_code=" + exa_code + ", exa_mean=" + exa_mean + "]";
	}
	public String getExa_code() {
		return exa_code;
	}
	public void setExa_code(String exa_code) {
		this.exa_code = exa_code;
	}
	public String getExa_mean() {
		return exa_mean;
	}
	public void setExa_mean(String exa_mean) {
		this.exa_mean = exa_mean;
	}
	
	
}
