package MiniAutoSalon;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniAutoSalon {
	public ArrayList<Car> car = new ArrayList<Car>();
	public ArrayList<Truck> truck = new ArrayList<Truck>();

	public MiniAutoSalon() {
	}

	private static String[] operationNames = { "1. Добавить новый автомобиль ", "2. Добавить новый прицеп ",
			"3. Отобразить список авто ", "4. Отобразить список прицепов ", "5. Выйти" };

	public void printMenu() {
		for (String m : operationNames)
			System.out.println(m);
	}

	public void start() {

		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			printMenu();
			int k = scan.nextInt();
			switch (k) {
			case 1: {
				System.out.println("fucntion Добавить новый автомобиль ");
				car.add(new Car("s123", "red"));
				break;
			}
			case 2: {
				System.out.println("fucntion Добавить новый прицеп");
				truck.add(new Truck("s12345"));
				break;
			}
			case 3: {
				System.out.println("fucntion Отобразить список авто");
				for (int i = 0; i < car.size(); i++) {
					System.out.println(car.get(i).getNumber());//стой, мы вывели ссылки на объекты, что бы получить номер надо гетер
				}
				break;
			}
			case 4: {
				System.out.println("fucntion Отобразить список прицепов");
				for (int i = 0; i < truck.size(); i++) {
					System.out.println(truck.get(i).getNumber());//стой, мы вывели ссылки на объекты, что бы получить номер надо гетер
				}
				break;
			}
			case 5: {
				runWhile = false;
			}
			}
		}
		scan.close();
	}


}
