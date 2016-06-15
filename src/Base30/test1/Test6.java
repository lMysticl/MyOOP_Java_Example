/*Common denominators
You will have a list of rationals in the form
 { {numer_1, denom_1} , ... {numer_n, denom_n} }
where all numbers are positive ints.
You have to produce a result in the form
 (N_1, D) ... (N_n, D)
in which D is as small as possible and

 N_1/D == numer_1/denom_1 ... N_n/D == numer_n,/denom_n.
Example :
 { {1, 2}, {1, 3}, {1, 4} } produces the string (6,12)(4,12)(3,12)*/
package test1;
public class Test6 {

	public static String convertFrac(long[][] lst) {
		long max = 0;
		String str = "";
		for (int i = 0; i < lst.length; i++) {
			for (int j = 0; j < lst.length-1; j++) {
				if (max < lst[i][j]) {
					max = lst[i][j];
				}
				System.out.println(lst[i][j]);
				
			}
			System.out.println();
		}	

		for (int i = 0; i < lst.length; i++) {
			for (int j = 0; j < lst.length-1; j++) {
				if (max % lst[i][j] == 0) {
				} else {
					max = max * lst[i][j];				
				}
			}
		}
		
		for (int i = 0; i < lst.length; i++) {
			for (int j = 0; j < lst.length-1; j++) {
				if (lst[i][j] == lst[0][0]) {
					str = str + "(" + max / lst[i][j + 1] + ",";
				} else if (lst[i][j] % 2 == 0) {
					str = str + max / lst[i][j - 1] + ")";
				} else if (lst[i][j] % 2 != 0) {
					str = str + max / lst[i][j - 1] + ")";
				}

			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		long[][] lst = new long[][] { { 1, 2 }, { 1, 3 }, { 1, 4 }};
		convertFrac(lst);
		System.out.println(convertFrac(lst));
	
	}

}
