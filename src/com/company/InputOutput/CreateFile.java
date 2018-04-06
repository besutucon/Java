package com.company.InputOutput;

import java.io.File;
import java.io.IOException;


public class CreateFile {

	File file = new File("/Users/Bi/Desktop/javaFun/NewTextFile.txt");
	
	public File fileCreated() {
		boolean b = false;
		try {
			b = file.createNewFile();
		}
		catch (IOException e) {
			System.out.println("There was an error while creating file");
		}
		if(b) {
			System.out.println("New File has been created");
		}
		else {
			System.out.println("File is alredy exist");
		}
		return file;
	}
	public void someint() {}
	
	

}
