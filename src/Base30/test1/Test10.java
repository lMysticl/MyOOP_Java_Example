/*Description:
The code gives an error!
public static final String a = 123.toString();
Fix it!*/
package test1;

public class Test10 {
	public static class ToString1 {
		  public static final String a = Integer.toString(123);
		}
	public static class ToString2 {
		  public static final String a = String.valueOf(123);
		}
	public class ToString3 {
		  public static final String a = "123";
		}
}
