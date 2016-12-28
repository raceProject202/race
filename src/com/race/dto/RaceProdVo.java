package com.race.dto;

public class RaceProdVo {
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
		return "RaceProdVo [prod_id=" + prod_id + ", prod_name=" + prod_name
				+ ", prod_cn=" + prod_cn + ", prod_cost=" + prod_cost
				+ ", prod_price=" + prod_price + ", prod_qty=" + prod_qty
				+ ", prod_date=" + prod_date + ", prod_image1=" + prod_image1
				+ ", prod_image2=" + prod_image2 + ", prod_lgu=" + prod_lgu
				+ "]";
	}
	
	
	
	
}
