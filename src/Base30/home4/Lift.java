package home4;

public class Lift {
	int curFloor = 0;
	int countFloat = 0;
	int countPeople = 0;
	int currentCountPeople = 0;

	public Lift(int countPeople, int curFloor, int countFloat, int currentCountPeople) {
		this.countPeople += countPeople;
		this.curFloor += curFloor;
		this.countFloat += countFloat;
		this.currentCountPeople += currentCountPeople;
	}

	public void move(int nextFloor, int countHuman) {

		if (nextFloor != curFloor)
			countPeople += countHuman;
		curFloor += nextFloor;
		currentCountPeople += countPeople;
	}

	public void printAboutMe() {
		System.out.println("���������� ������: " + curFloor);
		System.out.println("���������� �������: " + countFloat);
		System.out.println("���������� ������������ �����:" + countPeople);
		System.out.println("���������� ����� ����������� � ������ ������ � ����:" + this.currentCountPeople);

	}
}
