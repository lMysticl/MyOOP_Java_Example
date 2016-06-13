package week2.lesson04;

public class MainCar {
	public static void main(String[] args) {
		Car porshe = new Car("4444");
		porshe.printAboutMe();
		Car ferarri = new Car("7777","white");
		ferarri.printAboutMe();
		Car bmw = new Car("8888","Black","BMW");
		bmw.printAboutMe();
	}
}
