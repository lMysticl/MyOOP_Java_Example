package home4;

public class Programmer1 {
	int rain = 1;
	int sun = 2;
	int dry = 3;
	int time;
	int income1;

	public Programmer1(int weather, int time, int earns) {
		if (weather == 1) {
			this.time = time - 2;
			this.income1 = earns * this.time;
			this.income1 -= 80;
		} else if (weather == 2) {
			this.time = time - 1 / 2;
			this.income1 = earns * this.time;
			this.income1 -= 80;
		} else if (weather == 3) {
			this.time = time - 1;
			this.income1 = earns * this.time;
			this.income1 -= 80;
		}

	}

	public void printAboutMe() {
		System.out.println("Первый програмист заработает: " + this.income1);

	}

}
