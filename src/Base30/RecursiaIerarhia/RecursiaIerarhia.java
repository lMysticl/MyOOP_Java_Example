	/*Task6. Написать метод, принимающий в качестве параметра строку с значением папки на компьютере. 
	С помощью рекурсии получить список всех файлов и всех папок этой папки с помощью рекурсии. 
	Дома: Задачу с директориями сделать: без рекурсиии и с помощью рекурсии. 
	С помощью System.nanoTime() - определить какой способ быстрее получать иерархию файлов и папок.*/ 

package RecursiaIerarhia;
import java.io.File; 
import java.io.IOException; 
import java.util.ArrayList; 

public class RecursiaIerarhia {

	
	public static long timeBegin; 
	public static long t2; 
	public static long scoreTime; 
	public static void main(String[] args) throws IOException { 
	listDirs("C:\\"); 
	} 

	public void recSerch() { 
	ArrayList<File> files = new ArrayList<>(); 
	String strDir = "E:\\"; 
	File dir = new File(strDir); 
	files.add(dir); 
	for (int i = 0; i < files.size(); i++) { 
	File f = files.get(i); 
	if (f.isDirectory()) { 
	File[] arr = f.listFiles(); 
	if (arr == null) 
	System.out.println("f=" + f); 
	for (int j = 0; j < arr.length; j++) { 
	files.add(arr[j]); 

	} 

	} 
	System.out.println(files); 

	} 
	} 
	public static void listDirs(String paths) throws IOException { 
	timeBegin = System.nanoTime(); 
	for (File dirs : (new File(paths)).listFiles()) { 

	if (dirs.isDirectory()) 
	System.out.println(dirs.getCanonicalPath()); 
	listDirs(dirs.getCanonicalPath()); 
	scoreTime = System.nanoTime() - timeBegin; 
	System.out.println(scoreTime); 


	} 
	} 
	}
