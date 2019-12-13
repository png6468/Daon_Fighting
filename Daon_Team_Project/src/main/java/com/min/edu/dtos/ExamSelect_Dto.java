package com.min.edu.dtos;

import java.io.Serializable;

public class ExamSelect_Dto implements Serializable{

	private static final long serialVersionUID = -3171825548985759272L;
	private String seq;
	private String exa_code;
	private String content;
	private String wro_one;
	private String wro_two;
	private String wro_three;
	private String cor_answer;
	private String filename;
	public ExamSelect_Dto() {
		// TODO Auto-generated constructor stub
	}
	public ExamSelect_Dto(String seq, String exa_code, String content, String wro_one, String wro_two, String wro_three,
			String cor_answer, String filename) {
		super();
		this.seq = seq;
		this.exa_code = exa_code;
		this.content = content;
		this.wro_one = wro_one;
		this.wro_two = wro_two;
		this.wro_three = wro_three;
		this.cor_answer = cor_answer;
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "ExamSelect_Dto [seq=" + seq + ", exa_code=" + exa_code + ", content=" + content + ", wro_one=" + wro_one
				+ ", wro_two=" + wro_two + ", wro_three=" + wro_three + ", cor_answer=" + cor_answer + ", filename="
				+ filename + "]";
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getExa_code() {
		return exa_code;
	}
	public void setExa_code(String exa_code) {
		this.exa_code = exa_code;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	
	
}
