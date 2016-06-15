package week7.lesson13;

public class Car implements Comparable<Object>{
	 private int year;
	 @Override
	 public int compareTo(Object obj) {
	  Car car = (Car) obj;
	  return this.year - car.year;
	 }
	}

	class Car1 implements Comparable<Car1>{
	 private int year;
	 @Override
	 public int compareTo(Car1 car) {
	  return this.year - car.year;
	 }
	}
