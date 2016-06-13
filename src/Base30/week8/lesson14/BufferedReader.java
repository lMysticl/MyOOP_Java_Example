package week8.lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedReader {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("file2.txt");
		int k;
		String value = "";
		int v;
		is.read();
		int len = is.available();
		//System.out.println(len);
		byte[] buf = new byte[len];
		k = is.read(buf);
		System.out.println("k=" + k);
		for (byte b : buf) {
			System.out.println("[" + b + "]=[" + (char) (b) + "]");
			char p = (char) b;
			v = p - '0';
			if (b == 13 | b == 10 | b == 32) {
				if (!"".equals(value)) {
					Integer x = Integer.valueOf(value);
					System.out.println("Число умноженое на два:" + x * 2);
				}
				value = "";
			} else {
				value += v;
			}
		}
	}
}
