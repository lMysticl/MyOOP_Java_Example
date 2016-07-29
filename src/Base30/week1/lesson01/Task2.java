package week1.lesson01;


public class Task2 {
 public static void main(String[] args) {
	String s ="abc,def";
	s.endsWith("c");
	s.startsWith("c");
	s.equalsIgnoreCase("ACB");
	s.isEmpty();
//	String[] arr =s.split(",");
	s.toLowerCase();
	s.toUpperCase();
	s.trim();
//	char[] arr1 = s.toCharArray();
	print(s);
}
 public static void print(String s) {
	 System.out.println(s);
	
}
}
