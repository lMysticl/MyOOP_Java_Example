/*������ 3. 
 �������� �����, ����������� � �������� ��������� ������(��� �����).
 ���������� � ���� ���� �������� 10 ��������� �����(�� 0 �� 100) ����� ������. */
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
