/*This time no story, no theory. The examples below show you how to write function accum:

#Examples:

accum("abcd") --> "A-Bb-Ccc-Dddd"
accum("RqaEzty") --> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") --> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.*/
package test1;

public class Test5 {

	public static String accum(String s) {
		String str = s;
		String value = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (i != length - 1) {
				value = value + str.toUpperCase().charAt(i);

			} else {
				value = value + str.toUpperCase().charAt(i);
			}
			for (int a = 0; a < i; a++) {
				value = value + str.toLowerCase().charAt(i);
			}
			if (i != length - 1) {
				value = value + "-";
			}
		}
		return value;
	}

	public static void main(String[] args) {
		System.out.println(accum("jopa"));
	}
	
	public static String accum2(String s) {
	    StringBuilder bldr = new StringBuilder();
	    int i = 0;
	    for(char c : s.toCharArray()) {
	      if(i > 0) bldr.append('-');
	      bldr.append(Character.toUpperCase(c));
	      for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
	      i++;
	    }
	    return bldr.toString();
	  }

}
