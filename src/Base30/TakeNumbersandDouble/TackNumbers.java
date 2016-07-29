/*Задача 4. 
 Имеется числовой файл (это файл содержащий числа, пробеллы и (Enter) символы конца строки).
 Необходимо с консоли запросить путь на этот файл, необходимо увеличить все числа этого файла 
 в 2 раза и вывест и их на экран.
Например: 17  25 => 34 50*/
package TakeNumbersandDouble;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TackNumbers {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> file = new ArrayList<Integer>();
		 Scanner  scanAdr  = new Scanner(System.in);
		 
		 System.out.println("Ведите путь TakeNumbersandDouble.txt");
		FileWriter writer = new FileWriter(scanAdr.nextLine());
		for (int i = 0; i < 10; i++) {
			file.add((int) (Math.random() * 100));
		}
		
		
		 
		for (int integer : file) {
			writer.write(integer + "\n");
		}
		 System.out.println("Ведите путь для множение масива TakeNumbersandDouble.txt");
		writer.flush();
		
		 FileReader fr = new FileReader(scanAdr.nextLine());
		  Scanner scan = new Scanner(fr);
		  int i = 0;
		  while (scan.hasNextLine()) {
		   i++;
		   System.out.println("Line №" + i+": " + scan.nextLine());
		  }
		  
		  for (int integer : file) {
				writer.write(integer*2 + "\n");
			}
		  writer.flush();			
			  Scanner scan1 = new Scanner(fr);
			  int a = 0;
			  while (scan1.hasNextLine()) {
			   a++;
			   System.out.println("Line №" + a +": " + scan1.nextLine());
			  }
			  writer.flush();
		writer.close();
		scan.close();
		scan1.close();
		scanAdr.close();
	}
}
