package com.race.dto;

public class RaceCartVo {

	private int cart_no; 		//카트번호
	private int cart_prod;		//상품코드
	private String cart_member; //회원아이디
	private int cart_qty;		//상품수량
	private String cart_date;	//상품날짜
	private String cart_ok;	//상품날짜
	
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
	
	
	
}
