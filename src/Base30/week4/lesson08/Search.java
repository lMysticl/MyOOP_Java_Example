/*Task1. Запросить с консоли путь папки и расширение. 
 Вывести на экран все файлы с раширением из этой папки.*/
package week4.lesson08;

import java.io.File;

public class Search {
	public static void main(String[] args) {
		File file1 = new File("F:\\Фото\\Буковель");
		System.out.println("getAbsolutePath()=" + file1.getAbsolutePath());
		System.out.println("getName()=" + file1.getName());
		File dir = new File("F:\\Фото\\Буковель");
		if (dir.isDirectory()) {
			File[] arr = dir.listFiles();
			for (File f : arr) {

				if (f.getName().indexOf("JPG") > -1) {
					System.out.println(f.getName());
				}
			}
		}
	}
}