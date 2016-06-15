package week8.lesson14;

import java.util.Scanner;

public class MyScanner {
 public static void main(String[] args) throws Exception {
  /*
  Reader system = new InputStreamReader(System.in);
  BufferedReader buff = new BufferedReader(system);
  String str = buff.readLine();
  System.out.println(str);
  */
  //
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Input k1:");
  if(scan.hasNextInt()){   
   int k1 = scan.nextInt();
   System.out.println("k1="+k1);
  }
  
  System.out.println("Input k2:");
  if(scan.hasNextInt()){
   int k2 = scan.nextInt();
   System.out.println("k2="+k2);
  }
  
  //System.out.println(scan.nextLine());
  //System.out.println(scan.nextLine());
  scan.close();}
 
 
 public boolean hasNextInt(){
  return false;
 }
 public boolean hasNextDouble(){
  return false;
 }
 public int nextInt(){
  return 0;
 }
 public double nextDouble(){
  return 0;
 }
 //next(), nextLine(), hasNext(), hasNextLine()

}