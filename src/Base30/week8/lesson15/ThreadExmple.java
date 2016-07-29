package week8.lesson15;

public class ThreadExmple {
	 public static class Test extends Thread{
	  private String name;
	  Test(String name){
	   this.name = name;
	  }
	  public void run(){
	   for(int i=0;i<2000;i++){
	    System.out.println(name+i);
	    if(isInterrupted())return;
	   }
	  }  
	 }
	 public static void main(String[] args) throws InterruptedException {
	  Test thr1 = new Test("Thr1_");
	  Test thr2 = new Test("\tThr2_");
	  int example = 1;
	  //
	  System.out.println("������1="+thr1.getState());//NEW 
	  //
	  if(example == 1){   
	   thr1.start();
	   System.out.println("������2="+thr1.getState());//RUNNABLE
	   thr2.start();   
	  }
	  //
	  if(example == 2){
	   thr1.start();
	   thr1.join();//thr1.start().join();
	   thr2.setPriority(Thread.MAX_PRIORITY);
	   thr2.start();   
	   System.out.println("������3="+thr1.getState());//TERMINATED   
	  }
	  //
	  if(example == 3){
	   thr1.setDaemon(false);
	   thr1.start();     
	  }
	  //
	  if(example == 4){
	   thr1.setDaemon(true);
	   thr1.start();     
	  }
	  //
	  if(example == 5){
	   thr1.start();   
	   Thread.sleep(50);
	   thr1.interrupt();
	   //thr1.join();
	   System.out.println("������4="+thr1.getState());
	  }
	  if(example == 6){
	   thr1.start();   
	   Thread.sleep(10);
	   thr1.interrupt();
	   thr1.join();
	   System.out.println("������5="+thr1.getState());
	  }  
	  System.out.println("end of main");
	 }
	}
