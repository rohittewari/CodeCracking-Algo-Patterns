package MyExercise;

public class MyStack {
	
	Node head;
	
	public static void main(String[] args) {
		MyStack stack = new MyStack ();
		   String s = "My Name is Rohit"; 
		   char [] ch = s.toCharArray();
		   for (char c : ch) { 
			   System.out.println("Value: "+String.valueOf(c));
		      stack.push(String.valueOf(c));
		   }
		    
		  
		   while (!stack.isEmpty()) {
		      String s1 = stack.pop();
		      System.out.println(s1);
		   
		  }
		   
		   
		}
		
	
	public void push(String str){
		if (head == null) { 
			head = new Node(str);
			return;
		}
		
		Node tmp= new Node (str);
		tmp.next = head;
		head = tmp;		
    } 
	
	
	public String pop (){
	  String str = head.s;
	  Node tmp = head.next;
	  head = tmp;
	  return str;	
	}

	public boolean isEmpty(){
		if (head == null) return true;
		return false;		
	}
	
	
private class Node {
	String s;
	Node next;
	Node (String s){		
		this.s = s;
	}
	}
}
