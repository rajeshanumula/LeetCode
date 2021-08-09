package com.practice;

public class OverridingTest {
	
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.display();
		Shape circle =new Circle();
		circle.getShapeName();
		circle.display();
	}

}

class Shape{
	public void getShapeName() {
		System.out.println("This is from shape Class");
	}
	public void display() {
		System.out.println("Display from Shape");
	}
}

class Circle extends Shape{
	@Override
	public void getShapeName() {
		System.out.println("This is from Circle class");
	}
}

class Rectangle extends Shape{
	@Override
	public void getShapeName() {
		System.out.println("This is from Rectanle class");
	}
}