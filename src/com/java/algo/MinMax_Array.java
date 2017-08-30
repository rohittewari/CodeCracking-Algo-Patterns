package com.java.algo;

public class MinMax_Array {

	public static void main(String[] args) {
		int [] in = {10,20,32,4,50,6,70};
		int min = in[0];
		int max = in[0];
		
		for (int i=0; i<in.length; i++){
			if (in[i]>max) max = in[i];
			if (in[i]<min) min = in[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);

	}

}
