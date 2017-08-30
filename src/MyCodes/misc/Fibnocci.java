package MyCodes.misc;

import java.util.LinkedList;

public class Fibnocci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8
			
			int n1 = 0;
			int prev;
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(1);
				
			for (int i=0; i<101; i++){
				prev = queue.getLast();
				queue.add(n1+prev);
				n1 = prev;
					
			}
			System.out.println(queue.toString());
		}		

	
}
