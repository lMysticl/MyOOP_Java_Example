package week2.lesson04;

public class MainPhone {
	public static void main(String[] args) {
		
		//  Phone phone1 = new Phone("1","Nokia");
		
		  new Phone("2","Samsung");
		  new Phone("3","IPhone");
		  new Phone("4","Nexia");
	
		  //phone.addPhone("1");
		  Phone.isNumberExist("1");
		//  phone1.isNumberExist("5");
		  Phone.printAllNumbers();
		  
		  Phone ph1 = Phone.getRandomPhone();
		  Phone ph2 = Phone.getRandomPhone();
		  ph1.call(ph2.getMyNumber());
		  
		  System.out.println(" find 2: "+Phone.isNumberExist("2"));
		  System.out.println(" find 10: "+Phone.isNumberExist("10"));  
		  
		  
	} 
}
//вроде бы всё, попробуй проверить всё и доделать метод солл =)