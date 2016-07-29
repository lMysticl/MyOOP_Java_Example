package week7.lesson13;

import java.util.ArrayList;

public class Container<T> {
 private T value;

 public T getValue() {
  return value;
 }

 public void setValue(T value) {
  this.value = value;
 }
 public void print(){
  System.out.println("тип ="+value.getClass().getName());
 }
 @SuppressWarnings("unused")
public static void main(String[] args) {
  Container<String> container = new Container<>();
  ArrayList<String> lisdt = new ArrayList<>();
 }
}