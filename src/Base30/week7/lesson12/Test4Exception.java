package week7.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Test4Exception {
 @SuppressWarnings("resource")
public static void f() throws FileNotFoundException   {
  @SuppressWarnings("unused")
FileReader fr = new FileReader("file1.txt");
  	
 }
 public static void main(String[] args) {
   try {
    f();
   } catch (FileNotFoundException e) {
    e.printStackTrace();
   }

 } 
}
