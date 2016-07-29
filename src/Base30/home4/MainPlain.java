package home4;

public class MainPlain {

	public static void main(String[] args) {
		Plain A380 = new Plain();
		for (int i = 0; i < 10; i++) {
			int a =(int) (Math.random() * 2);
			if (a==1)A380.up();
			else A380.down();
			A380.printAboutMe();
		}
	}

}
