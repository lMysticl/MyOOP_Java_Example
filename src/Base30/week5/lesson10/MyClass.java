package week5.lesson10;
	public class MyClass {
		 static int sStatic;
		 int sNonStatic;
		 public static class NestedExmple{
		  public void f1(){
		  }
		 }
		 public class InnerExmple{
		  public void f2(){
		  }  
		 }
	
		
	 public static void main(String[] args) {
		  MyClass.NestedExmple obj1 = 
		    new MyClass.NestedExmple();
		  
		  MyClass.InnerExmple obj2 = 
		    new MyClass().new InnerExmple();
		  obj1.f1();
		  obj2.f2();
		 }
		public class MainNestedInner {
		
		}
	}
