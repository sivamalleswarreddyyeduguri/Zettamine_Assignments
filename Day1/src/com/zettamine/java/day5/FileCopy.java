package com.zettamine.java.day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) {
        Path sourcePath = Paths.get("C:\\Users\\Siva Malleshwar\\Documents\\RenamedSiva.txt");
        Path destinationPath = Paths.get("C:\\Users\\Siva Malleshwar\\Documents\\copiedFile.txt");

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println(e);
        }
	}

}
