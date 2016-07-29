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

public class MainTrafficLight {
	public static void main(String[] args) {
		
		TrafficLight light = new TrafficLight();
		for (int i = 0; i < 10; i++) {
			light.getColor();
		}
		
	}
}
