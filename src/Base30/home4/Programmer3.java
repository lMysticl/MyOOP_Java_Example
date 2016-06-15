package home4;

public class Programmer3 {

	int rain = 1;
	int sun = 2;
	int dry = 3;
	int time = 0;
	int income3 = 0;

	public Programmer3(int weather, int time, int earns) {
		if (weather == 1) {
			this.time = time - 2;
			income3 = earns * this.time;

		} else if (weather == 2) {
			this.time = time - 1 / 2;
			income3 = earns * this.time;

		} else if (weather == 3) {
			this.time = time - 1;
			income3 = earns * this.time;
		}

	}

	public void printAboutMe() {
		System.out.println("Третий програмист заработает: " + income3);

	}
}
