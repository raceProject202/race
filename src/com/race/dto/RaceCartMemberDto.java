package com.race.dto;

public class RaceCartMemberDto {

	private int cart_no; 		//카트번호
	private int cart_prod;		//상품코드
	private String cart_member; //회원아이디
	private int cart_qty;		//상품수량
	private String cart_date;	//상품날짜
	private String cart_ok;		//상품duqn
	private String cart_name;  //맴버 이름
	private String cart_zip;   //맴버 우편번호
	private String cart_add1;  //맴버 주소
	private String cart_add2;  //맴버 상세주소
	private String cart_hp;    //맴버 전화번호
	
	
	
	public RaceCartMemberDto(RaceCartVo cartVo, RaceMemberVo memberVo) {
		this.cart_no = cartVo.getCart_no();
		this.cart_prod = cartVo.getCart_prod();
		this.cart_member = cartVo.getCart_member();
		this.cart_qty = cartVo.getCart_qty();
		this.cart_date = cartVo.getCart_date();
		this.cart_ok = cartVo.getCart_ok();
		this.cart_name = memberVo.getMem_name();
		this.cart_zip = memberVo.getMem_zip();
		this.cart_add1 = memberVo.getMem_add1();
		this.cart_add2 = memberVo.getMem_add2();
		this.cart_hp = memberVo.getMem_hp();
	}


	public int getCart_no() {
		return cart_no;
	}


	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}


	public int getCart_prod() {
		return cart_prod;
	}


	public void setCart_prod(int cart_prod) {
		this.cart_prod = cart_prod;
	}


	public String getCart_member() {
		return cart_member;
	}


	public void setCart_member(String cart_member) {
		this.cart_member = cart_member;
	}


	public int getCart_qty() {
		return cart_qty;
	}


	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}


	public String getCart_date() {
		return cart_date;
	}


	public void setCart_date(String cart_date) {
		this.cart_date = cart_date;
	}


	public String getCart_ok() {
		return cart_ok;
	}


	public void setCart_ok(String cart_ok) {
		this.cart_ok = cart_ok;
	}


	public String getCart_name() {
		return cart_name;
	}


	public void setCart_name(String cart_name) {
		this.cart_name = cart_name;
	}


	public String getCart_zip() {
		return cart_zip;
	}


	public void setCart_zip(String cart_zip) {
		this.cart_zip = cart_zip;
	}


	public String getCart_add1() {
		return cart_add1;
	}


	public void setCart_add1(String cart_add1) {
		this.cart_add1 = cart_add1;
	}


	public String getCart_add2() {
		return cart_add2;
	}


	public void setCart_add2(String cart_add2) {
		this.cart_add2 = cart_add2;
	}


	public String getCart_hp() {
		return cart_hp;
	}


	public void setCart_hp(String cart_hp) {
		this.cart_hp = cart_hp;
	}


	@Override
	public String toString() {
		return "RaceCartDto [cart_no=" + cart_no + ", cart_prod=" + cart_prod
				+ ", cart_member=" + cart_member + ", cart_qty=" + cart_qty
				+ ", cart_date=" + cart_date + ", cart_ok=" + cart_ok
				+ ", cart_name=" + cart_name + ", cart_zip=" + cart_zip
				+ ", cart_add1=" + cart_add1 + ", cart_add2=" + cart_add2
				+ ", cart_hp=" + cart_hp + "]";
	}
	
	
	
}
