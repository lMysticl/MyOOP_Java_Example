package home4;

public class Bus {
	int Human;

	public Bus() {
	}

	public Bus(int x) {
		Human = x;
	}

	public void addHuman(int Human) {
		
//		System.out.println("����� "+Human);
		if ((this.Human + Human) >= 0) {
			this.Human += Human;
		
		} else {// System.out.println("���� ��� ����� �������\n"+Human);
				}

	}

	public void printAboutMe() {
		
		System.out.println("koli4estvo pasagirov: " + Human);
	}
}
