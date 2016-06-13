package MiniAutoSalon;

public class Car {
	String number;
	String color;
	String car;
	public Car(){
		
	}
	public Car(String number){
		this(number,null);
	}
	public Car(String number, String color) {
		this.number=number;
		this.color=color;
	}
	
	public  String getNumber(){
		
	return number;}
	
}
