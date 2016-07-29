package week3.lesson05;


public class Circle extends Figure{

 public Circle(double x, double y, double radius) {
  super(x, y, radius);
 }

 @Override
 public double getPerim() {  
  return 2*Math.PI*getSideA();
 }

 @Override
 public double getSquare() {
  return Math.PI*getSideA()*getSideA();
 }
}
