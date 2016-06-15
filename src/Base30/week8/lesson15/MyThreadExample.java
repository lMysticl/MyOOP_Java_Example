package week8.lesson15;

public class MyThreadExample {
	 public static void main(String[] args) throws InterruptedException {
	  MyThread obj1 = new MyThread("Thread1_");
	  MyThread obj2 = new MyThread("\tThread2_");// "/t"-знак табул€ции
//	  obj1.setPriority(10);
	  
	  obj1.start();
	  obj2.start();
	  obj1.join();
	  System.out.println("end of main");
	 }
	}

	class MyThread extends Thread {
	 private String name;
	 public MyThread(String n){
	  name = n;
	 }
	 @Override
	 public void run() {
	  for(int i = 0;i<2000;i++){
	   System.out.println(name+i);
	  }
	 }
	}