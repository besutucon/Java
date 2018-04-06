package com.company.collection.map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapStock();

	}
	
	public static void hashMapStock() {
		
		Map<String, Double> sHmap = new HashMap<String, Double>();
		
		sHmap.put("Snapchat", 140.76);
		sHmap.put("Apple", 150.56);
		sHmap.put("Google", 870.34);
		sHmap.put("Facebook", 60.66);
		sHmap.put("Instagram", 70.88);
	
		System.out.println("Value of Apple stock " + sHmap.get("Apple"));
		System.out.println("Size of map "+ sHmap.size());
		System.out.println("Is Map empty " + sHmap.isEmpty());
		System.out.println("Facebook stock exits: "+ sHmap.containsKey("Facebook"));
		System.out.println("100.45 stock exits: " + sHmap.containsValue(100.45));
		
		Set set = sHmap.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry mEntry = (Map.Entry) it.next();
			System.out.print("Key is "+  mEntry.getKey() + ". Value is ");
			System.out.println(mEntry.getValue());
		}
		
		TreeMap<String, Double> tMap = new TreeMap<String, Double>(sHmap);
		
		System.out.println(tMap);
	}

}
