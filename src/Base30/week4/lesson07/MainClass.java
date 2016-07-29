/*Задача:
public interface Humanable {
 public void takeGlass(AbstractGlass glass);
 public void putGlass();
 public void pourWaterOnTable(AbstractTable table);
 public void fillGlass();
 public void printAboutMe();
}
public interface Glassable {
 public void pourFromMe();
}
public interface Tablable {
 public boolean isDry();
}

Интерфейсы: Humanable, Tablable, Glassable, 
Абстрактные классы: AbstractGlass, AbstractHuman, AbstractTable
Классы: HumanWoman, HumanMan, GlassCircle, GlassSquare, Table, MainClass

Когда выливается вода из стакана-стакан кричит я стакан круглый(или квадратный) выливаюсь.
 
Задание в Main:
1. Создать массив из 4-х человек разного пола(пол определяется с помощью Math.random)
2. Создать список из 10 столов.(пронумеровать столы, автоматически increment)
3. Каждый на угад берет стаканы.
4. Провести перекличку( для каждого вызвать метод printAboutMe(Я м/ж и (если есть) у меня стакан кр/кв))
5. Для каждого человека с консоли определяем индекс стола, человек выливает воду на стол(если у него есть стакан).
6. Провести опрос столов на предмет сухости (вызов методов isDry).*/
package week4.lesson07;

import java.util.ArrayList;

 public class MainClass {
 public static void main(String[] args) {
  //1. Создать массив из 4-х человек разного пола(пол определяется с помощью Math.random)
  AbstractHuman[] humans = new AbstractHuman[4]; 
  for(int i=0;i<humans.length;i++){
   int k = (int)(2*Math.random());
   if(k==0) humans[i] = new HumanMan();
   else humans[i] = new HumanWoman();
  }
  
  //2. Создать список из 10 столов.(пронумеровать столы, автоматически increment)
  ArrayList<AbstractTable> tables = new ArrayList<>();
  for(int i = 0; i< 10;i++){
   tables.add(new Table());
  }
  
  //3. Каждый на угад берет стаканы.
  for(AbstractHuman hum: humans){
   int k = (int)(2*Math.random());
   if(k==0) hum.takeGlass(new GlassCircle());
   else hum.takeGlass(new GlassSquare());
  }
  
  //4. Провести перекличку( для каждого вызвать метод printAboutMe(Я м/ж и (если есть) у меня стакан кр/кв))
  for(AbstractHuman hum: humans){
   hum.printAboutMe();
  }
  
  //Доп.пункт - Каждый заполняет свой стакан
  for(AbstractHuman hum: humans){
   hum.fillGlass();
  }
  
  //5. Для каждого человека с консоли определяем индекс стола, человек выливает воду на стол(если у него есть стакан).
  for(AbstractHuman hum: humans){
   Table table = (Table)tables.get((int)(tables.size()*Math.random()));
   hum.pourWaterOnTable(table);
  }
  //6. Провести опрос столов на предмет сухости (вызов методов isDry).
  for(int i=0;i<tables.size();i++){
   System.out.println("table_"+(i+1)+" isDry()="+tables.get(i).isDry());
  }
 }
}

