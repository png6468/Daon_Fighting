package com.min.edu.dtos;

import java.io.Serializable;

public class SelectSel_Dto implements Serializable{

	private static final long serialVersionUID = 1655117792362041388L;
	private String exa_code; 
	private String curexa_code; 
	private String cur_code; 
	private String content; 
	private String cor_answer; 
	private String filename; 
	private String wro_one; 
	private String wro_two; 
	private String wro_three;
	public SelectSel_Dto() {
		// TODO Auto-generated constructor stub
	}
	public SelectSel_Dto(String exa_code, String curexa_code, String cur_code, String content, String cor_answer,
			String filename, String wro_one, String wro_two, String wro_three) {
		super();
		this.exa_code = exa_code;
		this.curexa_code = curexa_code;
		this.cur_code = cur_code;
		this.content = content;
		this.cor_answer = cor_answer;
		this.filename = filename;
		this.wro_one = wro_one;
		this.wro_two = wro_two;
		this.wro_three = wro_three;
	}
	@Override
	public String toString() {
		return "SelectSel_Dto [exa_code=" + exa_code + ", curexa_code=" + curexa_code + ", cur_code=" + cur_code
				+ ", content=" + content + ", cor_answer=" + cor_answer + ", filename=" + filename + ", wro_one="
				+ wro_one + ", wro_two=" + wro_two + ", wro_three=" + wro_three + "]";
	}
	public String getExa_code() {
		return exa_code;
	}
	public void setExa_code(String exa_code) {
		this.exa_code = exa_code;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCor_answer() {
		return cor_answer;
	}
	public void setCor_answer(String cor_answer) {
		this.cor_answer = cor_answer;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getWro_one() {
		return wro_one;
	}
	public void setWro_one(String wro_one) {
		this.wro_one = wro_one;
	}
	public String getWro_two() {
		return wro_two;
	}
	public void setWro_two(String wro_two) {
		this.wro_two = wro_two;
	}
	public String getWro_three() {
		return wro_three;
	}
	public void setWro_three(String wro_three) {
		this.wro_three = wro_three;
	}
	
	
}
