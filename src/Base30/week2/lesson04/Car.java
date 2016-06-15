package week2.lesson04;

public class Car {
	private String number;
	private String color;
	private String marka;
	static int count=0;
	public Car() {
		this(null,null,null);
	}
	public Car(String number) {
		this();
		this.number =number;
		//this(number,null,null);
	}

	public Car(String number,String color) {
		this(number,color,null);
	}
	public Car(String number,String color,String marka) {
		this.color=color;
		this.number=number;
		this.marka=marka;
		count++;
	}

	public void getColor(String с) {
	
	}

	public void getМarka(String m) {
		
	}

	public void getNumber(String n) {
	
	}

	public void setColor(String c) {
		color = c;
	}

	public void setМarka(String m) {
		marka=m;
	}

	public void setNumber(String n) {
		number=n;
	}

	public void printAboutMe() {
		 if(number!=null) System.out.print(number);
		   else System.out.print("не определен");
		  if(color!=null)System.out.print(" "+color);
		  if(marka!=null)System.out.print(" "+marka);
		  System.out.println(", кол-во объектов="+count);
	
	}

}
