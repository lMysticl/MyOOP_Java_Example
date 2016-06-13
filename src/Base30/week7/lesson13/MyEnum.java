/*Task 4. Добавить к перечислению метод проверки наличия определенного цвета boolean isExist(String s).
 То есть метод принимает строку с цветом. Определить есть ли такой цвет в константах. */
package week7.lesson13;



public enum MyEnum {
	 Purple, Teal, Maroon, EngineSumsung, EngineIphone, Biryuza;
	 
	 @SuppressWarnings("unused")
	public static void start() {
	  MyEnum obj = MyEnum.Biryuza;

	  String s = obj.toString(); // "Biryuza"
	  MyEnum obj1 = MyEnum.valueOf(s);

	  MyEnum[] vector = MyEnum.values();
	 
	 }
	public static boolean isExist(String s){
		 MyEnum[] vector = MyEnum.values();
		 for (int i = 0; i < vector.length; i++)
		 if(vector[i].toString()==s){
			return true;
			 }	
		return false;
	}
	public static void main(String[] args) {
		String s="Maroon";
		String f="Maroonw";
		System.out.println(isExist(s));
		System.out.println(isExist(f));
	}
}
	

	class Ruzhbayka {
	 private MyEnum color = MyEnum.EngineSumsung;

	 public MyEnum getColor() {
	  return color;
	 }

	 public void setColor(MyEnum color) {
	  this.color = color;
	 }
	}

	class Main {
	 public static void init() {
	  Ruzhbayka obj = new Ruzhbayka();
	  MyEnum col = MyEnum.Maroon;
	  obj.setColor(col);
	  obj.setColor(MyEnum.Teal);
	
	 }
	}