/*Задание1:
Создать список добавить 10 случайных чисел 
и удалить с помощью итератора четные числа.*/
package Action01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		addEntity(list);
		print(list);
	}

	public static void addEntity(List<Integer> list) {

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 10));
		}
	}

	public static void print(List<Integer> list) {
		System.out.println(list);
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			Integer s = iter.next();
			if (s % 2 == 0 ^ s == 0) {
				iter.remove();
			} else {
			}
		}
		System.out.print(list.toString());
	}

}
