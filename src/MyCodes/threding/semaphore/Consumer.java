package MyCodes.threding.semaphore;

public class Consumer extends Thread{
    
    ProcuctQueue q;
     
    public Consumer(ProcuctQueue q){
        this.q=q;
        this.setName("Consumer Thread");
        this.start();
    }
     
    public void run(){
        for(int i=0;i<5;i++){
            q.getProductFromQ();
        }
         
    }
 
}
