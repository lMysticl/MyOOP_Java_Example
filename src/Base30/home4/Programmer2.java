package home4;

public class Programmer2 {
	int rain = 1;
	int sun = 2;
	int dry = 3;
	int time;
	int income2 = 0;

	public Programmer2(int weather, int time, int earns) {
		if (weather == 1) {
			this.time = time - 4;
			this.income2 = earns * this.time;
			this.income2 -= 20;
		} else if (weather == 2) {
			this.time = time - 1;
			this.income2 = earns * this.time;
			this.income2 -= 20;
		} else if (weather == 3) {
			this.time = time - 2;
			this.income2 = earns * this.time;
			this.income2 -= 20;

		}

	}

	public void printAboutMe() {
		System.out.println("Второй програмист заработает: " + this.income2);

	}

}
