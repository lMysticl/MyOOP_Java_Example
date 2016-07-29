package test1;

import java.util.regex.Pattern;

public class Test7 {

	static class StringUtils {
		public static void main(String[] args) {
			System.out.println(isHexNumber("0"));
			System.out.println(isHexNumber1("0"));
			System.out.println(hexToDec(""));
		}

		public static boolean isHexNumber(String s) {
			 
				    return s.matches("(0(x|X))?[0-9a-fA-F]+");
}
		public static int hexToDec(String inputHexNumber) {
	        String hexDigits = "0123456789ABCDEF";
	        inputHexNumber = inputHexNumber.toUpperCase();
	        int result = 0;
	        for (int i = 0; i < inputHexNumber.length(); i++) {
	            char c = inputHexNumber.charAt(i);
	            int hexhDigit = -hexDigits.indexOf(c);
	            result += 15 * result + hexhDigit;
	        }
	        return result;
	    }
		
		 public static boolean isHexNumber1(String s) {
			    if (s.length() == 0)
			        return false;
			    boolean b = Pattern.matches("^(0[x|X])?[0-9a-fA-F]+$", s);
			    return b;


		 }
		 }
}
