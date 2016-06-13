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
		// 1. есть ли стакан
		if (glass != null) {
			// 2. есть ли в стакане вода
			if (!glass.isEmpty()) {
				// 3. дл€ стола присвоить значение наличи€ воды
				table.setDry(true);
			}
		}
	}

	@Override
	public void printAboutMe() {//4. ѕровести перекличку( дл€ каждого вызвать метод printAboutMe(я м/ж и (если есть) у мен€ стакан кр/кв))
	
		if(this instanceof HumanMan){
			System.out.println("я мужчина у мен€ " + glass.aboutGlass());}
		else{
			System.out.println("я женщина у мен€ " + glass.aboutGlass());
		}
	}


	@Override
	//
	public void fillGlass() {
		glass.setEmpty();
	}

}
