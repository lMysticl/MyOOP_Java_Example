/* Создать класс Рыба на основе класса "Продукт в супермаркете".
 Классы Fish и Product.
 Рыба должна уметь:
 - Вывести свою цену, метод void printPrice()
 - Вывести срок хранения, метод void printStoragePeriod()
 - Проплыть, метод void swim()
 - Проглотить другую рыбу, метод void cannibalism(Fish fish)
 - Вывести свой штрихкод и цену, метод void printBarAndPrice()*/
package Product;


public class MainProduct {
	public static void main(String[] args) {
		
		
		Fish farel = new Fish();
		Fish som = new Fish();
		som.priceF(20);
		som.setFish(som);
		farel.setFish(farel);
		som.cannibalism(farel);
		farel.printStoragePeriod();
		farel.printPrice();
		farel.swim();
		
		
	}
}
