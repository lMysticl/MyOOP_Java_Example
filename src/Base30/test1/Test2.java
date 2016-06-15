/*You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

Challenge.getMiddle("test") should return "es"

Challenge.getMiddle("testing") should return "t"

Challenge.getMiddle("middle") should return "dd"

Challenge.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000

#Output

The middle character(s) of the word represented as a string.*/
package test1;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(stringy(9));
	}

	public static String stringy(int size) {
		int k = 0;
		char string1 = '1';
		char value ='0';
		String string = "" ;	
		boolean v =true;
		while (k < size) {
			if (v == true) {		
				string =string+""+string1;
				v=false;
			} else {
				string =string+""+value;
				v=true;
			}
			k++;
		}
		return string;

	}
}
