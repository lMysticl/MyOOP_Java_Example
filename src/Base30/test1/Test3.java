/*A square of squares

You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.

Task

Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
The tests will always use some integral number, so don't worry about that in dynamic typed languages.

Examples

Square.isSquare(-1) // => false
Square.isSquare( 3) // => false
Square.isSquare( 4) // => true
Square.isSquare(25) // => true
Square.isSquare(26) // => false*/
package test1;

public class Test3 {
	public static String getMiddle(String word) {
		String str = "";
		str = word;

		if (str.length() % 2 == 0) {
			for (int i = 0; i < 1000; i++) {
				if (str.length() < 3) {
					break;
				}
				str = str.substring(1);
				str = str.substring(0, str.length() - 1);
			}
		} else {
			for (int i = 0; i < 1000; i++) {
				if (str.length() < 2) {
					break;
				}
				str = str.substring(1);
				str = str.substring(0, str.length() - 1);
			}
		}

		return str;
	}

	public static void main(String[] args) {
		System.out.println(getMiddle("gopasfdfs"));
	}
}
