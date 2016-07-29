/*Task 5. Написать класс Светофор TrafficLight с перечислением EnumTrafColor.
 TrafficLight и EnumTrafColor реализуют отношения делегирования.
 В классе MainTrafficLight создаем объект класса Светофор и с помощью цикла for (например 10 раз) вызываем метод 
 переключения цвета в светофоре.
 Между каждым перечислением(в main) вставляем код замирания на секунду(пол секунды)
  try {
   Thread.sleep(500);
  } catch (Exception e) {
   e.printStackTrace();
  }
 Подумать о том, чтобы в перечислении был метод например getNextColor, который переключает светофор на следующий цвет.
 Последовательность цветов у светофора:ж,з,ж,к,ж,з,ж,к,ж,з,ж,к*/
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
