package com.patterns;

class Parent {
    public int age;
    
    public Parent(int age){
    	this.age =age;
    }
    
}

public class Subclass extends Parent implements Cloneable {
	
	public Subclass(int age){
		super(age);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{		
		Subclass s = new Subclass(16);
		Subclass s2 = (Subclass) s.clone1();
		s.age = 30;
		System.out.println("s.age: " +s.age);
		System.out.println("s2.age: "+s2.age);
		
	}
	
	public Object clone1() throws CloneNotSupportedException{ 
		 return super.clone();
	}
	
	
}