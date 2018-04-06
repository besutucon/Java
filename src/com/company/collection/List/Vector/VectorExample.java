package com.company.collection.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		vectorLoop();
	}
	
	public static void vectorLoop() {
		Vector<String> carVec = new Vector<>();
		
		carVec.add("BMW");
		carVec.add("Audi");
		carVec.add("Jaguar");
		carVec.add("Honda");
		
		for (int i = 0; i< carVec.size(); i++) {
			System.out.println("Simple For Loop: "+ carVec.get(i));
		}
		
		for( String counter : carVec) {
			System.out.println("For each loop: " + counter);
		}
		
		Iterator iv = carVec.iterator();
		
		while(iv.hasNext()) {
			System.out.println("");
		}
		
		
	}

}
