package week7.lesson12;



public class Test {
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
