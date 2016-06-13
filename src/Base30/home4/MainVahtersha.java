package home4;

public class MainVahtersha {
	public static void main(String[] args) {
		Vahtersha OwnF = new Vahtersha();
		OwnF.addOwners(26);
		OwnF.addFriends(25);
		OwnF.removeOwners(16);
		OwnF.removeFriends(5);
		OwnF.addFriends(25);
		OwnF.removeFriends(5);
		OwnF.removeOwners(16);
		OwnF.printInfo();
	}

}
