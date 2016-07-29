package SortMain;

import java.util.Arrays;

public class Sort {
		public static void setArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
		arr[i] = (int)(Math.random() * 1000);
		}
		}
		public static void showArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
		}
		public void stupiedSort(int[] array) {
		for (int i = 0; i < array.length - 1;) {
		int idxFirst = i, idxSecond = i + 1;
		if (array[idxFirst] > array[idxSecond]) {
		int tmp = array[idxFirst];
		array[idxFirst] = array[idxSecond];
		array[idxSecond] = tmp;
		i = 0;
		} else {
		i++;
		}
		}
		}
		public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
		if (arr[i] < arr[j]) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		}
		}
		}
		}
		public static void selectionSort(int arr[]) {
		for (int i = 0; i < (arr.length - 1); i++) {
		int minI = i, minJ = i;
		for (int j = (i + 1); j < arr.length; j++) {
		if (arr[j] < arr[minI] & arr[j] < arr[minJ]) {
		minJ = j;
		}
		}
		int tmp = arr[i];
		arr[i] = arr[minJ];
		arr[minJ] = tmp;
		}
		}
		public void insertionSort(int arr[]) {
		int tmp = 0, indexj = 0;
		for (int i = 1; i < arr.length; i++) {
		tmp = arr[i]; indexj = i;
		while (indexj > 0 && arr[indexj - 1] > tmp) {
		arr[indexj] = arr[indexj - 1];
		indexj--;
		}
		arr[indexj] = tmp;
		}
		}
		public int[] copyArray(int[] array) {
		int[] temp = new int[array.length];
		temp = Arrays.copyOf(array, array.length);
		return temp;
		}
		public static void swap(Integer first, Integer second) {
		int tmp = first;
		first = second;
		second = tmp;
		}
		}

