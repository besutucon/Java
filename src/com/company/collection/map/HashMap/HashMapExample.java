package com.company.collection.map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapTest();
		

	}
	
	public static void hashMapTest() {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(2, "VA");
		hMap.put(34, "MA");
		hMap.put(4, "NY");
		hMap.put(78, "KY");
		hMap.put(89, "NC");
		
		System.out.println(hMap);
		System.out.println("Index of 78 is " + hMap.get(78));
		System.out.println("================================");
		System.out.println("Size of the map is " + hMap.size());
		System.out.println("================================");
		System.out.println("Is Map Empty " + hMap.isEmpty());
		System.out.println("================================");
		System.out.println("Is key exits " + hMap.containsKey(90));
		System.out.println("================================");
		System.out.println("Is value exits " + hMap.containsValue("MA"));
		System.out.println("================================");
		System.out.println("Remove key 34 "+ hMap.remove(34) );
		System.out.println("================================");
		
		Set set = hMap.entrySet();
		Iterator ih = set.iterator(); 
		
		while (ih.hasNext()) {
			Map.Entry mEntry = (Map.Entry) ih.next();
			System.out.print("Key is "+  mEntry.getKey() + ". Value is ");
			System.out.println(mEntry.getValue());
			
		}
		
		
		}
	

}
