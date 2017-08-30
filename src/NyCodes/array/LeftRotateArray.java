package NyCodes.array;

import java.util.Scanner;

public class LeftRotateArray {
	//if left rotations are performed on array , then the array would become .
	
	// index = (i+n-d)%n;

	public static void main(String[] args) {
		int n=5;
		int d=2;
		 int [] arr = new int [n];
	        for (int i=0; i<arr.length;i++){
	            arr[i]= i+1;
	        }
	        
	        // 1,2,3,4,5 |    3,4,5,1,2
	        // 4 5 1 2 3 with +ve d
	        
	        int[] newArr = new int[n];
	        int index =0;
	        for (int i=0;i<n; i++){
	        	index = (i+n+d)%n;
	            newArr[index]=arr[i];
	            System.out.print(index+" ");
	         }
	             System.out.println("******");
	        for (int i=0;i<newArr.length; i++){
	           System.out.print(newArr[i]+" ");
	        }
	}

}
