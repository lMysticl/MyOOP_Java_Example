/*Задача 1. Написать метод принимающий имя файла, в 
 котором содержатся числа через пробеллы и ентеры. 
Вывести в консоль числа из файла, увеличенные в два раза. 
Без использования Scanner.
FileInputStream.*/
package week8.lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExmpleE {
 @SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
  InputStream is = new FileInputStream("file2.txt");
  int example = 1;
  int k;
  
  if(example == 1){
   int codeChar;
   do{
    codeChar = is.read();  
    System.out.println(codeChar + " = [" + ((char)codeChar) + "]");
   } while(codeChar > -1);
  }  
  if(example == 2){
   byte[] buf = new byte[20];
   k = is.read(buf);
   System.out.println("k="+k);
   for(byte b : buf) System.out.println("["+b+"]=["+(char)(b)+"]");   
  }
  if(example == 3){
   //is.read();
   int len = is.available();
   System.out.println(len);
   byte[] buf = new byte[len];
   k = is.read(buf);
   System.out.println("k="+k);
   for(byte b : buf) System.out.println("["+b+"]=["+(char)(b)+"]");
  }
 }
}