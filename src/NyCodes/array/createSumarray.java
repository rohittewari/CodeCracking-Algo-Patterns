package NyCodes.array;

public class createSumarray {

	public static void main(String[] args) {
		int []arr = {1,4, 7, 2, 5, 6};
		int size = arr.length;
	//	int j
		for (int i=0; i<size-1;i++){
			for (int j=i+1; j<size-1-i;j++){
				System.out.println(i +" "+j); 
			}
		}

	}

}
