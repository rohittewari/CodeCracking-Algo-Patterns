package NyCodes.array;

public class TwoDimArray {
	
	public static void main (String [] args){
		int[][] matrix = new int[][]{
	            {1, 1, 2, 2},
	            {1, 1, 1, 1},
	            {1, 2, 3, 4},
	            {1, 2, 1, 1}
            };
          
         int size = matrix.length;
         int [][] rotateMatrix = new int[size][size];
                     
        printMatrix(matrix);
        leftRotate(matrix, rotateMatrix);
           
        System.out.println("----------------------");
        printMatrix(rotateMatrix);
        
        System.out.println("-------Right Rotate---------------");
        printMatrix(matrix);        
        rightRotate(matrix, rotateMatrix);
        System.out.println("----------------------");
        printMatrix(rotateMatrix);
       
        

	}

	private static void rightRotate(int[][] matrix, int[][] rotateMatrix) {
		int size = matrix.length;
		int col=size-1;
		
		for ( int[]row : matrix){
        	int rownum=0;
        	for (int num : row){
        		rotateMatrix[rownum][col] =num;  // 0,0 | 0,4; 0,1| 1, 4, 
        		rownum++;
        	}
        	col--;
        }
		//return size;
	}
	
	private static void leftRotate(int[][] matrix, int[][] rotateMatrix) {
		int size = matrix.length;
		int col =0;
		for ( int[]row : matrix){  
			int rownum=size-1;
        	for (int num : row){        		
        		rotateMatrix[rownum][col] =num;  
        		rownum--; 
        	}        	 
        	col++;
        }
		
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix ){
			for(int num : row){
			 System.out.print(num+" "); 
			}
			System.out.println(""); 
		}
	}

	/*
	 
	 1, 1, 2, 2      2
	 1, 1, 1, 1      2
	 1, 2, 3, 4      1
	 1, 2, 1, 1      1
	 
	 
	       1,0   
           2,0	 
	 0, 1- 3,0  2,1
	 0,0 - 4,0  3,1
	 
	 */
	
}
