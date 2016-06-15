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
			System.out.print("я не могу взлететь, так как уже в воздухе");
		}
		else {
			isup = true;
			isdown= false;
			System.out.print("я взлетел");
		}

	}

	public void down() {

		if (isup ==false & isdown == true){
			isup = false;
			isdown = true;
			System.out.print("не могу сесть, так как уже сижу");
		}
		
		
		else
		{
			isup =	false;
			isdown = true;
			System.out.print("я сел");
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
