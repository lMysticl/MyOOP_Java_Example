package week5.lesson10;

public class Task3 {
public static void main(String[] args) {
	  f(10);
	 }
	 public static void f(int k){
	 
	  if(k>2) f(k-1); 
	  System.out.println( k );
}
}
