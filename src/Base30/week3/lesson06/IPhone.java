package week3.lesson06;

public abstract class IPhone extends Phone {
	int appleId;

	public IPhone(String number, boolean camera, int sideSize, int appleId) {
		super(number, camera, sideSize);
		this.appleId = appleId;

	}

}
