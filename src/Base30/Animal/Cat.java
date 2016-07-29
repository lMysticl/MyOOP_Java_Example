package Animal;

public class Cat extends Animal {
	public String barsik;
	public boolean gladit = false;
	public boolean NotGorged = false;
	public int b;
	
	public void printName() {
		
		barsik = "Barsik";
		System.out.println(barsik);
	
	}

	public void say(String barsik) {
		if (barsik == "Barsik") {
			System.out.println("May");
			this.barsik="May";
		}

	}

	public void riseHair() {
		if(this.barsik=="May"){
			gladit=true;
			System.out.println("Поднимает шерсть дыбом");
		}else{System.out.println("say Barsik");}
	}

	public void eat() {
		if(gladit==true){
		System.out.println("Barsik want eat");
			if((int) (2 * Math.random())*1==1)NotGorged=true;}
		
	}

	public void yellIfNotGorged() {
		if(NotGorged==true){
			System.out.println("Barsik want more eat");
		}
	}

	// public void printName(){
	//
	// }
	// public void say(){
	//
	// }
	// public void riseHair(){
	//
	// }
	// public void eat(){
	//
	// }
	// public void yellIfNotGorged(){
	// }
}