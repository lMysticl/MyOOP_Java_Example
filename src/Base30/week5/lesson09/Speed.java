package week5.lesson09;
import java.util.Arrays;
public class Speed {


	 public static void main(String[] args) {
	  int[] arr1 = new int[500];
	  long timeBegin;
//	  long t2;
	  long scoreTime;
	  for (int i = 0; i < arr1.length; i++)
	   arr1[i] = (int) (Math.random() * 100);

	  System.out.println(Arrays.toString(arr1));
	  int[] arr2 = Arrays.copyOf(arr1, arr1.length);
//	  int[] arr3 = Arrays.copyOf(arr1, arr1.length);

	  timeBegin = System.nanoTime();
	  otherSort(arr1);
	  scoreTime = System.nanoTime() - timeBegin;
	  System.out.println(scoreTime);

	  timeBegin = System.nanoTime();
	  bubblesort(arr2);
	  scoreTime = System.nanoTime() - timeBegin;

	  System.out.println(scoreTime);
	 }

	private static void bubblesort(int[] arr2) {
	}

	private static void otherSort(int[] arr1) {
	}

	}

