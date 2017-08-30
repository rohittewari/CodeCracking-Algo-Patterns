package MyCodes.list;

import CtCILibrary.LinkedListNode;

public class LinkedList {
	
	Node head;

	public static void main(String[] args) {
		
		Node first = new Node(1);  //AssortedMethods.randomLinkedList(1000, 0, 2);
		Node head = first;
		Node second = first;
		for (int i = 2; i < 8; i++) {
			second = new Node(i);
			first.next = second;
			//second.setPrevious(first);
			first = second;
		}
		
		System.out.println(printForward(head));

	}
	
	
	void add(int data){
		Node prev=null;
		Node newNode = new Node(1);
		if (head==null) {
			head=newNode;
			return;
		}
		Node curr =head;
		while(curr!=null){
		    prev =curr;
			curr =curr.next;
		 
		}
		prev.next = newNode;
	}
	
	static void reverse(Node head){
		Node current = head;
		Node nextNode =null;
		Node previous = null;
		while(current != null){
			nextNode = current.next;  //2, 3
		  	current.next = previous;    //null, 1
		  	previous =current;   //1, 2
		  	current = nextNode;	//2, 3	
		}
		head = previous;
		//return head;
	}
    
	static String printForward(Node n){
		if (n == null){
			return null;
		} else {
			return n.data +"->"+printForward(n.next);
		}
	}
	
	static class Node {
		int data;
		Node next;
		public Node(int d){
			this.data=d;
		}
	}

}
