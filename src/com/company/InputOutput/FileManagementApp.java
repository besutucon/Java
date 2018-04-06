package com.company.InputOutput;

import java.io.IOException;

public class FileManagementApp {

	public static void main(String[] args) {
		FileCreation();
		write();
		read();
		append();
		read();
		rename();
	}
	// create a new file 
	public static void FileCreation() {
		CreateFile newFile = new CreateFile();
		newFile.fileCreated();
		newFile.someint();
	}
	// write on a file
	public static void write() {
		WriteFile writeFile = new WriteFile();
		writeFile.fileWriter();
	}
	
	public static void read() {
		ReadFile readFile = new ReadFile();
//		try {
//			readFile.readFile();
//		}
//		catch(IOException e) {
//			System.out.println("No file found to read");
//			e.printStackTrace();
//		}
		
		try {
			readFile.readFileWithScanner();
		}
		catch(IOException e1) {
			System.out.println("No file to read with scanner");
			e1.printStackTrace();
		}

	}
	
	public static void append() {
		AppendToFileExample appendFile = new AppendToFileExample();
		appendFile.appendFile();
	}
	
	public static void rename() {
		RenameFile rfile = new RenameFile();
		rfile.renameFile();
	}
		
}


