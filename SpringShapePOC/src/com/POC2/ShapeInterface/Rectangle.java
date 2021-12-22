package com.POC2.ShapeInterface;

public class Rectangle implements Shape {
	private Double length;
	private Double width;
	private Double hight;
	
	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHight() {
		return hight;
	}

	public void setHight(Double hight) {
		this.hight = hight;
	}
	

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", hight=" + hight + "]";
	}

	@Override
	public Double Area() {
		// TODO Auto-generated method stub
		return width*hight;
	}

	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		return length*hight*width;
	}

	
	
}
