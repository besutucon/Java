package com.company.collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListLoop();

	}
	
	public static void LinkedListLoop() {
		
		//LinkedList<String> carLink = new  LinkedList<>();
		List<String> carLink = new LinkedList<>(); // example of Polymorphism 
		
		carLink.add("BMW");
		carLink.add("Audi");
		carLink.add("Honda");
		carLink.add("Toyota");
		
		for (int i= 0; i< carLink.size(); i++) {
			System.out.println("Simple For Loop for LinkedList: "+ carLink.get(i) );
		}
		
		for (String counter : carLink) {
			System.out.println("For Each Loop: " + counter);
		}
		
		Iterator il = carLink.iterator();
		
		while( il.hasNext()) {
			System.out.println("Iterator While Loop: " + il.next());
		}
		
		ListIterator listIt = carLink.listIterator();
		
		while (listIt.hasNext()) {
			System.out.println("With List Iterator: " +listIt.next());
		}
		
		while(listIt.hasPrevious()) {
			System.out.println("Reserve List: " + listIt.previous());
		}
	}
	

}
