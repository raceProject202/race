package com.race.dto;

public class RaceQnaVo {
	
	  private int qna_qseq;  	  //기본키
	  private String qna_content; //질문내용
	  private String qna_reply;   //답변내용
	  private String qna_id; 	  //작성자아이디
	  private String qna_rep; 	  //답변유무
	  private String qna_date;    //질문날짜
	  private String qna_title;	  //질문타이틀
	  
	public int getQna_qseq() {
		return qna_qseq;
	}
	public void setQna_qseq(int qna_qseq) {
		this.qna_qseq = qna_qseq;
	}
	public String getQna_content() {
		return qna_content;
	}
	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}
	public String getQna_reply() {
		return qna_reply;
	}
	public void setQna_reply(String qna_reply) {
		this.qna_reply = qna_reply;
	}
	public String getQna_id() {
		return qna_id;
	}
	public void setQna_id(String qna_id) {
		this.qna_id = qna_id;
	}
	public String getQna_rep() {
		return qna_rep;
	}
	public void setQna_rep(String qna_rep) {
		this.qna_rep = qna_rep;
	}
	public String getQna_date() {
		return qna_date;
	}
	public void setQna_date(String qna_date) {
		this.qna_date = qna_date;
	}
	public String getQna_title() {
		return qna_title;
	}
	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}
	  
	  
}
