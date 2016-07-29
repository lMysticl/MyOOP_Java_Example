/*Task5. Написать рекурсивный метод, проверяющий является ли число простым.*/
package week5.lesson10;

public class Simple {
	
	public static void main(String[] args) {
		
		
		if(isSimple(53, 2)==true)System.out.println("простое");
		else System.out.println("не простое");
	}

	public static boolean isSimple(int number, int i) {
		if (number == 1)
			return false; // 1 - не простое число
		if (number == 2)
			return true; // особый случай

		if (number % i == 0)return false;

		if (i <= Math.sqrt(number)) // проверяем не все делители а только до
									// корня квадратного из числа
			return isSimple(number, i + 1);
		else
			return true;
	}
}
