package SortMain;

public class SortMain {
		public static void main(String[] args) {
		Sort sort = new Sort();
		int[] array = new int[100];
		long before, after;
		Sort.setArray(array);
		Sort.showArray(array);
		//Глупая сортировка
		int[] stupied = sort.copyArray(array);
		before = System.currentTimeMillis();
		sort.stupiedSort(stupied);
		after = System.currentTimeMillis();
		Sort.showArray(stupied);
		System.out.println("Время работы :" + (after - before));
		//Пузырьковая сортировка
		int[] bubble = sort.copyArray(array);
		before = System.currentTimeMillis();
		Sort.bubbleSort(bubble);
		after = System.currentTimeMillis();
		Sort.showArray(bubble);
		System.out.println("Время работы :" + (after - before));
		//Сортировка выборкой
		int[] selection = sort.copyArray(array);
		before = System.currentTimeMillis();
		Sort.bubbleSort(selection);
		after = System.currentTimeMillis();
		Sort.showArray(selection);
		System.out.println("Время работы :" + (after - before));
		}
		}

