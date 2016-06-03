package Action01;
import java.util.ArrayList;

public class ArrayListEx {
	
 public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  list.add(12);
  
  int capacity = 10;
  int capacity1 = 10;
  int capacity2 = 10;
  
  for(int i=0;i<20;i++){
   System.out.println(capacity + " " + capacity1+" "+capacity2);
   int oldCapacity = capacity+1;
   capacity = oldCapacity + (oldCapacity >> 1);
   capacity1 = (capacity1+1)*3/2;
   capacity2 = capacity2*3/2+1;
  }
 }
}
