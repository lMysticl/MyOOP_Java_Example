package week3.lesson05;

public class Triangle extends Figure{
	private double sideB;
	@Override
	public double getSquare(){
		return sideB *
				getSideA()/2;
	}
	public Triangle(double x,double y,double a,double b){
		super(x,y,a);
		sideB=b;		
	}
	@Override
	public double getPerim(){
		return sideB+getSideA()+(Math.pow((getSideA()*getSideA()+sideB*sideB), 0.5));
		
	}

}
