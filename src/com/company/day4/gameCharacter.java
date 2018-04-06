package com.company.day4;
import java.util.Scanner;

public class gameCharacter {
	String charName;
	String charJob;
	int HP;
	gameCharacter(String charName, String charJob, int HP) {
		// TODO Auto-generated constructor stub
		super();
		this.charName = charName;
		this.charJob = charJob;
		HP = HP;
	}
	public static void main(String[] args) {
		gameCharacter Char1 = new gameCharacter("Thor", "Knight", 1000);
		System.out.println(Char1.charName + " "+ Char1.charJob + " "+ Char1.HP);
	}

}
