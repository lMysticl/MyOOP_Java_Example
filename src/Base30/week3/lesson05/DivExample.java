package week3.lesson05;

public class DivExample {
	private final int p ;//�������������
	public DivExample(){
		System.out.println("DivExample");
		p = 20;
	}
	/**
	 * @return the p
	 */
	public int getP() {
		return p;
	}
	//���� �������������
	{
		System.out.println("block initial");
		//p = 20;
		}
	//����������� ���� ������������� (���������� ������)
	static{
		System.out.println("static block initial");
	}
}
		
