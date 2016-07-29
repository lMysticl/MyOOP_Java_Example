/*Íàïèñàòü ìåòîä, êîòîğûé âûâîäèò n-íûé ÷ëåí ïîñëåäîâàòåëüíîñòè Ôèáîíà÷÷è
A( n ) = A( n-1 ) + A( n-2 );
A( 1 ) = A( 2 ) = 1*/
package week5.lesson10;

public class Fibanachi {
	public static void main(String[] args) {
		System.out.println(m(6));
	}

	public static int m(int k) {
		
		if (k > 1)
		return m(k - 1) + m(k - 2);
		return k;

	}
}
