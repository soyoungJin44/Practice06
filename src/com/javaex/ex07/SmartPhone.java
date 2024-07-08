package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	// 생성자
	public SmartPhone() {
		super();
	}

	public void execute(String str) {

		if (str.equals("앱")) {
			app();
		} else if (str.equals("음악")) {
			playMusic();
		} else if(str.equals("통화")) {
			call();
		}

	}

	public void app() {
		System.out.println("앱실행");

	}

	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	public void call() {
		System.out.println("통화기능 시작");
	}
	// 메소드작성

	// 메소드작성

}
