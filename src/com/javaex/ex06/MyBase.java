package com.javaex.ex06;

public class MyBase extends Base{

	//필드
	
	//생성자
	
	//메서드 gs
	
	//메서드 일반
    public void service(String state) {
    	if(state.equals("낮")) {
    		day();
    	}else if(state.equals("오후")) {
    		afternoon();
    	}else if(state.equals("밤")) {
    		night();
    	}
    }
    
    public void day() {
    	System.out.println("낮에는 열심히 수업듣자");
    }
    public void afternoon() {
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}
