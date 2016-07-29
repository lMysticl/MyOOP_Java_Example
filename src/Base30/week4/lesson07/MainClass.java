/*������:
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

����������: Humanable, Tablable, Glassable, 
����������� ������: AbstractGlass, AbstractHuman, AbstractTable
������: HumanWoman, HumanMan, GlassCircle, GlassSquare, Table, MainClass

����� ���������� ���� �� �������-������ ������ � ������ �������(��� ����������) ���������.
 
������� � Main:
1. ������� ������ �� 4-� ������� ������� ����(��� ������������ � ������� Math.random)
2. ������� ������ �� 10 ������.(������������� �����, ������������� increment)
3. ������ �� ���� ����� �������.
4. �������� ����������( ��� ������� ������� ����� printAboutMe(� �/� � (���� ����) � ���� ������ ��/��))
5. ��� ������� �������� � ������� ���������� ������ �����, ������� �������� ���� �� ����(���� � ���� ���� ������).
6. �������� ����� ������ �� ������� ������� (����� ������� isDry).*/
package week4.lesson07;

import java.util.ArrayList;

 public class MainClass {
 public static void main(String[] args) {
  //1. ������� ������ �� 4-� ������� ������� ����(��� ������������ � ������� Math.random)
  AbstractHuman[] humans = new AbstractHuman[4]; 
  for(int i=0;i<humans.length;i++){
   int k = (int)(2*Math.random());
   if(k==0) humans[i] = new HumanMan();
   else humans[i] = new HumanWoman();
  }
  
  //2. ������� ������ �� 10 ������.(������������� �����, ������������� increment)
  ArrayList<AbstractTable> tables = new ArrayList<>();
  for(int i = 0; i< 10;i++){
   tables.add(new Table());
  }
  
  //3. ������ �� ���� ����� �������.
  for(AbstractHuman hum: humans){
   int k = (int)(2*Math.random());
   if(k==0) hum.takeGlass(new GlassCircle());
   else hum.takeGlass(new GlassSquare());
  }
  
  //4. �������� ����������( ��� ������� ������� ����� printAboutMe(� �/� � (���� ����) � ���� ������ ��/��))
  for(AbstractHuman hum: humans){
   hum.printAboutMe();
  }
  
  //���.����� - ������ ��������� ���� ������
  for(AbstractHuman hum: humans){
   hum.fillGlass();
  }
  
  //5. ��� ������� �������� � ������� ���������� ������ �����, ������� �������� ���� �� ����(���� � ���� ���� ������).
  for(AbstractHuman hum: humans){
   Table table = (Table)tables.get((int)(tables.size()*Math.random()));
   hum.pourWaterOnTable(table);
  }
  //6. �������� ����� ������ �� ������� ������� (����� ������� isDry).
  for(int i=0;i<tables.size();i++){
   System.out.println("table_"+(i+1)+" isDry()="+tables.get(i).isDry());
  }
 }
}

