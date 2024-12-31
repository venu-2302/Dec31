package com.gopal;

public class Demo {
	 public static void main(String [] args) {
		 int [] num = {10,20,30,40};
		 for(int i=0;i<3;i++) {
			 System.out.println(num[i]);
		 }
		 try {
			 System.out.println(num[10]);
		 }catch(Exception e1) {
			 System.out.println(e1.toString());
			 e1.printStackTrace();
		 }
		 System.out.println("SPEC");
		 System.out.println("Java full stack");
	 }
	}