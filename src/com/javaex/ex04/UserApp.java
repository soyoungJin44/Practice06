package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		
		Customer[] cArray = new Customer[3];
		
		Customer u01 = new Customer("jws", "j1234","정우성",1000);
		Customer u02 = new Customer("yjs","y2345","이효리",2000);
		Customer u03 = new Customer("master","m7788","운영자",500);
		
		cArray[0] = u01;
		cArray[1] = u02;
		cArray[2] = u03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].showInfo();
			
			if(i == cArray.length) {
				cArray[i].showInfo();
			}
		}
		
		Employee pay = new Employee(5000000);
		
		pay.showInfo2();
	}

}
