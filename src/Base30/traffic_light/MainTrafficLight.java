/*Task 5. �������� ����� �������� TrafficLight � ������������� EnumTrafColor.
 TrafficLight � EnumTrafColor ��������� ��������� �������������.
 � ������ MainTrafficLight ������� ������ ������ �������� � � ������� ����� for (�������� 10 ���) �������� ����� 
 ������������ ����� � ���������.
 ����� ������ �������������(� main) ��������� ��� ��������� �� �������(��� �������)
  try {
   Thread.sleep(500);
  } catch (Exception e) {
   e.printStackTrace();
  }
 �������� � ���, ����� � ������������ ��� ����� �������� getNextColor, ������� ����������� �������� �� ��������� ����.
 ������������������ ������ � ���������:�,�,�,�,�,�,�,�,�,�,�,�*/
package traffic_light;

public class MainTrafficLight {
	public static void main(String[] args) {
		
		TrafficLight light = new TrafficLight();
		for (int i = 0; i < 10; i++) {
			light.getColor();
		}
		
	}
}
