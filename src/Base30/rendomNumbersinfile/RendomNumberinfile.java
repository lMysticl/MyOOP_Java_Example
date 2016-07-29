/*Задача 3. 
 Написать метод, принимающий в качестве параметра строку(имя файла).
 Необходимо в этот файл записать 10 случайных чисел(от 0 до 100) через пробел. */
package rendomNumbersinfile;

import java.io.*;
import java.util.*;

public class RendomNumberinfile {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> file = new ArrayList<Integer>();
	//	FileReader reader = new FileReader("RandomNubmers.txt");
	
		for (int i = 0; i < 10; i++) {
			file.add((int) (Math.random()*100));
		}	
		FileWriter writer = new FileWriter("RandomNubmers.txt");
		writer.flush();
		for (int integer : file) {
			writer.write(integer + " ");
		}
		writer.close();
//		reader.close();
	}
}
