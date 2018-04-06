package com.company.InputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {

	FileWriter fw;
	BufferedWriter bw;
	File file = null;
	
	public void appendFile() {
		try {
			file = new File("/Users/Bi/Desktop/javaFun/NewTextFile.txt");
			fw =  new FileWriter(file.getAbsolutePath(), true);
			bw = new BufferedWriter(fw);
			String data = " This is the new content we want to add";
			bw.write(data);
			bw.close();
			System.out.print("Done appending file");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error while file appending");
			
		}
	}
	
}
