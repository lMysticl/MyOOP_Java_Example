package week1.lesson01;


import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		System.out.println(getByConsole("dasdas"));
		scan("");
	}
	public static char getByConsole(String s){
	return s.charAt(0);
	}
	public static String getStrByConsole(String s){
			return scan("Введите строку");
	}
	
	public static String scan(String s)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("ВВедите строку ");
		String a = scan.nextLine();
			return a;
	}
	

}
