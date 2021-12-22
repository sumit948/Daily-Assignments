package com.importantProgram.abstractClass2;

public abstract class Shape {
		public String color;
		public void setColor() {
			
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		abstract double displayArea();
}
