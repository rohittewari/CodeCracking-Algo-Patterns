package NyCodes.array;

public class DynamicArray {

	public static void main(String[] args) {
		MyList list = new MyList();
		for (int i=0;i<50;i++){
			list.add(i+1); 
		}
		
		list.print();

	}
	
	private static class MyList {
		
		int capacity;
		int size;
		int [] arr;
		
		public MyList(int s){
			this.capacity=s;
			this.size=0;
			arr = new int[s];
		}
		
		public MyList(){
			this.capacity=10;
			this.size=0;
			arr = new int[this.capacity];
		}
		
		void add(int num){
			if (size <capacity){
				arr[size]=num;
				size++;
			} else {
				this.capacity = capacity+10;
				int [] temp = new int[this.capacity];
				System.arraycopy(this.arr, 0, temp, 0, this.size);
				this.arr = temp;
				arr[size]=num;
				size++;
				
			}
			
		}
		public void print(){
			System.out.println("size: "+this.arr.length); 
			for(int i =0; i<this.arr.length-1;i++){
				System.out.println(this.arr[i]); 
			}
		}
		
	}

}
