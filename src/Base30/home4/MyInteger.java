package home4;

public class MyInteger 
{
	 private int value;

	 public MyInteger plus(MyInteger obj) {
	  /*
	   * int x = this.getValue();
	   * 
	   * int y = obj.getValue(); int z = x + y; return new MyInteger(z);
	   */

	  return new MyInteger(this.value + obj.getValue());

	 }

	 public MyInteger(int k) {
	  value = k;
	 }

	 public int getValue() {
	  return value;
	 }

	 public void setValue(int value) {
	  this.value = value;
	 }

	}
//{
//private int value;
//
//
//public MyInteger plus(MyInteger i) {  // ����� �������� ����� ���� � ������!
// MyInteger x = new MyInteger(value + i.getValue());
//   
// return x;
//}
//public int getValue() { // � ��������� � ������ ��������
//  return value;
//}
//
//public MyInteger(int i) { // � ������� ��������
// value  = i;
// }
//}
 

