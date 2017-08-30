package MyCodes.java.features.lamda;

public class RunnableExample2 {

	public static void main(String[] args) {
/*	    Thread t1 = new Thread(new Runnable () {
	    	public void run (){
	    		sop();
	    	}
	    });
		t1.run();*/
		Runnable lamdaRunnable = ()->sop();
		Thread tLamda = new Thread(lamdaRunnable);
		tLamda.run();
	}
	
	static public void sop (){
		System.out.println("Hi, SOP Lamda");
	}
	
	class MyThread implements Runnable {
	    
		ProduceConsume pc;
		@Override
		public void run() {
			
			System.out.println("Hi");
		}
		
		
	}

	class ProduceConsume {
		int data;
	}



}




