package MyCodes.dataTypes;

public class InstanceChecking {
	
	public static void main(String args[]){  
		Integer integer = new Integer(10);
		doSomething(integer); 
	}

	public static void doSomething(Number param) {
		  if( param instanceof Double) {
		    System.out.println("param is a Double");
		  }
		  if( param instanceof Integer) {
		    System.out.println("param is an Integer");
		  }
		  if( param instanceof Number) {
			    System.out.println("param is an Number");
			  }

		  if( param instanceof Comparable) {
		    //subclasses of Number like Double etc. implement Comparable
		    //other subclasses might not -> you could pass Number instances that don't implement that interface
		    System.out.println("param is comparable"); 
		  }
		  String s = "Hello";
		    String g = null;
		    if (s instanceof java.lang.String) {
		       System.out.println("s is a String");
		    }
		    if (g instanceof java.lang.String) {
		       System.out.println("g is a String");
		    }

}

	
}
