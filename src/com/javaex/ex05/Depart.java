package com.javaex.ex05;

public class Depart extends Employee {

	 //필드
	private String depart;
	
	
	//생성자
	public Depart() {
		super();
	}
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	
	//메서드 gs
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	//메서드 일반
	public void showInformation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + depart);
	}
	public void getInformation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + depart);
	}
}
