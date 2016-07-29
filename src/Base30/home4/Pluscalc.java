package home4;


import java.util.Scanner;

public class Pluscalc {
	public static void main(String[] args) {
		char g[] = {};
		print(g);

	}

	public static void print(char[] m) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите строоку :");
		String a = scan.nextLine();
		ChisloFromString(a);
		System.out.println("¬ведите строоку :");
		String b = scan.nextLine();
		System.out.println(ChisloFromString(a)[0]);
		plus(ChisloFromString(a), ChisloFromString(b));
		System.out.println(plus(ChisloFromString(a), ChisloFromString(b)));
		scan.close();

	}

	public static char[] ChisloFromString(String s) {
		return s.toCharArray();
	}

	// public static ArrayList<Object> Chad(String v) {
	// ArrayList<Object> list = new ArrayList<Object>();
	//
	// for (int i = 0; i < v.length(); i++) {
	// list.add(v.charAt(i));
	// }
	// System.out.println(list);
	// return list;
	// }

	public static String ChisloToString(char[] m) {

		String s = new String(m);
		System.out.println(s);
		return s;
	}

	public static char[] plus(char[] c1, char[] c2) {

		  int length = c1.length > c2.length ? c1.length : c2.length;
		  int tmp = 0;
		  String res = "";

		  for (int i = 1; i <= length; i++) {

		   int arg1 = (c1.length >= i) ? c1[c1.length - i]-'0' : 0;
		   int arg2 = (c2.length >= i) ? c2[c2.length - i]-'0' : 0;

		   int result = arg1 + arg2 + tmp;
		   tmp = result / 10;
		   if (result > 9) {
		    result %= 10;
		   }
		   res = result + res;

		   if (tmp > 0 && i == length)
		    res = tmp + res;
		  }

		  return res.toCharArray();
		 }
}