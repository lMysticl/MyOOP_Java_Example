package week8.lesson14;

public class Engine {
	 private String nomer;
	 public Engine(String n){
	  nomer = n;
	 }
	 public void setNomer(String n){
	  nomer = n;
	 }
	 
	 @Override
	 public String toString(){
	  return nomer;
	 }
	}