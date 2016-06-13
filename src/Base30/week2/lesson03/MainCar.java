package week2.lesson03;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		 car1.printAdoutMe();
		Car car2 = new Car(10);
		 car2.printAdoutMe();
		Car car3 = new Car("BB 22121","White");
		 car3.printAdoutMe();
		Car car4 = new Car("CC 546712 ","Black");
		 car4.printAdoutMe();
		 //*********************
		 Car.name ="avto";
		 Car.name ="automobile";
		 System.out.println(Car.name);
		 Car.f();
		// System.out.println(car);
		// car.printAdoutMe();
//		car1.setNumber("AA");
//		car2.printAdoutMe();
	}
}
