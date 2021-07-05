package Assign3;
public class Lambda1{
		Thread t=Thread.currentThread();
		//Thread2 t2=new Thread2();
		//( (Thread2) t2).run();

	public static void main(String[] args) {
		Thread2 thread=()->{
			
		};
		thread.run1();
		Lambda12 lam=()->{
			
		};
		lam.hasan1();
		//new Method1();
	}	}
interface Lambda12{
		public void run();
		public default  void hasan1() {
		Thread t=Thread.currentThread();
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			}catch(Exception e) {
				
		
			}}}}
interface Thread2 {
		public void run();
		public default  void run1() {
			//Thread t=Thread.currentThread();
	        System.out.println(" child thread is excuted...");
		}
}
	


