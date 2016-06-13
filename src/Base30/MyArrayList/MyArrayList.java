/*3. Создать клас MyArrayList<T> с дженериком T
 с полем T[] arr;
 с методами:
 - add
 - get
 - size -iterator
 - toArray()
 - sort
 - forEach-попробовать реализовать такой метод(он принимает интерфейс Consumer)*/
package MyArrayList;

import java.util.ArrayList;

public class MyArrayList<T> {
	MyArrayList<T> list = new MyArrayList<>();
	public ArrayList<T> list1 =new ArrayList<>();
	int DEFAULT_CAPACITY = 10;
	public T[] arr ;
	Integer num = 12;
	public static void main(String[] args) {
		
	
		
		
	//	list1(123);
		 
	}
	
	
	public	 void MyAdd(T val){
		
	//	val = (T) num;
	//	list.add(val);
		list1.add(val);
	//	list.add(val);
		for(int i = 0;i<10;i++){
			list1.get((int) (Math.random()*10));}
	}
	


	
	
	
}
