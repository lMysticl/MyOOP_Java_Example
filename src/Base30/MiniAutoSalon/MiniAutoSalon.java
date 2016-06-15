package MiniAutoSalon;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniAutoSalon {
	public ArrayList<Car> car = new ArrayList<Car>();
	public ArrayList<Truck> truck = new ArrayList<Truck>();

	public MiniAutoSalon() {
	}

	private static String[] operationNames = { "1. �������� ����� ���������� ", "2. �������� ����� ������ ",
			"3. ���������� ������ ���� ", "4. ���������� ������ �������� ", "5. �����" };

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
				System.out.println("fucntion �������� ����� ���������� ");
				car.add(new Car("s123", "red"));
				break;
			}
			case 2: {
				System.out.println("fucntion �������� ����� ������");
				truck.add(new Truck("s12345"));
				break;
			}
			case 3: {
				System.out.println("fucntion ���������� ������ ����");
				for (int i = 0; i < car.size(); i++) {
					System.out.println(car.get(i).getNumber());//����, �� ������ ������ �� �������, ��� �� �������� ����� ���� �����
				}
				break;
			}
			case 4: {
				System.out.println("fucntion ���������� ������ ��������");
				for (int i = 0; i < truck.size(); i++) {
					System.out.println(truck.get(i).getNumber());//����, �� ������ ������ �� �������, ��� �� �������� ����� ���� �����
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
