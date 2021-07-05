package Assign2;
import Assign2.Method1;


public class Method1{
		Thread t=Thread.currentThread();
		//Thread2 t2=new Thread2();
		//( (Thread2) t2).run();
	public static void main(String[] args) {
		Thread2 run=hasan::hasan1;
		run.run1();
		run.run();
		//new Method1();
	}
		static class hasan{	
			public static void hasan1(){
		Thread t=Thread.currentThread();
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			}catch(Exception e) {
				
			}
		}
}}

interface Thread2 {
		public void run();
		public default  void run1() {
			//Thread t=Thread.currentThread();
	        System.out.println(" child thread is excuted...");
		}
}	}


