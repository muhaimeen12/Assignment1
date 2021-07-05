package Assign2;

import day16.OptimisticLock;
//import Assign1.CounsellingJob;
public class Method4 {
	public static void muhai1() {
		CounsellingHall university=new CounsellingHall() {
			Thread t=Thread.currentThread();
			Thread t1=Thread.currentThread();
			public void table1() {
				t.setName("imran");;
				this.table1(t.getName());
			}
			public void table2() {
				//t.setName("imran");
				super.table2(t.getName());
			}
			public void water() {
				//t1.setName("taqi");
				super.water(t1.getName());
			}
		};
		university.table1("imran");
		university.table2("imran");
		university.water("taqi");
	}
public static void main(String[] args) {
	optimistic a=Method4::muhai1;
	a.muhai1();
}
interface optimistic{
	public void muhai1();
	public static void CounsellingJob(CounsellingHall university) {
		university=university;
	}
	public static void run() {
		CounsellingHall university = null ;
		Thread t=Thread.currentThread();
		Thread t1=Thread.currentThread();
		t.setName("imran");
		t1.setName("taqi");
		//public void run1() {
			synchronized (university) {
			// TODO Auto-generated method stub
			if(t.getName().equals("imran")) {
				university.table1(t.getName());university.table2(t.getName());
			}
			else if(t1.getName().equals("taqi")){
				university.water(t1.getName());
			}
	}
}
//	CounsellingHall university;
//	public void run() {
//		synchronized (university) {
//		// TODO Auto-generated method stub
//		if(Thread.currentThread().getName().equals("imran")) {
//			university.table1();university.table2();
//		}
//		else if(Thread.currentThread().getName().equals("secondtaqi")){
//			university.water();
//		}
		//}
	}
}
 abstract class CounsellingHall{
	Thread t=Thread.currentThread();
	Thread t1=Thread.currentThread();
		public void table1(String s) {
		System.out.println("entered table1...:"+s);
		//try {Thread.sleep(5000);}catch(Exception e) {}
	}
	 public void table2(String s) {
		System.out.println("entered table2...:"+s);
	}
	 public void water(String q) {
		System.out.println("entered water area to drink water....:"+q);
	}
}
interface Runnable{
	public void run();
}


