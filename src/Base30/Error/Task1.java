/*Task 1. Написать метод, проверяющий, является ли строка числом.
 *  Воспользоваться Integer. valueOf( str ). 
 *  Если строка не число, то метод должен кидать исключение NullPointerException.*/
package Error;

public class Task1 {
	public static void main(String[] args) throws Exception {

		try {
			String s = "2sa";
			Integer.parseInt(s);

		} catch (NumberFormatException e) {
			System.err.println("NullPointerException");
			 throw new Exception("NullPointerException");
		} finally {System.err.println("Ведите число");
		}

	}
}
