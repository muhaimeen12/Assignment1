package Assign1;

public class Anonymous1{
   public static void main(String[] args) throws InterruptedException {
	    Thread t=new Thread();
	    Thread1 w=new Thread1();
		Thread h=Thread.currentThread();
		System.out.println(" before thread ..");
		Thread.sleep(6000);
		System.out.println(" after thread sleep position ");
		for(int i=0;i<4;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		((Runnable) w).run();
   }
}
   
 class Thread1{
	public Thread1() {
   abstract class Hasan implements Runnable{
	   public void run() {
			try {
				Thread h=Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.println(" finished....");
			}
    }
		}

	
				
	}
 }