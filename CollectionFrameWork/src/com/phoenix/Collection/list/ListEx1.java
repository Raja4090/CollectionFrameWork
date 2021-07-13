package com.phoenix.Collection.list;
import java.util.*;
public class ListEx1 {
 public static void main(String[]args)
 {
	 List<Integer>l1=new ArrayList<Integer>();
	 l1.add(100);
	 l1.add(300);
	 l1.add(200);
	 	   
	 System.out.println("Elements are: ");
	 l1.forEach(a-> {System.out.println(a);});
	 
	 Collections.sort(l1);
	 
	 System.out.println("\nAfter sorting elements are: ");
	 l1.forEach(a-> {System.out.println(a);});
	 
	 //Collections.reverse(l1);
	 
	 System.out.println("\nAfter reversing elements are: ");
	 l1.forEach(a-> {System.out.println(a);});
	 
	 
	 
 }
}
