/* ������� ����� ���� �� ������ ������ "������� � ������������".
 ������ Fish � Product.
 ���� ������ �����:
 - ������� ���� ����, ����� void printPrice()
 - ������� ���� ��������, ����� void printStoragePeriod()
 - ��������, ����� void swim()
 - ���������� ������ ����, ����� void cannibalism(Fish fish)
 - ������� ���� �������� � ����, ����� void printBarAndPrice()*/
package Product;


public class MainProduct {
	public static void main(String[] args) {
		
		
		Fish farel = new Fish();
		Fish som = new Fish();
		som.priceF(20);
		som.setFish(som);
		farel.setFish(farel);
		som.cannibalism(farel);
		farel.printStoragePeriod();
		farel.printPrice();
		farel.swim();
		
		
	}
}
