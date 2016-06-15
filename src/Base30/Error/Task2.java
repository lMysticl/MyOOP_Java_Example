/*Task 2. Написать метод, проверяющий, существует ли файл с определенным именем.
 * (Можно использовать FileReader Scanner). 
 * Если файла нет, то метод кидает исключение ArithmeticException.*/
package Error;

//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) throws Exception {
		

		  try(
		   FileReader fr = new FileReader("file1.txt");
		   Scanner scan = new Scanner(fr);
		   ) {
		   while(scan.hasNextLine()){
		    scan.nextLine();
		   }
		  } 
		   catch (FileNotFoundException e1) {
			   throw new Exception("ArithmeticException");
		  } catch (IOException e) {		
			e.printStackTrace();
		}
		 }
	
}
