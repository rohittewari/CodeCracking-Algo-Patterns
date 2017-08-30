package MyCodes.algo;

public class Palindromic {

	public static void main(String[] args) {
	 String s = "NITIN";   
	 method(s);
	 
		System.out.println("done");

	}

	private static void method(String s) {
		char [] arry = s.toCharArray();
			
			int i = 0;
			int l = arry.length-1;
			
			while (i<l){
				if (arry[i] != arry[l]){
					System.out.println("false");
					break;
				}
				i++; l--;
			}
	}

}
