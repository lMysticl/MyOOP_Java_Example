/*������ �����.
 ������� ����� ����� �� ������ ������ ��������.
 ������ Cat � Animal.
 ����� ������ �����:
 - ������� �� ����� ���, ����� void printName()
 - ������ �����, ����� void say()
 - ��������� ������ �����, ����� void riseHair()
 - ��������, ����� void eat()
 - ����� ���� ���������, ����� void yellIfNotGorged()*/
package Animal;

public class MainAnimal {
	public static void main(String[] args) {
		
	Cat cat1 = new Cat();

	cat1.printName();
	cat1.say("Barsik");
	cat1.riseHair();
	cat1.eat();
	cat1.yellIfNotGorged();
	
	}
}
