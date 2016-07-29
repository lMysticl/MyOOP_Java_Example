package week7.lesson12;

public class Test6Exception {
	 @SuppressWarnings("serial")
	public static class MyException extends Exception{
		  public MyException(String message){
		   super(message);
		  }
		     @Override
		     public String getMessage() {
		         return "MyException: " + super.getMessage();
		     }
		 }
		 public static void main(String[] args) throws Exception{
		  throw new MyException("mmm");
		 }
}
