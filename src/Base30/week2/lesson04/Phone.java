/*Телефон: 
 Создать класс Phone с полями:
 - static Phone[] phones = new Phone[10];
 - String myNumber
 - String marka
 Изначально phones не содержит телефонов, все телефоны добавляются через конструктор.
 При создании нового объекта-телефона, мы должны указать его номер и он вносится в базу номеров phones. 
 В этот класс добавить метод: 
 - isNumberExist(String number) - проверяет наличие телефона в базе
 - call(String number) - выводит на экран "телефон такой-то(номер+марка) звонит такому-то(номер+марка)"
 - getRandomPhone() - возвращает случайный телефон из базы телефонов
 Ограничение в 10 телефонов.
 В MainPhone: 
 - создать несколько телефонов с какими-то номерами
 - попробовать проверить наличие существующего и несуществующего номера.
 - для случайного телефона вызвать метод call и пусть звонит на случайный телефон.
 */
package week2.lesson04;

public class Phone {
	static Phone[] phones = new Phone[10];
	String myNumber;
	String mark;
	static String Num;

	public Phone() {
		this(null, null);
	}

	public Phone(String myNumber) {
		this(myNumber, null);
	}

	public Phone(String myNumber, String mark) {
		this.myNumber = myNumber;
		this.mark = mark;
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] == null) {
				phones[i] = this;// если в базе есть пустое место, тоесть нет
				// ссылки на объект он ставит ссылку на наш
				// объект
				break; // что бы не заменить все нулы, он заменил один и
				// остановил наш цикл
			}
		}
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public void setmark(String mark) {
		this.mark = mark;
	}

	public static boolean   isNumberExist(String myNumber) {
		int prov = 0; // фиксатор, если нашел совпадения изменил его
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {// проверка ссылки в базе
				if (phones[i].getMyNumber() == myNumber) { // проверка номера
					// телефонов
					prov = 1; // если нашел изменил значение
				}
			}
		}
		
		if (prov == 1) {// проверка изменилось или нет и тогда выдал
			System.out.println("NymberExist");
			return true; }
		else {
			System.out.println("NotNymberExist");
			return false;}
		
	}

	
		
	public static void printAllNumbers() {
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null)
				Num = phones[i].getMyNumber();
			System.out.println(Num);
		}
	}

	public static Phone getRandomPhone() {

		return phones[((int) (Math.random() * 4))];
	}

	public void call(String myNumber1) {

		System.out.println(myNumber + " Звонит " + myNumber1);

	}
}
