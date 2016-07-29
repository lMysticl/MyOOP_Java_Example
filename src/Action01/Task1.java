package Action01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws Exception {
		String sFile = "file1.txt";
		String s2 = " \"Text\" ";

		File file = new File("d://book/dir1/file2");
		new File("d:\\\\book\\dir2\\file.txt");
		new File("file.txt");
		String s = File.separator;//слеш в ту стороно операционной системы
		//new File(File.separator+File.separator+"file.txt");
		file.isFile();
		file.isDirectory();
		file.exists();
		file.createNewFile();
		file.mkdir();//полный путь
		file.mkdirs();
		File[] arr = file.listFiles(); // isDirectory()
		// if(arr != null) for(File f: arr){s.o.p(f);} - вывести на экран

		Scanner scan1 = new Scanner(System.in);
		if (scan1.hasNextInt()) {
			int k = scan1.nextInt();
		}

		FileWriter fw = new FileWriter(sFile); // file
		fw.write("privet1\r\nprivet2");
		fw.write("privet1\nprivet2");
		String s1 = System.lineSeparator();
		fw.write("privet3");
		fw.flush();
		fw.close();

		FileReader fr = new FileReader(sFile);
		Scanner scan = new Scanner(fr);// System.in
		// next, nextLine, nextDouble, nextInt
		int i = 0;
		while (scan.hasNextLine()) {
			System.out.println(++i + scan.nextLine());
		}
		scan1.close();
		scan.close();
	}
}
