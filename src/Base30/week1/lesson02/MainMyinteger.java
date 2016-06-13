package week1.lesson02;

public class MainMyinteger {
		 public static void main(String[] args){
		  MyInteger a = new MyInteger(10);
		  MyInteger b = new MyInteger(20);
		 
		  MyInteger c = a.plus( b );
		
		  System.out.println(a.getValue() + " + " + b.getValue() + " = " + c.getValue());
		 }
		}
