package com.company.coredemo;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Square 
{
	Scanner scan=new Scanner(System.in);
	double side;
	double area;
	public double getSide() 
	{
		return side;
	}
	public void setSide(double side) 
	{
		this.side = side;
	}
	public double getArea() 
	{
		return area;
	}
	public void setArea(double area) 
	{
		this.area = area;
	}
	@Override
	public String toString() 
	{
		return "Square [side=" + side + ", area=" + area + "]";
	}
	
	void area()
	{
		System.out.println("Enter the values of Side1: ");
		int side1 = scan.nextInt();
		System.out.println("Enter the values of Side2: ");
		int side2 = scan.nextInt();
		area = side1*side2;
		System.out.println("Area of Square with given side is: " + area + " SQM" );
		scan.close();
	}
	
}
