package com.min.edu.dtos;

import java.io.Serializable;

public class AnswerScore_Dto implements Serializable{

	private static final long serialVersionUID = 4172924311217797735L;
	private String ans_seq;
	private String cur_exacode;
	private String stu_id;
	private String answer;
	private String newfilename;
	private String check;
	private String jumsu;
	public AnswerScore_Dto() {
		// TODO Auto-generated constructor stub
	}
	public AnswerScore_Dto(String ans_seq, String cur_exacode, String stu_id, String answer, String newfilename,
			String check, String jumsu) {
		super();
		this.ans_seq = ans_seq;
		this.cur_exacode = cur_exacode;
		this.stu_id = stu_id;
		this.answer = answer;
		this.newfilename = newfilename;
		this.check = check;
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "AnswerScore_Dto [ans_seq=" + ans_seq + ", cur_exacode=" + cur_exacode + ", stu_id=" + stu_id
				+ ", answer=" + answer + ", newfilename=" + newfilename + ", check=" + check + ", jumsu=" + jumsu + "]";
	}
	public String getAns_seq() {
		return ans_seq;
	}
	public void setAns_seq(String ans_seq) {
		this.ans_seq = ans_seq;
	}
	public String getCur_exacode() {
		return cur_exacode;
	}
	public void setCur_exacode(String cur_exacode) {
		this.cur_exacode = cur_exacode;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getNewfilename() {
		return newfilename;
	}
	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getJumsu() {
		return jumsu;
	}
	public void setJumsu(String jumsu) {
		this.jumsu = jumsu;
	}
	
}
