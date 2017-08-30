package com.java.algo;

public class BinarySearch {

	public static void main(String[] args) {
		int num = 67;
		method(num);

		
	}

	private static void method(int num) {
		int [] arr = {11,22,33,44};
		
		int start = 0;
		int end = arr.length-1;		
		
		while (start < end) {
	     	int mid = (start + end)/2;
			
			if (arr[mid] < num) {
				
				start = mid;			
				
			} 
			else if (arr[mid] > num){
				end = mid;
				
			}
			else {
				System.out.println("Found match");
				break;
			}
		}	
			
	}
	
	 /* public int binarySearch(int[] inputArr, int key) {
	         
	        int start = 0;
	        int end = inputArr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	                return mid;
	            }
	            if (key < inputArr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return -1;
	    }
	  
	    public static void main(String[] args) {
	         
	        BinarySearch mbs = new BinarySearch();
	        int[] arr = {11,22,33,44};
	        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 50));
	      
	    }*/

}
