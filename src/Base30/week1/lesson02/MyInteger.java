package week1.lesson02;

public class MyInteger {

	public int getValue;

	public MyInteger(int getValue) {
		this.getValue = getValue;
		}

	public MyInteger plus(MyInteger getValue) {
		this.getValue += getValue.getValue;
		return this;
	}
	public int getValue() {
		return getValue;
	}
}