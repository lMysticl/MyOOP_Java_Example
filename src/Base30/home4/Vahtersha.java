package home4;

public class Vahtersha {

	int Owners;
	int Friends;

	public Vahtersha() {
	}

	public Vahtersha(int OwnF) {
		this.Owners = OwnF;
	}

	public int Friends() {
		return Friends;
	}

	public void addOwners(int x) {

		this.Owners += x;

	}

	public void addFriends(int Friends) {
		if ((this.Friends + Friends) <= this.Owners) {
			this.Friends += Friends;
		} else {
			System.err.println("error");
		}
	}

	public void removeOwners(int Owners) {
		if (this.Friends <= (this.Owners - Owners)) {
			this.Owners -= Owners;
		} else {

			System.err.println("error");
		}
	}

	public void removeFriends(int y) {
		Friends -= y;
	}

	public void printInfo() {
		System.out.println("Vladelcev v dome: " + Owners);
		System.out.println("Friends v dome: " + Friends);
	}

}
