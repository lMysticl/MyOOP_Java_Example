package week4.lesson08;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("file1.txt");
		fw.write("a\nb\nc\nd");// \n \r\n
		// fw.write("stroka 2");
		fw.flush();
		fw.close();
	}
}