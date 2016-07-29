/*������ 3. �������� ����� ��������, ��� ��� ��������� Animal ���������� ����������. 
 ��� ������ ����������� ����� say(������� �� ����� ���������):
 ����� Cat ������� "���"
 ������ Dog ������� "���"
 ��� Leo ������� "����"*/
package AnimalGeneric;

public class AnimalGeneric<T> {
	public T leo;
	public T cat;
	public T dog;

	public void say(int i) {
		int value = 0;
		if (i == 1) {
			value = 1;
		} else if (i == 2) {
			value = 2;
		} else if (i == 3) {
			value = 3;
		}
		switch (value) {
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("����");
			break;
		default:
			System.out.println("�������� �������� �� 1-3 ");
			break;
		}

	}

	public static void main(String[] args) {
		AnimalGeneric<?> cat1 = new AnimalGeneric<>();
		System.out.println("�������� �������� : 1-3 " + "\n 1.Cat" + "\n 2.Dog" + "\n 3.Leo");
		cat1.say(2);
	}

}
