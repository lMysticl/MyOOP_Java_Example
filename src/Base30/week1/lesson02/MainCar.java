package week1.lesson02;

public class MainCar {
	public static void main(String[] args) {
		Car car1 =new Car();
	//	car1.color ="White";
		car1.setColor("White");
		car1.setColor("read");
		car1.printAboutMe();
		//car1.color ="psflapls";
		Car car2 = getCar();//конструктор внутри
		car2.printAboutMe();
	}
	public static Car getCar(){
		Car car = new Car();
		car.setColor("Green");
		return car;
	}
}
