package week2.lesson03;

public class Car {
	private String number = null;
	private String color;
	static String name;

	public static void f() {
		System.out.println("static");
	}

	// hard methods
	public Car(String number, String color) {
		this.number = number;
		this.color = color;
		System.out.println("String number,String color");
	}

	public Car(String num) {
		this(num, "Prozrachnuy");
		// number = num;
		// this.number=num;
		System.out.println("Car(String num)");
	}

	public Car(int k) {
		// this.setNumber("AA" + k);
		this("AA" + k, "ProZrachni");
		System.out.println("Car(int k)");
	}

	public Car() {
		this("default");
		System.out.println("Car()");
	}

	public void printAdoutMe() {
		System.out.println(number + " " + color + "\n");
	}

	public void setNumber(String num) {
		number = num;
	}

	// private String number;
	//
	// // hard methods
	// public Car(int k) {
	// this.setNumber("AA" + k);
	// }
	//
	// public Car() {
	//
	// }
	//
	// public void printAdoutMe() {
	// System.out.println(this);
	// }
	//
	// public void setNumber(String num) {
	// number = num;
	// }
}
