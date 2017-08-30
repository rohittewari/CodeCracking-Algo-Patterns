package com.patterns;

public class SingleTon {
   
	private static volatile SingleTon mySingleTon;
	
	private SingleTon() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingleTon getSingleTon(){
		
		if (mySingleTon==null){
		  synchronized (SingleTon.class) {
			  if (mySingleTon==null){
			    mySingleTon= new SingleTon();
			  }
		 }
						
		}
		return mySingleTon;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
