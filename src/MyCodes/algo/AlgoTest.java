package MyCodes.algo;

public class AlgoTest {

	public static void main(String[] args) {
	
		String s ="getting good at coding needs a lot of practice";
		String [] arry = s.split(" ");
		
		int i = 0;
		int l = arry.length-1;
		
		while (i < l){
			if (arry[i] == " ") {
				i++;
				continue;
			}
			if (arry[l] == " ") {
				l--;
				continue;
			}
			
			String temp = arry[l];
			arry[l] =arry[i];
			arry[i]= temp;	
			i++;
			l--;
			
			
		}
		
		System.out.println(arry.toString()); 
		for (String ss: arry){
			System.out.print(ss+ " "); 
		}

	}

}
