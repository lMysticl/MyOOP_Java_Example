package week3.lesson05;

public abstract class Figure {
	private double xPos;
	private double yPos;
	private double sideA;
	public double getPerim(){
		return 0;
	}
	public abstract double getSquare();
	
	public double getSideA(){
		return sideA;
	}
	public Figure(double x,double y,double a){
		setxPos(x);
		setyPos(y);
		sideA=a;
		
	}
	public void print(){
		System.out.println(getSquare());
		System.out.println(getPerim());
	}

	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = yPos;
	}

}
