package week5.lesson09;

import java.util.Arrays;

public class ArraysFunction {
	{
		  int[] vector = new int[10];
		  vector[0] = 1;
		  int[] vector1 = Arrays.copyOf(vector,vector.length);
		  System.out.println(vector);
		  System.out.println(vector1);
		  //vector[0] = 2;
		  if(Arrays.equals(vector, vector1))System.out.println("равны");
		   else System.out.println("не равны");
		 }
}
