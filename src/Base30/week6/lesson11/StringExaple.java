package week6.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringExaple {


	  public static void main(String[] args) {
	  String str1 = "bab";
	  String str2 = "aab";
	  String str3 = "4dab";
	  String str4 = "2dab";
	  System.out.println(str1.compareTo(str2));
	  ArrayList<String> list = new ArrayList<>(
	    Arrays.asList(str1, str2, str3, str4));
	  
	  System.out.println(list);
	  Collections.sort(list);
	  System.out.println(list);  
	 }
	}

