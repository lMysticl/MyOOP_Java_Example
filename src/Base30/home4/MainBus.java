package home4;

public class MainBus {
	public static void main(String[] args) {
		Bus bus0 = new Bus();
		bus0.printAboutMe();
		for (int i = 0; i < 10; i++) {
			bus0.addHuman((int) (Math.random() * 10 - 5));
			bus0.printAboutMe();
		}
	}
}
