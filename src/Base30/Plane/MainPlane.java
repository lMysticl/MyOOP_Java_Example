/*������ �������.
 ������� ����� ������� �� ������ ������ �����.
 ������ Plane � Wing.
 ������� ������ �����:
 - �������� (��� �������� ���� � ����� ������� ���������� ������� ��� ������, ������� �������� ��� ������, ����� void takeoff())
 - �������� ������� (������� ������� �� ������������������ ���������, ����� void selectRoute(int[][] coordinates))
 - ������� �� ����� �������, ����� void printRoute()*/
package Plane;

public class MainPlane {
	

	public static void main(String[] args) {
		Plane boeing747 = new Plane();		
		boeing747.printRoute();
		boeing747.takeoff();
	//	int[][] coordinates= new int [4][4];
		 int[][] coordinates = new int[2][3];
		 coordinates[0][0] = 1;    coordinates[0][1] = 2;    coordinates[0][2] = 3;
		 coordinates[1][0] = 4;    coordinates[1][1] = 5;    coordinates[1][2] = 6;
		boeing747.selectRoute(coordinates);

	}
}
