package com.phoenix.Collection.map;

import java.util.*;
public class MapEx1 {
	public static void main(String[]args)
	{
      Map<String,Integer> map=new HashMap<String,Integer>();
      map.put("Raja Kumar", 2);
      map.put("Rahul", 3);
      
      System.out.println("id is: "+map.get("Raja Kumar"));
      
      System.out.println(map);
      
      Set<String> set=map.keySet();
      Iterator<String>it=set.iterator();
      while(it.hasNext())
      {
    	  String name=it.next();
    	  int id=map.get(name);
    	  System.out.println("Name is: "+name+" id: "+id);
      }
	}
  
}
