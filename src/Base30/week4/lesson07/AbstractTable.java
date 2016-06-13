package week4.lesson07;

public abstract class AbstractTable implements Tablable{
	private boolean dry;
	public boolean setDry(boolean b) {
		return dry=b;
	}
	@Override
	public boolean isDry() {
		return dry;
	}

}
