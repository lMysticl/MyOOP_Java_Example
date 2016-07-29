package week3.lesson06;

public class Samsung extends Phone {
	public Samsung(String number, boolean camera, int sideSize) {
		super(number, camera, sideSize);

	}

	@Override
	public String printModel() {
		return "Samsung";

	}
}
