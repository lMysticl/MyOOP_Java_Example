package week8.lesson15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerilizable {
 public static void main(String[] args) {
  try {
   Product pr1 = new Product("Колбаса");

   // запись
   FileOutputStream fos = new FileOutputStream("temp.car");
   ObjectOutputStream oos = new ObjectOutputStream(fos);
   try {
    oos.writeObject(pr1);
   } finally {
    oos.close();
   }

   // чтение
   Product pr2;
   FileInputStream fis = new FileInputStream("temp.car");
   ObjectInputStream oin = new ObjectInputStream(fis);
   try {
    pr2 = (Product) oin.readObject();
    System.out.println(pr2);

   } finally {
    oin.close();
   }
  } catch (IOException e) {
   e.printStackTrace();
  } catch (ClassNotFoundException e) {
   e.printStackTrace();
  }

 }

}
