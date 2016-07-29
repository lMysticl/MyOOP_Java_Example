package week7.lesson12;

public class Test2Exception {
	 public static void main(String[] args) {
		  int x = 10;
		  int y = 10;
		  // double y = 0;
		  try {
		   double res = x / y;
		   System.out.println("res="+res);
		  } catch (ArithmeticException e) {
		   System.out.println("Œÿ»¡ ¿ !!!!");
		   System.out.println(e.getMessage());
		   e.printStackTrace();
		  } finally{
		   System.out.println("finally");
		  }
		  System.out.println("end");
		 }
}
