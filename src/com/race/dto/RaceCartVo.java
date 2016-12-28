package com.race.dto;

public class RaceCartVo {

	private int cart_no; 		//카트번호
	private int cart_prod;		//상품코드
	private String cart_member; //회원아이디
	private int cart_qty;		//상품수량
	private String cart_date;	//상품날짜
	private String cart_ok;		//상품입금 확인
	private int cart_go;		// 0:주문신청, 1:배송, -1:환불
	private String cart_last;	// 배송완료
	
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
	public int getCart_go() {
		return cart_go;
	}
	public void setCart_go(int cart_go) {
		this.cart_go = cart_go;
	}
	public String getCart_last() {
		return cart_last;
	}
	public void setCart_last(String cart_last) {
		this.cart_last = cart_last;
	}
	@Override
	public String toString() {
		return "RaceCartVo [cart_no=" + cart_no + ", cart_prod=" + cart_prod
				+ ", cart_member=" + cart_member + ", cart_qty=" + cart_qty
				+ ", cart_date=" + cart_date + ", cart_ok=" + cart_ok
				+ ", cart_go=" + cart_go + ", cart_last=" + cart_last + "]";
	}
	
	
	
	
	
}
