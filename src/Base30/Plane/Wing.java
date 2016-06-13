package Plane;

import java.util.Scanner;

public class Wing {
	public int fuel;
	Scanner scan = new Scanner(System.in);
	public boolean runWhile = true;

	public void takeoff() {
		System.out.println("Ведите количество топливо");
		fuel = scan.nextInt();	
		while (runWhile) {
			if (fuel < 50) {
				System.out.println("Ведите количество топливо");
				fuel = scan.nextInt();
			} else {
				System.out.println("Взлетаем");

				scan.close();
				break;
			}
		}
	}

	public void selectRoute(int[][] coordinates) {
//		for (int i = 0; i < coordinates.length; i++) {
//			for (int f = 0; f < coordinates.length - 1; f++) {
//				coordinates[i][f] = (int) (Math.random() * 10);
//				System.out.print(" "+coordinates[i][f]);
//			}
//		}
		
	}

	public void printRoute() {

	}
}
