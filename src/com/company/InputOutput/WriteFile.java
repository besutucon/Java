package com.company.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	FileOutputStream fo = null;
	String myContent = "This is the example for how to write in a file with Java code";
	int i = 5;
	File file = null;
	
	public void fileWriter() {
		
		file = new File("/Users/Bi/Desktop/javaFun/NewTextFile.txt");
			try {
				fo = new FileOutputStream(file);
			}
			catch (FileNotFoundException e){
				System.out.println("Print file Exception Found");
				e.printStackTrace();
				
			}
		
		byte[] bArray = myContent.getBytes();
		
		try {
			fo.write(bArray);
			fo.write(i);
			fo.flush();
			System.out.println("File was written succesfully");
		}
		catch(IOException e) {
			System.out.println("Error occered during file wrtiting");
			e.printStackTrace();
		}
		
	}
}
