/*Task 1. �������� �����, �����������, �������� �� ������ ������.
 *  ��������������� Integer. valueOf( str ). 
 *  ���� ������ �� �����, �� ����� ������ ������ ���������� NullPointerException.*/
package Error;

public class Task1 {
	public static void main(String[] args) throws Exception {

		try {
			String s = "2sa";
			Integer.parseInt(s);

		} catch (NumberFormatException e) {
			System.err.println("NullPointerException");
			 throw new Exception("NullPointerException");
		} finally {System.err.println("������ �����");
		}

	}
}
