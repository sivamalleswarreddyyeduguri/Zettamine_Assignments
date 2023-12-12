package com.zettamine.java.day5;

import java.io.File;
import java.io.IOException;

public class Ren {

	public static void main(String[] args) {
		
		File f = new File("C:/CJava/java");
	if(!f.exists()) {
		if(f.mkdirs()) {
			System.out.println("created");
		}
		else {
			System.out.println("not created");
		}
	}
		File newFile = new File(f,"java.txt");
		try {
			if(newFile.createNewFile()) {
			   System.out.println("File created successfully.");
			}
			else {
				System.err.println("Failed to create file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
