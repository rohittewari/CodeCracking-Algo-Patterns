package MyExercise;

public class MyQueue {
	
	Node first;
	Node last;
	
	public MyQueue(){
		
	}
	
	public void addToQueue(int data){
		Node newNode = new Node(data);
		if (last!=null){
			last.next=newNode;
		}
		last =newNode;
		
		if (first == null){
			first=last;			
		}
		
	}
	
	public int remove (){
		if (first==null) throw new RuntimeException();
		int data = first.data;
		first = first.next;
		if (first==null){
			last=null;
		}
		
		return data;
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	
	private class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data =data;
		}
		
	}

}
