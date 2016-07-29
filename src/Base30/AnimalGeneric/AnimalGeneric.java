/*Задача 3. Написать класс животное, где тип животного Animal передается дженериком. 
 Для класса реализовать метод say(выводит на экран сообщение):
 Кошка Cat говорит "мяу"
 Собака Dog говорит "гав"
 Лев Leo говорит "рррр"*/
package AnimalGeneric;

public class AnimalGeneric<T> {
	public T leo;
	public T cat;
	public T dog;

	public void say(int i) {
		int value = 0;
		if (i == 1) {
			value = 1;
		} else if (i == 2) {
			value = 2;
		} else if (i == 3) {
			value = 3;
		}
		switch (value) {
		case 1:
			System.out.println("мяу");
			break;
		case 2:
			System.out.println("гав");
			break;
		case 3:
			System.out.println("рррр");
			break;
		default:
			System.out.println("Выберите животное от 1-3 ");
			break;
		}

	}

	public static void main(String[] args) {
		AnimalGeneric<?> cat1 = new AnimalGeneric<>();
		System.out.println("Выберите животное : 1-3 " + "\n 1.Cat" + "\n 2.Dog" + "\n 3.Leo");
		cat1.say(2);
	}

}
