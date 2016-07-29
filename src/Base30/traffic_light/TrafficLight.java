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

public class TrafficLight {
	private EnumTrafColor[] color;
	 
	public TrafficLight() {
		color = EnumTrafColor.colors();
	}
 
	public EnumTrafColor[] colors() {
		return color;
	}
 
	public void colorIndicator(String str) {
		EnumTrafColor.valueOf(str);
	}
 
	public void getColor() {
		EnumTrafColor  colRed  = EnumTrafColor.Red;
		EnumTrafColor colYellow = EnumTrafColor.Yellow;
		EnumTrafColor colGreen = EnumTrafColor.Green;
		String strRed = colRed.toString();
		String strYellow = colYellow.toString();
		String strGreen = colGreen.toString();
		String[] color = { strYellow, strGreen, strYellow, strRed };
		for (String str : color) {
			try {
				System.out.println(str);
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
 
	enum EnumTrafColor {
 
		Red, Yellow, Green;
 
		public static EnumTrafColor[] colors() {
			return EnumTrafColor.values();
		}
 
		public static void colorIndicator(String str) {
			EnumTrafColor.valueOf(str);
		}
 
	}
}
