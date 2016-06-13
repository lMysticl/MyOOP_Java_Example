package home4;

public class MainLift {
	public static void main(String[] args) {
		Lift Otis = new Lift(50, 20, 10, 30);
		for (int i = 0; i < 10; i++) {
			Otis.move((int) Math.random() * 10, (int) Math.random() * 10);
			Otis.printAboutMe();
		}
	}

}
