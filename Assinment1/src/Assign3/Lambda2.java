package Assign3;
public class Lambda2{

interface Thread1{
	public void run();
	public default void hasan() {
	  Thread t=new Thread();
	  Thread h=Thread.currentThread();
	  System.out.println(" before thread ..");
	  try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		//e.printStackTrace();
	}
	  System.out.println(" after thread sleep position ");
	  for(int i=0;i<4;i++) {
		   System.out.println(i);
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	  }
	}}
	interface abdul22{
		public void run();
		   public default  void abdul() {
			   try {
					Thread t=Thread.currentThread();
					Thread h=Thread.currentThread();
					Thread.sleep(1000);
					System.out.println(" finished....");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	}
	  
   public static void main(String[] args){
	   Thread1 e=()->{
		   
	   };
	   e.hasan();
	   abdul22 q=()->{
		   
	   };
	   q.abdul();
	   
   }
   }

 
 