package com.POC2.ShapeInterface;

public class Circle implements Shape {
	private Double radius;
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public Double Area() {
		// TODO Auto-generated method stub
		return 3.14*(radius*2);
	}

	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
