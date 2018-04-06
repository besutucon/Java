package com.company.InputOutput;

import java.io.File;

public class RenameFile {
	
	private Object esle;

	public void renameFile() {
		File oldFile = new File("/Users/Bi/Desktop/javaFun/NewTextFile.txt");
		File newFile = new File("/Users/Bi/Desktop/javaFun/TextFile.txt");
		boolean flag = oldFile.renameTo(newFile);
		if (flag) {
			System.out.println("Rename is succesfull");
		}
		else {
			System.out.println("Rename fails ");
		}
	}

}
