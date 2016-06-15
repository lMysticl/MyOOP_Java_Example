

package week5.lesson10;

public class Task1 {

	public static void main(String[] args) {
		//f(3);
	System.out.println(m(5));
	}
	//рекурсионный вывод
	public static void f(int k) {
		System.out.println(k);//несходящий
		if (k > 0)
			f(k - 1);
		System.out.println(k);//восходящий
	}
	public static int m(int k){
		if(k>3)return k+m(k-1);
				return k;
		
	}
}
