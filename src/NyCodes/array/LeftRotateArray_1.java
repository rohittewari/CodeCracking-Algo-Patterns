package NyCodes.array;

import java.util.Scanner;

public class LeftRotateArray_1 {
	
	public static void main(String[] args) {
	
		int [] arr = {5,8,3,6,9,12};	
		int k=2;
		int[] arrRotated =new int[arr.length];	
		printArray(arr);
		System.out.println("\n---------left rotate-----------");	
		leftRotate(arr,arrRotated, k);		
		printArray(arrRotated); 
		System.out.println("\n---------right rotate-----------");
		rightRotate(arr,arrRotated, k);
		printArray(arrRotated); 
	}

	private static void leftRotate(int[] arr, int[] arrRotated, int k) {
		int size= arr.length;
		int s = size;
		int start =size-1-k;
		while (s>0){
			if (start<0){
				arrRotated[size-1]=arr[s-1];
				size--;
				s--;
				continue;
			}
			arrRotated[start]=arr[s-1];
			start--;
			s--;
		}
	}

	private static void rightRotate(int[] arr, int[] arrRotated, int k) {
		
		int size = arr.length;
		int s= 0;
		int start = k;
		int i=0;
		while (s<size-1){
			if (start>size-1){
				arrRotated[i]=arr[s];
				i++;
				s++;
				continue;
			}
			
			arrRotated[start]=arr[s];
			start++;
			s++;
		}
		
		// 5 8 3 6 9
		//     5 8 3
		// - - - - -
	}
	
	
	private static void printArray(int[] arr) {
		for (int a:arr){
			System.out.print(a+" "); 
		}
	}

}

/**
 0 1 2 3 4 5
 
       when i==0, switch to size-1
 - - - - - -
 
 
*/