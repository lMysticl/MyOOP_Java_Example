/*Задача 1. Написать метод для конвертации массива строк(или чисел) в список строк(или чисел).
Конвертировать массив любого типа в список соответствующего типа.*/
package week7.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Covertr {

	public static void main(String[] args) {
		String[] str = { "1", "2", "3", "4", "5" };
		List<String> list = new ArrayList<String>();
		list = myConvertor(str);
		System.out.println("Наш аррейлист:  " + list);

		Integer[] str1 = { 1, 2, 3, 4, 5 };
		List<Integer> list1 = new ArrayList<Integer>();
		list1 = myConvertor(str1);
		System.out.println("Наш аррейлист:  " + list1);

	}

	public static <T> ArrayList<T> myConvertor(T[] str) {
		ArrayList<T> list = new ArrayList<T>();
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		return list;
	}
}