package MyCodes.algo;

import java.util.Arrays;

public class MinDiff_Array {

	public static void main(String[] args) {
		int [] in = {10,20,32,4,50,6,70};
		Arrays.sort(in);
		int min = in[0];
		//int max = in[0];
		
		for (int i=0; i<in.length-1; i++){
			if (in[i+1]-in[i]<min) min = in[i+1]-in[i];
		}
		//System.out.println("Max: "+max);
		System.out.println("Min: "+min);

	}

}
