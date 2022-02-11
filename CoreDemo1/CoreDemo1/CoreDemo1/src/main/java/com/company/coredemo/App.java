package com.company.coredemo;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Component;

@Component
public class App 
{
    public static void main( String[] args )
    {
		
		  ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		 
		  Shape s=context.getBean(Shape.class);
		  Scanner scan = new Scanner(System.in);
		  
		  s.getShape();
		  scan.close();
		
	  
    }
}