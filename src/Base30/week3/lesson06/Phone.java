/*�������� ����� ���������.
 - abstract class Phone(String number, boolean camera, int sideSize)
 - class Nokia
 - class Samsung
 - abstract class IPhone{int appleId}
 - class IPhone4
 - class IPhone5
 ��� ����� ������:
  - call(Phone ph) - ������� �����-�� ����� � � �����-�� ������� ������ ������-�� ������� ����� � ������
  - printModel()
  - printAppleId()// ��� �������
������� ����� MainPhone, � ������� ������� ������ ���������.
�������� ���� ��������� � �������� ������� ���� � ������.(Nokia, Samsung, IPhone4, IPhone5)
� ������� ������� 2 (�������)������ �������� � ������� ������ call  � ������ ����� �� ������.
��� ���� ��������� �� ������ ������� ����� printModel.
����� ��� ���� ���������, ��� ������� �������� ������� ����� printAppleId.*/
package week3.lesson06;

public abstract class Phone {
	String number;
	boolean camera;
	int sideSize;

	public Phone(String number, boolean camera, int sideSize) {
		this.number = number;
		this.camera = camera;
		this.sideSize = sideSize;
	}

	public void call(Phone ph) {
		System.out.println(this.number + "  " + this.printModel() + " ������ " + ph.number + "  " + ph.printModel());
	}

	public abstract String printModel();
	 {
	 System.out.println("�����: " + this.getClass().getSimpleName());
	 }
}
