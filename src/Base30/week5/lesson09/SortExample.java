package week5.lesson09;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArr(arr);
		System.out.println(Arrays.toString(arr));
		// sort3(arr);
		// System.out.println(Arrays.toString(arr));
		sort4(arr);
		System.out.println(Arrays.toString(arr));
	}
//Бульбашковый метод сортировки
	public static void sort1(int[] arr) {
		// sort by index 0 and index 1
		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		//System.out.println(Arrays.toString(arr));
		if (arr[1] > arr[2]) {
			int temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
	}

	public static void sort2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}

	public static void sort3(int[] arr) {
		for (int k = 0; k < arr.length - 1; k++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	public static void fillArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (100 * Math.random());
		}
	}

	public static void sort4(int[] arr) {
		int index = 0, minValue = 0;

		for (int f = 0; f < arr.length; f++) {
			minValue=arr[f];
			for (int k = f; k < arr.length; k++) {
				if(minValue>arr[k]){
					minValue =arr[k];
					index=k;
				}
				
			}
			arr[index]=arr[f];
			arr[f]=minValue;
		}
	}

	public static void sort5(int[] arr) {
	//	int		 indxBegin=arr[0],indxEnd=arr[10],avarage=0;
		

	}

}