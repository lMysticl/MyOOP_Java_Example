package week8.lesson14;

public class MainCar {
	 public static void main(String[] args) throws CloneNotSupportedException {
		  
		  Car car1 = new Car("AA 111",new Engine("np 15"));
		  Car car2 = car1.clone();
		  System.out.println("номер двигла авто1="+car1.getEngine());
		  System.out.println("номер двигла авто2="+car2.getEngine());
		  if(car1.getEngine() == car2.getEngine())System.out.println("двигатель один на двоих"); 
		    else System.out.println("двигатели разные");
		  //
		  car1.getEngine().setNomer("Efe");;
		  System.out.println("номер двигла авто1="+car1.getEngine());
		  System.out.println("номер двигла авто2="+car2.getEngine());
		  
		 }
		}