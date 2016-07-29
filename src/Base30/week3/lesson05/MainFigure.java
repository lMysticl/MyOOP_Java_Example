package week3.lesson05;

public class MainFigure {

	public static void main(String[] args) {
		Triangle tRi= new Triangle(3,3,3,4);
		tRi.print();
		tRi.getPerim();
		Figure rec1 = new Rectangle(3,3,4,5);
		rec1.getPerim();
		rec1.print();
	}

}
