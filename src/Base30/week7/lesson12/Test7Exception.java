package week7.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test7Exception {
 public static void f1()   {
  FileReader fr=null;
  try {
   fr = new FileReader("file1.txt");
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } finally{
   if(fr!=null){
    try {
     fr.close();
    } catch (IOException e) {
     e.printStackTrace();
    }
   }
  }
 }
 public static void f2()   {
  try(
   FileReader fr = new FileReader("file1.txt");
   Scanner scan = new Scanner(fr);
   ) {
   while(scan.hasNextLine()){
    scan.nextLine();
   }
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e1) {
   e1.printStackTrace();
  }
 }
 public static void f3()   {
  try(
   FileReader fr = new FileReader("file1.txt");
   Scanner scan = new Scanner(fr);
   ) {
   while(scan.hasNextLine()){
    scan.nextLine();
   }
  } catch (Exception e1) {
   e1.printStackTrace();
  }
 }
}
