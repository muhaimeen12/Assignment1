package Assign2;
public class Method2{
	  Thread t=new Thread();
	  Thread h=Thread.currentThread();
	public static void hasan() {
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
	}
		   public static void abdul() {
			   try {
					Thread t=Thread.currentThread();
					Thread h=Thread.currentThread();
					Thread.sleep(1000);
					System.out.println(" finished....");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	  
   public static void main(String[] args){
	   Thread1 s=Method2::hasan;
	   s.hasan();
	   Thread1 a=Method2::abdul;
	   a.hasan();
	   
   }
}

 interface Thread1{
   public void hasan();
	
 }
 class abdul{
	 
 }