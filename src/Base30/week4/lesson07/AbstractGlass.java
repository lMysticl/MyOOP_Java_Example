package week4.lesson07;

public abstract class AbstractGlass implements Glassable {
	private boolean isEmpty = true;

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty() {
		isEmpty = false;
	}

	public String aboutGlass() {
		if (this instanceof GlassCircle) {
			return " cтакан круглый";
		} else {
			return " cтакан граненый";
		}
		
	}
}
