package com.java.algo.sort;

public class BubbleSort {
	
	 // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
    
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
       
        for (int i = 0; i < n-1; i++) {
        	boolean swap =false;
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])  {
                   // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap=true;
                }
            }
            if (swap==false) break;
        }
       
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
   

/*	public static void main(String[] args) {
	 
		int [] arr = {5, 1, 4, 2, 8}; //1,4,2,5,8
		
		bubbleSort(arr, 0,arr.length-1);
		
		
	}
	
	private static void bubbleSort(int[] arr, int i, int l) {
	boolean flg = true;
		while(flg) {
			while(i< l){				
				int temp = arr[i+1];
				if (arr[i] >arr[i+1]){
					flg=true;
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
				i++;
			}				
	   }
		
		for(int el: arr){
			System.out.println(el); 
		}
		
	}*/
	
}
