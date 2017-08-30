package NyCodes.array;

public class Palindrome {

	public static void main(String[] args) {
        String A= "ABCDCBA";
        /* Enter your code here. Print output to STDOUT. */
        
        int end = A.length()-1;
        int start =0;
        
        while (start <end){
            char c1 = A.charAt(end);
            char c2 = A.charAt(start);
            if (c1!=c2){
            	System.out.println("No Palindrome");
                break;
            }
            start++;
            end--;
        }
        
        System.out.println("Palindrome");

	}

}
