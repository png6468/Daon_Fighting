package com.min.edu.dtos;

import java.io.Serializable;

public class CurExa_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4074540822218075297L;
	private String curexa_code;
	private String cur_code;
	private String exa_code;
	private String allot;
	public CurExa_Dto() {
		// TODO Auto-generated constructor stub
	}
	public CurExa_Dto(String curexa_code, String cur_code, String exa_code, String allot) {
		super();
		this.curexa_code = curexa_code;
		this.cur_code = cur_code;
		this.exa_code = exa_code;
		this.allot = allot;
	}
	@Override
	public String toString() {
		return "CurExa_Dto [curexa_code=" + curexa_code + ", cur_code=" + cur_code + ", exa_code=" + exa_code
				+ ", allot=" + allot + "]";
	}
	public String getCurexa_code() {
		return curexa_code;
	}
	public void setCurexa_code(String curexa_code) {
		this.curexa_code = curexa_code;
	}
	public String getCur_code() {
		return cur_code;
	}
	public void setCur_code(String cur_code) {
		this.cur_code = cur_code;
	}
	public String getExa_code() {
		return exa_code;
	}
	public void setExa_code(String exa_code) {
		this.exa_code = exa_code;
	}
	public String getAllot() {
		return allot;
	}
	public void setAllot(String allot) {
		this.allot = allot;
	}
	
}
