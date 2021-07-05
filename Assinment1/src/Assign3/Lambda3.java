package Assign3;
//import Assign1.Hello.ReservationCounter;
/*Objectives of this exercise
* How to make two threads work on a single object...
* How to create two threads and assign two jobs
* How to control threads
*/
public class Lambda3 {
	interface lam{
		public void run();
	public default  void muhai() {
		Thread t=Thread.currentThread();
		Thread t1=Thread.currentThread();
//		Thread t2=Thread.currentThread();
		t.setName("muhaimeen");
//		t1.setName("hasan");
//		t2.setName("abdul");
		System.out.println("Reservation counter starting working..."+t.getName());
		ReservationCounter a=new ReservationCounter() {
				public void  bookTicket(int amt,String string) {
					super.bookTicket(amt,string);
					//t.setName("imran");
					//t1.setName("abdul");
				}
				@Override
				public void giveChange(String string) {
					super.giveChange(string);
				}
				@Override
				public void muhai() {
					
				}
			};
//			Thread t=Thread.currentThread();
//			Thread t1=Thread.currentThread();
//			t1.setName("hasan");
//			t2.setName("abdul");
		    

	
	a.bookTicket(500,"hasan");
	a.giveChange("hasan");
	a.bookTicket(1000,"abdul");
	a.giveChange("abdul");
	};
	}
	public static void main(String[] args){
		lam a=()->{
			
		};
		a.muhai();
		
//	     BookingJob sw=new BookingJob(a, 500);
//	     BookingJob sq=new BookingJob(a, 1000);
//		Thread hasan=new Thread(sw,"hasan");
//		Thread abdul=new Thread(sq,"abdul");
//	
//		hasan.start();
//		try {
//			abdul.wait(1000);
//		} catch (Exception e) {
//			//e.printStackTrace();
//			abdul.start();
//		}
//		//bdul.start();
		
	}}
//class BookingJob implements Runnable{
interface hasan{
	public void muhai();
//	public static final ReservationCounter central = new ReservationCounter();
//	public static final int amt = 0;
	 public static  void BookingJob(ReservationCounter central,int amt) { 
		central=central;
		amt=amt;
	 }
	public static void run() {
		//synchronized (central) {
	   
		}
	}
abstract class ReservationCounter{
	public abstract void muhai();
	 public static  void BookingJob(ReservationCounter central,int amt) { 
			central=central;
			amt=amt;
		 }
	int amt;
	public void bookTicket(int amt, String string) {
		Thread t=Thread.currentThread();
		//Thread t1=Thread.currentThread();
		//t.setName("hasan");
		//t2.setName("abdul");
		this.amt=amt;
		String name=string;
		System.out.println(name+" has come to book the ticket...");
		System.out.println(name+" brought...:"+amt);
		
		
	}
	public void giveChange(String  string) {
		Thread t=Thread.currentThread();
		//Thread t1=Thread.currentThread();
		//t1.setName("hasan");
		//t2.setName("abdul");
		String name=string;
		System.out.println("Change given to...:"+name);
		System.out.println(name+" takes...:"+(amt-100));
	}
	}

//	 public default  void run() {
//			//synchronized (central) {
//		   central.bookTicket(amt,"hasan");
//	       central.giveChange("hasan");
//			//}
//		}





