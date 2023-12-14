package com.zettamine.java.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsSaving {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter NoOf Products: ");
		int n = scn.nextInt();
		
		ArrayList<Product> alist = new ArrayList<Product>();
		
		for(int i = 0; i < n; i++) {
			 System.out.println("Enter product id & product name of product -"+ (i+1)+" :");
			 int id = scn.nextInt();
			 String name = scn.next();
			 alist.add(new Product(id, name));
		}
		  
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("src/com/zettamine/java/day5/Products.ser");
			oos = new ObjectOutputStream(fos);
			
			
			oos.writeObject(alist);
			
			oos.close();
			fos.close();
			System.out.println("Program execution completed");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	   }

}
