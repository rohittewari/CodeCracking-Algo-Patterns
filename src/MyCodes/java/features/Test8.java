package MyCodes.java.features;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation  a = (x,y) -> x+y;
		

	}
	
	interface MathOperation {
	      int operation(int a, int b);
	}
	
	private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }

}
