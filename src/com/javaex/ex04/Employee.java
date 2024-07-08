package com.javaex.ex04;

public class Employee extends User {
	
	//배열
	private int salary;
	
	//생성자
	public Employee() {
		super();
	}
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	public Employee(String id, String password, String name,int salary) {
		super(id,password,name);
		this.salary = salary;
	}
	//메서드 gs

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	//메서드 일반
	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	public void showInfo1() {
		System.out.println("#아이디:" + getId() + ", #패스워드:" + getPassword() + ", #이름:" + getName() + ", #월급:" + salary);
	}
	
	public void showInfo2() {
		System.out.println("운영자의 월급은 " + salary + "원 입니다.");
	}
	
	

	
}
