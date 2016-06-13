package week1.lesson02;

public class KitchenProcessor {
	String marka;
	String color;
	boolean isWork = false;
	double weigthVegetables;

	public void printAboutMe() {
		String namework = " работаю";
		if (!isWork) {
			namework = " не " + namework;
		}
		System.out.println(marka + " " + color + namework);
		System.out.println(color);
		System.out.println("вес " + weigthVegetables);
	}
	public  KitchenProcessor(){
		
	}
	public  KitchenProcessor(String marka){
		this.marka= marka;
	}
	public  KitchenProcessor(String marka,String color){
		this.marka= marka;
		this.color = color;
	}
	public String getMarka(){
		return marka;
	}
	public String getColor(){
		return color;
	}
	public void setMarka(String marka){
		 this.marka = marka;
	}
	public void setColor(String c){
		// this.color = color;
		color = c;
	}
	public void start() {
		isWork = true;
	}

	public void stop() {
		isWork = false;
	}

	public void addVeg(double x) {
		weigthVegetables += x;
	}
}
