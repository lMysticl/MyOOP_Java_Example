package week3.lesson05;

	public class Rectangle extends Figure{
		 private double sideB;
		 
		 public Rectangle(double x, double y, double s1, double s2){
		  super(x, y, s1);
		  sideB = s2;
		 }
		 @Override
		 public double getPerim() {
		  return (getSideA() + sideB) * 2;
		 }
		 @Override
		 public double getSquare() {
		  return getSideA() * sideB;
		 }
		 
		}

