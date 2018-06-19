package com.square.app;

public class SquareApp {
	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(7);
		Square square3 = new Square(5,6,7);
		Square square4 = new Square(square3);
				
		square1.setSide(6);
		square1.setHeight(5);
		square1.setWidth(7);
		square1.setPosition(10,30);
		
		squareCalc(square1);		
		squareCalc(square2);		
		squareCalc(square3);		
		squareCalc(square4);			
	}

	private static void squareCalc(Square square) {
		System.out.println("X: " + square.getX());
		System.out.println("Y: " + square.getY());
		System.out.println("Side: " + square.getSide());		
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter: " + square.getPerimeter());
	}
}
