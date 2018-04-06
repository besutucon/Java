package com.company.InputOutput;

// command shift o to import 
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	File file = new File("/Users/Bi/Desktop/javaFun/NewTextFile.txt");
	BufferedInputStream bis;
	FileInputStream fis;

	public void readFile() throws IOException {
		try {
			fis = new FileInputStream(file);
			//buffer read the big content even though image
			bis = new BufferedInputStream(fis);
		
			while(bis.available()>0) {
				System.out.println((char)bis.read());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found exception");
			e.printStackTrace();
		}
		
		}
	public void readFileWithScanner () throws FileNotFoundException{
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}

	}
}
