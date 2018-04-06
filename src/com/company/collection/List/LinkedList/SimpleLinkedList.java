package com.company.collection.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

// pretty much the same like array list, it is better to use for a lot of data like million, billion
// faster performance than ArrrayList 

// vector is the same like LinkedList  but synchronized 
public class SimpleLinkedList {
	
	public static void main(String[] args) {
		linkedlist();
		
	}
	
	public static void linkedlist() {
		LinkedList<String> link = new LinkedList<>();
		
		link.add("DC");
		link.add("NYC");
		link.add("Boston");
		link.add("LA");
		
		System.out.println("US cities list: "+ link);
		
		link.addFirst("Chicago");
		link.addLast("Houston");
		
		System.out.println("Adding cities: " + link );
		
		Object firstVar = link.get(0);
		Object thirdVar = link.get(3);
		System.out.println(firstVar + " " + thirdVar);
		
		link.set(0, "SF");
		link.set(3, "Kansas");
		System.out.println("After set: "+link);
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Dallas");
		arrList.add("Phoenix");
		arrList.add("Austin");
		
		link.addAll(arrList);
		
		System.out.println("After adding array list: " + link);
		
		System.out.println("Index of NYC" + link.indexOf("NYC"));
		
		link.clear();
		System.out.println("Clear all list: "+ link);
		
	}

}
