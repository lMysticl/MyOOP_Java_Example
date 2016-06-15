/*Description:

Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square all numbers k (0 <= k <= n) between 0 and n. Count the numbers of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.

Examples:

n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
We are using the digit 1 in 1, 16, 81, 100. The total count is then 4.

nb_dig(25, 1):
the numbers of interest are
1, 4, 9, 10, 11, 12, 13, 14, 19, 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441
so there are 11 digits `1` for the squares of numbers between 0 and 25.
Note that 121 has twice the digit 1.*/
package test1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test9 {
	static class CountDig {

		public static int nbDig(int n, int d) {
			int needle = String.valueOf(d).charAt(0);
			int count = 0;
			for (int i = 0; i <= n; i++) {
				String haystack = String.valueOf(i * i);
				count += (int) haystack.chars().filter(ch -> ch == needle).count();
			}
			return count;
		}
	}

	public static int nbDig1(int n, int d) {

		return (int) IntStream.rangeClosed(0, n).map(i -> i * i).flatMap(i -> String.valueOf(i).chars())
				.mapToObj(i -> (char) i).mapToInt(Character::getNumericValue).filter(i -> i == d).count();
	}

	public static int nbDig3(int n, int d) {
		ArrayList<Integer> squares = new ArrayList<Integer>();
		int i = 0;
		int count = 0;
		String dstr = Integer.toString(d);

		while (i < n + 1) {
			squares.add(i * i);
			i++;
		}

		StringBuilder temp = new StringBuilder("");
		int index;
		for (Integer num : squares) {
			temp.setLength(0);
			temp.append(Integer.toString(num));
			while (true) {
				index = temp.indexOf(dstr);
				if (index < 0)
					break;
				else {
					count++;
					temp.setCharAt(index, 'x');
				}
			}

		}
		return count;
	}

	public static int nbDig4(int n, int d) {
		long[] arr = new long[n + 1];
		int num = 0;
		int count = 0;
		for (int i = 0; i <= n; i++) {
			arr[i] = i * i;
		}
		for (int i = 0; i <= n; i++) {
			long dig = arr[i];
			do {
				num = (int) dig % 10;
				dig /= 10;
				if (num == d)
					count++;
			} while (dig > 0);
		}
		return count;
	}

    public static int nbDig5(int n, int d) {
        int count = 0;
          for(int i = 0; i <= n; i++){
              String k = i*i + "";
              for(String x : k.split("")){
                  if(x.contains(d + "")){
                      count++;
                  }
              }
          }
        return count;
      }

}
