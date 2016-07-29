/*1. Сравнить ArrayList vs LinkedList с помощью механизма System.nanoTime().
Вставка случайных чисел от 1 до 10000.
 - вставка вначало( в индекс 0)
 - вставка в середину ( в индекс size()/2)
 - вставка в середину ( в индекс size)
10000 элементов
какая разница в скорости ArrayList, если в конструкторе задавать capacity 10000 или не задавать.
кто быстрее и насколько при подсчете суммы чисел из ArrayList vs LinkedList.

  long time1 = System.nanoTime();
   //
  long time2 = System.nanoTime();
  long score = time2 - time1;*/
package ArrayListvsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListvsLinkedList {
	public static ArrayList<Integer> list1 = new ArrayList<>();
	public static ArrayList<Integer> list2 = new ArrayList<>();
	public static ArrayList<Integer> list3 = new ArrayList<>();
	public static LinkedList<Integer> list4 = new LinkedList<>();
	public static LinkedList<Integer> list5 = new LinkedList<>();
	public static LinkedList<Integer> list6 = new LinkedList<>();

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		MyArrayList1();
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println(list1 + "-Time:" + score);
		long time3 = System.nanoTime();
		MyArrayList2();
		long time4 = System.nanoTime();
		long score4 = time4 - time3;
		System.out.println(list2 + "-Time:" + score4);
		long time5 = System.nanoTime();
		MyArrayList3();
		long time6 = System.nanoTime();
		long score5 = time6 - time5;
		System.out.println(list3 + "-Time:" + score5);
		long time7 = System.nanoTime();
		MyLinkedList4();
		long time8 = System.nanoTime();
		long score6 = time8 - time7;
		System.out.println(list4 + "-Time:" + score6);
		long time9 = System.nanoTime();
		MyLinkedList5();
		long time10 = System.nanoTime();
		long score7 = time10 - time9;
		System.out.println(list5 + "-Time:" + score7);
		long time11 = System.nanoTime();
		MyLinkedList6();
		long time12 = System.nanoTime();
		long score8 = time12 - time11;
		System.out.println(list6 + "-Time:" + score8);

	}

	public static void MyArrayList1() {

		for (int i = 0; i < 10; i++) {
			list1.add(0, (int) (Math.random() * 10));
		}
	}

	public static void MyArrayList2() {
		for (int i = 0; i < 10; i++) {
			list2.add(list2.size() / 2, (int) (Math.random() * 10));
		}
	}

	public static void MyArrayList3() {
		for (int i = 0; i < 10; i++) {
			list3.add(list3.size(), (int) (Math.random() * 10));
		}
	}

	public static void MyLinkedList4() {

		for (int i = 0; i < 10; i++) {
			list4.add(0, (int) (Math.random() * 10));
		}
	}

	public static void MyLinkedList5() {
		for (int i = 0; i < 10; i++) {
			list5.add(list5.size() / 2, (int) (Math.random() * 10));
		}
	}

	public static void MyLinkedList6() {
		for (int i = 0; i < 10; i++) {
			list6.add(list6.size(), (int) (Math.random() * 10));
		}
	}

}
