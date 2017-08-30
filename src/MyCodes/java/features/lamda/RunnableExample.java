package MyCodes.java.features.lamda;

public class RunnableExample {

	public static void main(String[] args) {
		/*Thread t1 = new Thread(new MyThread());
		t1.run();*/
		Runnable lamdaRunnable = ()->System.out.println("Hello lamda");
		Thread tLamda = new Thread(lamdaRunnable);
		tLamda.run();
	}

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

