package week5.lesson10;

public class Facterial {
public static void main(String[] args) {
	m(5);
}

public static void m(int k){
	System.out.println(k);	if (k > 0)
		m(k - 1);
	System.out.println(k);
}
}
