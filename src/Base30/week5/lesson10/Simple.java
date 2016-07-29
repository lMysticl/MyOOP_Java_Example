/*Task5. �������� ����������� �����, ����������� �������� �� ����� �������.*/
package week5.lesson10;

public class Simple {
	
	public static void main(String[] args) {
		
		
		if(isSimple(53, 2)==true)System.out.println("�������");
		else System.out.println("�� �������");
	}

	public static boolean isSimple(int number, int i) {
		if (number == 1)
			return false; // 1 - �� ������� �����
		if (number == 2)
			return true; // ������ ������

		if (number % i == 0)return false;

		if (i <= Math.sqrt(number)) // ��������� �� ��� �������� � ������ ��
									// ����� ����������� �� �����
			return isSimple(number, i + 1);
		else
			return true;
	}
}
