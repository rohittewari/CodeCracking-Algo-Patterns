package com.java.dataTypes;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CompareEquals {

	public static void main(String[] args) {
	 BigDecimal b1 = new BigDecimal("2.00"); // int 2.00 matches
	 BigDecimal b2 = new BigDecimal("2.000");
	 
	 System.out.println(b1.equals(b2)); //false
	 System.out.println(b1.compareTo(b2)); //0
	 
	 Set s = new HashSet();
	 s.add(b1);
	 s.add(b2);
	 Set sortedSet = new TreeSet();
	 sortedSet.addAll(s);
	 
	 System.out.println(s.size());    //2
	 System.out.println(sortedSet.size()); //1
	 

	}

}
