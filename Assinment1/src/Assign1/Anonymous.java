package Assign1;


public class Anonymous{
	public Anonymous() {
		Thread t=Thread.currentThread();
		Thread2 t2=new Thread2();
		( (Thread2) t2).run();
	}
	public static void main(String[] args) {
		new Anonymous();
		Thread t=Thread.currentThread();
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
		
	}
}

class Thread2 {
	public Thread2() {
	class ThreadJob implements Runnable{
		@Override
		public void run() {
			Thread t=Thread.currentThread();
			System.out.println(" child thread is excuted...");
		}
	}
	}
		public void run() {
			Thread t=Thread.currentThread();
	        System.out.println(" child thread is excuted...");
		}
	interface Runnable{
		 public void run();
	}	
}
