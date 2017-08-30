package com.java.dataTypes;



class EnumEample{  

public static void main(String args[]){  
for (Season s : Season.values())  
System.out.println(s+" "+s.getValue());  
  
}} 

enum Season{   
WINTER(5), SPRING(10), SUMMER(15), FALL(20);   
  
private int value;  
private Season(int value){  
this.value=value;  
} 

int getValue(){
	return value;
}

}  
