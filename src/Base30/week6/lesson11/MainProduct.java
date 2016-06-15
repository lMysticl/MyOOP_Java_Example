/*Task1. Написать класс Product у которого есть поля:
name,price, дата покупки.
с изначальной сортировкой по наименованию.
Пусть продукт выводится на экран: Морковка цена дата
Реализовать возможность отсортировать список:
 - по цене 
 - по дате закупки
В MainProduct:
создать 10 продуктов.
с разной датой закупки и разной ценой.
Вывести список без сортировки
Отсортировать список и вывести на экран
Отсортировать список по цене и вывести на экран
Отсортировать список по дате закупки и вывести на экран*/
package week6.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class MainProduct {
	public static void main(String[] args) {
		
		GregorianCalendar dat1 = new GregorianCalendar(2016,05,15);
		//GregorianCalendar dat2 = new GregorianCalendar(2016,04,15);
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(50,"banan1",dat1));
		list.add(new Product(70,"kokos2",new GregorianCalendar(2016,04,15)));
		list.add(new Product(100,"kivi3",new GregorianCalendar(2017,06,6)));
		list.add(new Product(301,"apple4",new GregorianCalendar(2017,06,6)));
		list.add(new Product(580,"orange5",new GregorianCalendar(2017,05,18)));
		list.add(new Product(1003,"iphone6",new GregorianCalendar(2018,04,6)));
		list.add(new Product(504,"lg7",dat1));
		list.add(new Product(370,"sumsung8",new GregorianCalendar(2016,04,15)));
		list.add(new Product(100,"apple9",new GregorianCalendar(2014,05,6)));
		list.add(new Product(100,"htc10",new GregorianCalendar(2013,12,16)));
		  Collections.sort(list);
	 System.out.println(list.toString());
	 Collections.sort(list,new ComparatorProductYearBoth());
	 System.out.println(list.toString());
	 
	}
	static class  ComparatorProductYearBoth implements Comparator<Product> {
		@Override
		public int compare(Product obj1, Product obj2) {
			// sort by YearBoth
			return (int) (obj1.getPrice() - obj2.getPrice());
		}
	}
}
