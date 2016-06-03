package Action01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Vector;

public class Task2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
//	List<String> list = new Vector<>();
	addEntity(list);
}
public static void addEntity(List<String> list) {
	list.add("10");
	list.add("20");
	list.add("30");
	list.add("5");
}
public void print(List<String> list) {
	System.out.println(list);
	for (String str : list) {
		System.out.println(str);
	}
	Iterator<String>iter =list.iterator();//универскальный механизм для обхода всех.Наборы данных.В не завсимости если индекс у элемента.
	while(iter.hasNext()){
		String s=iter.next();
		System.out.println(s);
		iter.remove();
	}
}
}
