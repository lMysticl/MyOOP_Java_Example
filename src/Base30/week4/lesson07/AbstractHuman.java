package week4.lesson07;

public abstract class AbstractHuman implements Humanable {
	AbstractGlass glass;

	@Override
	public void takeGlass(AbstractGlass glass) {
		this.glass = glass;
	}

	@Override
	public void putGlass() {
		glass = null;
	}

	public void pourWaterOnTable(AbstractTable table) {
		// 1. ���� �� ������
		if (glass != null) {
			// 2. ���� �� � ������� ����
			if (!glass.isEmpty()) {
				// 3. ��� ����� ��������� �������� ������� ����
				table.setDry(true);
			}
		}
	}

	@Override
	public void printAboutMe() {//4. �������� ����������( ��� ������� ������� ����� printAboutMe(� �/� � (���� ����) � ���� ������ ��/��))
	
		if(this instanceof HumanMan){
			System.out.println("� ������� � ���� " + glass.aboutGlass());}
		else{
			System.out.println("� ������� � ���� " + glass.aboutGlass());
		}
	}


	@Override
	//
	public void fillGlass() {
		glass.setEmpty();
	}

}
