package week4.lesson08;

import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("RandomNubmers.txt");
		Scanner scan = new Scanner(fr);
		int i = 0;
		while (scan.hasNextLine()) {
			i++;
			System.out.println("Line ¹" + i + ": " + scan.nextLine());
		}
		scan.close();
	}
}