package com.race.dto;

public class RaceMemberVo {
	private String mem_id;    //맴버 아이디
	private String mem_pass;  //맴버 패스워드
	private String mem_name;  //맴버 이름
	private String mem_zip;   //맴버 우편번호
	private String mem_add1;  //맴버 주소
	private String mem_add2;  //맴버 상세주소
	private String mem_hp;    //맴버 전화번호
	private String mem_email; //맴버 이메일
	private String mem_date;  //맴버 가입날짜
	private String mem_delete;//맴버 삭제여부
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pass() {
		return mem_pass;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_zip() {
		return mem_zip;
	}
	public void setMem_zip(String mem_zip) {
		this.mem_zip = mem_zip;
	}
	public String getMem_add1() {
		return mem_add1;
	}
	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}
	public String getMem_add2() {
		return mem_add2;
	}
	public void setMem_add2(String mem_add2) {
		this.mem_add2 = mem_add2;
	}
	public String getMem_hp() {
		return mem_hp;
	}
	public void setMem_hp(String mem_hp) {
		this.mem_hp = mem_hp;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_date() {
		return mem_date;
	}
	public void setMem_date(String mem_date) {
		this.mem_date = mem_date;
	}
	public String getMem_delete() {
		return mem_delete;
	}
	public void setMem_delete(String mem_delete) {
		this.mem_delete = mem_delete;
	}
	@Override
	public String toString() {
		return "RaceMemberVo [mem_id=" + mem_id + ", mem_pass=" + mem_pass
				+ ", mem_name=" + mem_name + ", mem_zip=" + mem_zip
				+ ", mem_add1=" + mem_add1 + ", mem_add2=" + mem_add2
				+ ", mem_hp=" + mem_hp + ", mem_email=" + mem_email
				+ ", mem_date=" + mem_date + ", mem_delete=" + mem_delete + "]";
	}
	
	
	
}
