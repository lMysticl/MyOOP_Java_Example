package home4;

public class Plain {
	boolean isup = false;
	boolean isdown = false;
	
	public Plain() {
	}

	public void up() {
		if (isup == true & isdown == false){
			isup = true;
			isdown = false;
			System.out.print("� �� ���� ��������, ��� ��� ��� � �������");
		}
		else {
			isup = true;
			isdown= false;
			System.out.print("� �������");
		}

	}

	public void down() {

		if (isup ==false & isdown == true){
			isup = false;
			isdown = true;
			System.out.print("�� ���� �����, ��� ��� ��� ����");
		}
		
		
		else
		{
			isup =	false;
			isdown = true;
			System.out.print("� ���");
		}
	}

	public void printAboutMe() {
		if (isup == true & isdown == false) {
			System.out.println(" ^ ");
		} 
		else if (isdown == true & isup == false) {
			System.out.println(" v ");
		}
	}
}
