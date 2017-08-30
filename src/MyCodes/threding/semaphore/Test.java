package MyCodes.threding.semaphore;

public class Test {
	 
    public static void main(String[] args) {
         
        ProcuctQueue pq = new ProcuctQueue();
        Producer p = new Producer(pq);
        Consumer c= new Consumer(pq);
        
        Integer i;
        
    }
}
