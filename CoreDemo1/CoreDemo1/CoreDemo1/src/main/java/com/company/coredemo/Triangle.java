package com.company.coredemo;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Triangle 
{
	
	Scanner scan  = new Scanner(System.in);
	double side1;
	double side2;
	double side3;
	double area;
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", area=" + area + "]";
	}
	void area()
	{
		System.out.println("Enter the values of Side1: ");
		double side1 = scan.nextDouble();
		System.out.println("Enter the values of Side2: ");
		double side2 = scan.nextDouble();
		System.out.println("Enter the values of Side2: ");
		double side3 = scan.nextDouble();
		double sp= (side1+side2+side3)/2;
		area =  Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
		System.out.println("Area of the Triangle with given sides is: "+ area + " SQM");
		scan.close();
	}	
}
