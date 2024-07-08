package com.javaex.ex04;

public class Customer extends User {

	//배열
	private int point;
	
	
	//생성자
	public Customer() {
	}
	
	public Customer(String id, String password, String name, int point) {
		super(id,password,name);
		this.point = point;
	}
	
	//메서드 gs
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	//메서드 일반

	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}
	public void showInfo() {
		System.out.println("#아이디:" + getId() + ", #패스워드:" + getPassword() + ", #이름:" + getName() + ", #포인트:" + point);
	}
}
