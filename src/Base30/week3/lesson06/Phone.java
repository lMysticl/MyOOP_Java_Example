/*Написать класс телефонов.
 - abstract class Phone(String number, boolean camera, int sideSize)
 - class Nokia
 - class Samsung
 - abstract class IPhone{int appleId}
 - class IPhone4
 - class IPhone5
 Что умеют делать:
  - call(Phone ph) - телефон такой-то марки и с таким-то номером звонит такому-то телефон марки и номера
  - printModel()
  - printAppleId()// для айфонов
Создать класс MainPhone, в котором создать список телефонов.
Добавить пару телефонов с номерами каждого вида в список.(Nokia, Samsung, IPhone4, IPhone5)
С консоли считать 2 (индекса)номера телефона и вызвать методы call  с одного номер на второй.
Для всех телефонов из списка вызвать метод printModel.
Затем для всех телефонов, для которых возможно вызвать метод printAppleId.*/
package week3.lesson06;

public abstract class Phone {
	String number;
	boolean camera;
	int sideSize;

	public Phone(String number, boolean camera, int sideSize) {
		this.number = number;
		this.camera = camera;
		this.sideSize = sideSize;
	}

	public void call(Phone ph) {
		System.out.println(this.number + "  " + this.printModel() + " звонит " + ph.number + "  " + ph.printModel());
	}

	public abstract String printModel();
	 {
	 System.out.println("Марка: " + this.getClass().getSimpleName());
	 }
}
