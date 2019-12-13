package com.min.edu.dtos;

import java.io.Serializable;

public class ExamDesc_Dto implements Serializable{

	private static final long serialVersionUID = -3160278772598225698L;
	private String seq;
	private String exa_code;
	private String content;
	private String standard;
	private String filename;
	public ExamDesc_Dto() {
		// TODO Auto-generated constructor stub
	}
	public ExamDesc_Dto(String seq, String exa_code, String content, String standard, String filename) {
		super();
		this.seq = seq;
		this.exa_code = exa_code;
		this.content = content;
		this.standard = standard;
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "ExamDesc_Dto [seq=" + seq + ", exa_code=" + exa_code + ", content=" + content + ", standard=" + standard
				+ ", filename=" + filename + "]";
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
