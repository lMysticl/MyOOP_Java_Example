/*�������: 
 ������� ����� Phone � ������:
 - static Phone[] phones = new Phone[10];
 - String myNumber
 - String marka
 ���������� phones �� �������� ���������, ��� �������� ����������� ����� �����������.
 ��� �������� ������ �������-��������, �� ������ ������� ��� ����� � �� �������� � ���� ������� phones. 
 � ���� ����� �������� �����: 
 - isNumberExist(String number) - ��������� ������� �������� � ����
 - call(String number) - ������� �� ����� "������� �����-��(�����+�����) ������ ������-��(�����+�����)"
 - getRandomPhone() - ���������� ��������� ������� �� ���� ���������
 ����������� � 10 ���������.
 � MainPhone: 
 - ������� ��������� ��������� � ������-�� ��������
 - ����������� ��������� ������� ������������� � ��������������� ������.
 - ��� ���������� �������� ������� ����� call � ����� ������ �� ��������� �������.
 */
package week2.lesson04;

public class Phone {
	static Phone[] phones = new Phone[10];
	String myNumber;
	String mark;
	static String Num;

	public Phone() {
		this(null, null);
	}

	public Phone(String myNumber) {
		this(myNumber, null);
	}

	public Phone(String myNumber, String mark) {
		this.myNumber = myNumber;
		this.mark = mark;
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] == null) {
				phones[i] = this;// ���� � ���� ���� ������ �����, ������ ���
				// ������ �� ������ �� ������ ������ �� ���
				// ������
				break; // ��� �� �� �������� ��� ����, �� ������� ���� �
				// ��������� ��� ����
			}
		}
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public void setmark(String mark) {
		this.mark = mark;
	}

	public static boolean   isNumberExist(String myNumber) {
		int prov = 0; // ��������, ���� ����� ���������� ������� ���
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {// �������� ������ � ����
				if (phones[i].getMyNumber() == myNumber) { // �������� ������
					// ���������
					prov = 1; // ���� ����� ������� ��������
				}
			}
		}
		
		if (prov == 1) {// �������� ���������� ��� ��� � ����� �����
			System.out.println("NymberExist");
			return true; }
		else {
			System.out.println("NotNymberExist");
			return false;}
		
	}

	
		
	public static void printAllNumbers() {
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null)
				Num = phones[i].getMyNumber();
			System.out.println(Num);
		}
	}

	public static Phone getRandomPhone() {

		return phones[((int) (Math.random() * 4))];
	}

	public void call(String myNumber1) {

		System.out.println(myNumber + " ������ " + myNumber1);

	}
}
