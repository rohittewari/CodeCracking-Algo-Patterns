package MyCodes.threding.semaphore;

public class Producer extends Thread{
    
    ProcuctQueue q;
     
    public Producer(ProcuctQueue q){
        this.q=q;
        this.setName("Producer Thread");
        this.start();
    }
     
    public void run(){
        for(int i=0;i<5;i++){
            q.putProductIntoQ(i);
        }
         
    }
 
}