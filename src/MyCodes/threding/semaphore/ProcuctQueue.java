package MyCodes.threding.semaphore;

import java.util.concurrent.Semaphore;

public class ProcuctQueue {
    // We must start with Producer semaphore
static Semaphore semProd = new Semaphore(1);
// Start with consumer semaphore unavailable.
static Semaphore semCon = new Semaphore(0);
 
int productId;
 
public void putProductIntoQ(int productId){
    try {
        semProd.acquire();
        this.productId=productId;
        System.out.println(Thread.currentThread().getName()+" Putting(In Q) Product ID:"+productId);
        semCon.release();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
 
public void getProductFromQ(){
    try {
        semCon.acquire();
        System.out.println(Thread.currentThread().getName()+" Getting(From Q) Product ID:"+productId);
        semProd.release();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
     
}

}
