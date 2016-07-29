/*Task1. �������� ����� Product � �������� ���� ����:
name,price, ���� �������.
� ����������� ����������� �� ������������.
����� ������� ��������� �� �����: �������� ���� ����
����������� ����������� ������������� ������:
 - �� ���� 
 - �� ���� �������
� MainProduct:
������� 10 ���������.
� ������ ����� ������� � ������ �����.
������� ������ ��� ����������
������������� ������ � ������� �� �����
������������� ������ �� ���� � ������� �� �����
������������� ������ �� ���� ������� � ������� �� �����*/
package week6.lesson11;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Product implements Comparable<Product> {
	private int price;
	private String name;
	private GregorianCalendar date;
	SimpleDateFormat format = new SimpleDateFormat("dd, MM, yyyy");

	public Product(int price, String name, GregorianCalendar date) {
		this.price = price;
		this.name = name;
		this.date = date;
	}

	// class Car implements Comparable<Car>{
	// private String number;
	// private String color;
	// private double yearBoth;
	// @Override

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	@Override
	public int compareTo(Product obj) {
		return this.getName().compareTo(obj.getName());
	}

	@Override
	public String toString() {
		return "[name=" + name + ", date=" + format.format(date.getTime())
				+ "  " + price + "]";
	}

	
}
