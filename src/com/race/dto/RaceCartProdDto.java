package com.race.dto;

public class RaceCartProdDto {

	private int cart_no; 		//카트번호
	private int cart_prod;		//상품코드
	private String cart_member; //회원아이디
	private int cart_qty;		//상품수량
	private String cart_date;	//상품날짜
	private String cart_ok;		//상품duqn
	private int cart_go;		// 0:주문신청, 1:배송, -1:환불
	private String cart_last;	// 배송완료
	
	private int prod_id;       //상품 아이디
	private String prod_name;  //상품 이름
	private String prod_cn;  	//상품 설명
	private int prod_cost;     //상품 구매가 
	private int prod_price;    //상품 판매가
	private int prod_qty;      //상품 수량
	private String prod_date;  //상품 등록 날짜
	private String prod_image1;//상품 이미지1
	private String prod_image2;//상품 이미지2
	private String prod_lgu;   //상품 등록코드
	
	
	
	public RaceCartProdDto(RaceCartVo cartVo, RaceProdVo prodVo) {
		
		this.cart_no = cartVo.getCart_no();
		this.cart_prod = cartVo.getCart_prod();
		this.cart_member = cartVo.getCart_member();
		this.cart_qty = cartVo.getCart_qty();
		this.cart_date = cartVo.getCart_date();
		this.cart_ok = cartVo.getCart_ok();
		this.cart_go = cartVo.getCart_go();
		this.cart_last = cartVo.getCart_last();
		this.prod_id = prodVo.getProd_id();
		this.prod_name = prodVo.getProd_name();
		this.prod_cn = prodVo.getProd_cn();
		this.prod_cost = prodVo.getProd_cost();
		this.prod_price = prodVo.getProd_price();
		this.prod_qty = prodVo.getProd_qty();
		this.prod_date = prodVo.getProd_date();
		this.prod_image1 = prodVo.getProd_image1();
		this.prod_image2 = prodVo.getProd_image2();
		this.prod_lgu = prodVo.getProd_lgu();
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



	public int getProd_id() {
		return prod_id;
	}



	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}



	public String getProd_name() {
		return prod_name;
	}



	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}



	public String getProd_cn() {
		return prod_cn;
	}



	public void setProd_cn(String prod_cn) {
		this.prod_cn = prod_cn;
	}



	public int getProd_cost() {
		return prod_cost;
	}



	public void setProd_cost(int prod_cost) {
		this.prod_cost = prod_cost;
	}



	public int getProd_price() {
		return prod_price;
	}



	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}



	public int getProd_qty() {
		return prod_qty;
	}



	public void setProd_qty(int prod_qty) {
		this.prod_qty = prod_qty;
	}



	public String getProd_date() {
		return prod_date;
	}



	public void setProd_date(String prod_date) {
		this.prod_date = prod_date;
	}



	public String getProd_image1() {
		return prod_image1;
	}



	public void setProd_image1(String prod_image1) {
		this.prod_image1 = prod_image1;
	}



	public String getProd_image2() {
		return prod_image2;
	}



	public void setProd_image2(String prod_image2) {
		this.prod_image2 = prod_image2;
	}



	public String getProd_lgu() {
		return prod_lgu;
	}



	public void setProd_lgu(String prod_lgu) {
		this.prod_lgu = prod_lgu;
	}



	@Override
	public String toString() {
		return "RaceCartProdDto [cart_no=" + cart_no + ", cart_prod="
				+ cart_prod + ", cart_member=" + cart_member + ", cart_qty="
				+ cart_qty + ", cart_date=" + cart_date + ", cart_ok="
				+ cart_ok + ", cart_go=" + cart_go + ", cart_last=" + cart_last
				+ ", prod_id=" + prod_id + ", prod_name=" + prod_name
				+ ", prod_cn=" + prod_cn + ", prod_cost=" + prod_cost
				+ ", prod_price=" + prod_price + ", prod_qty=" + prod_qty
				+ ", prod_date=" + prod_date + ", prod_image1=" + prod_image1
				+ ", prod_image2=" + prod_image2 + ", prod_lgu=" + prod_lgu
				+ "]";
	}






	
	
}
