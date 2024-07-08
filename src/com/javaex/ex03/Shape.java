package com.javaex.ex03;

public class Shape {
	
	//배열
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {
		super();
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메서드 gs
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	//메서드
	
	
	
}

