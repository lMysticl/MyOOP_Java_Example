package Product;

import java.util.Scanner;

public  class Fish extends Product {
	public int priceF;
	public int dateF=2016;
	public boolean swimF=false;
	public Fish fish;
	public int data;
	

	public   void priceF(int data){
		Scanner scan = new Scanner(System.in);
	this.data = data;
	this.data= scan.nextInt();
	System.out.println(" ���� "+this.data);
	scan.close();}
	
	@Override
	public void printStoragePeriod() {
		System.out.println("���� �������� "+dateF);
		
	}

	public  Fish getFish(){
	
		return fish;
				
	}

	public void setFish(Fish fish){
		this.fish=fish;
				
	}
	
	@Override
	public void swim() {
	
		System.out.println("� ����� ");
	}
	@Override
	public void cannibalism(Fish fish) {
				
		System.out.println(this.fish+" som "+" eat "+fish+" farel ");
	}
	@Override
	public void printBarAndPrice() {
		System.out.println("�������� 1234565");
		System.out.println(priceF);
	}
	@Override
	public void printPrice() {
		System.out.println("���� "+priceF);
		
	}

	
}
