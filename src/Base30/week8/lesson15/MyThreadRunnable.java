package week8.lesson15;

public class MyThreadRunnable {
	 public static void main(String[] args) {
	  MyClass1 obj1Temp = new MyClass1();
	  Thread obj1 = new Thread(obj1Temp);
	  obj1.start();
	  
	  MyClass2 obj2 = new MyClass2();
	  obj2.start();
	  obj2.interrupt();
	 }
	}

	class MyClass1 implements Runnable{
	 @Override
	 public void run(){
	  while(true){
	 //  isInterrupted(); -метода нету
	  }
	 }
	}

	class MyClass2 implements Runnable{
	 private Thread obj;
	 public MyClass2(){
	  obj = new Thread(this);
	 }
	 @Override
	 public void run() {
	  // TODO Auto-generated method stub
	  
	 }
	 public void start(){
	  obj.start();
	 }
	 public void interrupt(){
	  obj.interrupt(); //перенаправили метод 
	 }
	}