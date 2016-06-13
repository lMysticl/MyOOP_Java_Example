package week1.lesson02;

public class MainKitchenProcessor {
	public static void main(String[] args) {
		KitchenProcessor obj1 = new KitchenProcessor();
		KitchenProcessor obj2 = new KitchenProcessor();
		obj1.marka = "Spensor";
		obj2.marka = "Bosh";
		obj1.color = "Purpul";
		obj2.color = "Coral";
		obj1.addVeg(-2);
		obj1.printAboutMe();
		obj2.addVeg(-2.0);
		obj2.printAboutMe();
		obj2.addVeg(10.0);
		obj1.addVeg(10);
		obj1.start();
		obj1.printAboutMe();
		obj2.printAboutMe();
		System.out.println(obj2.getMarka());
		obj2.setMarka("Ebosh");
		System.out.println(obj2.getMarka());
		System.out.println(obj2.getColor());
		obj2.setColor("Green");
		System.out.println(obj2.getColor());
		if(obj2.getColor().equals("Green")){
		System.out.println("Green");}
		else System.out.println("NONE");
		System.out.println("************");
		KitchenProcessor obj3 = new KitchenProcessor("Philips");
		obj3.setColor("Green");
		obj3.printAboutMe();
		KitchenProcessor obj4 = new KitchenProcessor("Sony","Green");
		obj4.printAboutMe();
		
	}
}
