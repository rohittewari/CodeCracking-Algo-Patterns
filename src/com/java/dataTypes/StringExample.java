package com.java.dataTypes;

public class StringExample {

	public static void main(String[] args) {
		
		final String S1 = "Rohit";
		String S2 = "Rohit";
		String S3 = new String ("Rohit");
		
		System.out.println(S1==S2);
		System.out.println(S1==S3); 
		
		Thread t = new Thread(){
			public void run (){
				System.out.println(S1);
			}
		};

	}

}
