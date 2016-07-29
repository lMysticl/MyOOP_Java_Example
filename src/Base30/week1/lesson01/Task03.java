package week1.lesson01;

public class Task03 {

	public static void main(String[] args) {
		char a = ' ';
		System.out.println((int) a);
		printCount("  d  s fghfh   dfhdfh");
	}

	public static void printCount(String s) {
		// ѕосчитать количество слов(написать метод)
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 32) {

				if (i > 0) {
					if (s.charAt(i - 1) == 32) {
						continue;
					}
				}
				count++;
			}
		}
		System.out.println(count);
	}
}
