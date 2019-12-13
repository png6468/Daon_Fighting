package com.min.edu.dtos;

import java.io.Serializable;

public class Admin_Dto implements Serializable{

	private static final long serialVersionUID = -1680245827897620858L;
	private String adm_id;
	private String adm_pw;
	private String adm_auth;
	private String adm_delflag;
	public Admin_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Admin_Dto(String adm_id, String adm_pw, String adm_auth, String adm_delflag) {
		super();
		this.adm_id = adm_id;
		this.adm_pw = adm_pw;
		this.adm_auth = adm_auth;
		this.adm_delflag = adm_delflag;
	}
	@Override
	public String toString() {
		return "Admin_Dto [adm_id=" + adm_id + ", adm_pw=" + adm_pw + ", adm_auth=" + adm_auth + ", adm_delflag="
				+ adm_delflag + "]";
	}
	public String getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(String adm_id) {
		this.adm_id = adm_id;
	}
	public String getAdm_pw() {
		return adm_pw;
	}
	public void setAdm_pw(String adm_pw) {
		this.adm_pw = adm_pw;
	}
	public String getAdm_auth() {
		return adm_auth;
	}
	public void setAdm_auth(String adm_auth) {
		this.adm_auth = adm_auth;
	}
	public String getAdm_delflag() {
		return adm_delflag;
	}
	public void setAdm_delflag(String adm_delflag) {
		this.adm_delflag = adm_delflag;
	}
	
	
	
}
