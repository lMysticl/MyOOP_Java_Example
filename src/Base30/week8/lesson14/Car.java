package week8.lesson14;

public class Car implements Cloneable{
	 private String nomer;
	 private Engine engine;
	 
	 public Car(String nomer, Engine engine) {
	  this.setNomer(nomer);
	  this.engine = engine;
	 }

	 public void setEngine(Engine e){
	  engine = e;
	 }
	 public Engine getEngine(){
	  return engine;
	 }
	 @Override
	 public Car clone() throws CloneNotSupportedException{
	  Car car1 = (Car)super.clone();
	  return car1;
	 }

	public String getNomer() {
		return nomer;
	}

	public void setNomer(String nomer) {
		this.nomer = nomer;
	}
	 
	}