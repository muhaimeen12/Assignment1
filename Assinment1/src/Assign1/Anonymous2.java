package Assign1;

//import Assign1.Hello.ReservationCounter;

/*Objectives of this exercise
 * How to make two threads work on a single object...
 * How to create two threads and assign two jobs
 * How to control threads
 */
public class Anonymous2 {
	public static void main(String[] args){
		Thread t=Thread.currentThread();
		Thread t1=Thread.currentThread();
		t.setName("muhaimeen");
		System.out.println("Reservation counter starting working..."+t.getName());
		ReservationCounter a=new ReservationCounter() {
			@Override
			public void bookTicket(int amt,String string) {
				super.bookTicket(amt,string);
				t.setName("imran");
				t1.setName("abdul");
			}
			@Override
			public void giveChange(String string) {
				super.giveChange(string);
			}
			
		};
		a.bookTicket(500,"hasan");
		a.giveChange("hasan");
		a.bookTicket(1000,"abdul");
		a.giveChange("abdul");
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
class BookingJob implements Runnable{
	ReservationCounter central;int amt;
	public BookingJob(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
	}
	@Override
	public void run() {
		//synchronized (central) {
	   central.bookTicket(amt,"hasan");
       central.giveChange("hasan");
		//}
	}
	}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt, String string) {
		Thread t=Thread.currentThread();
		this.amt=amt;
		String name=string;
		System.out.println(name+" has come to book the ticket...");
		System.out.println(name+" brought...:"+amt);
		
		
	}
	public void giveChange(String  string) {
		Thread t=Thread.currentThread();
		String name=string;
		System.out.println("Change given to...:"+name);
		System.out.println(name+" takes...:"+(amt-100));
	}
	}
//interface Runnable{
//	public void run();
//		
//	}


