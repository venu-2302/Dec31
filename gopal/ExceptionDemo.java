package com.gopal;

public class ExceptionDemo {

	public static void main(String[] args) {

		int a = 100, d = 2;
		
		try {
			System.out.println(a/d);
		}catch(Exception ex){
			System.out.println("Error bro!");
			ex.printStackTrace();
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("Another error bro!");
			}
		}
		System.out.println("Mani Bhai");
		System.out.println("Venu Bhai");
		System.out.println("Lalith Bhai");
		
	}

}