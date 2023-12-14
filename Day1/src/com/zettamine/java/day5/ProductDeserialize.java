package com.zettamine.java.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;


public class ProductDeserialize {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		FileInputStream fis;
		 ObjectInputStream ois;
		  
		    try {
				String FILE_NAME = "src/com/zettamine/java/day5/Products.ser";
				fis = new FileInputStream(FILE_NAME);
				ois = new ObjectInputStream(fis);
				 
				List<Product> l = (List<Product>) ois.readObject();
				
				   if(l.size()==0) {
					   System.err.println("Please enter Stock Details: ");
					   return;
				   }
				 System.out.print("Enter product id: ");
				 int id = scn.nextInt();
				 for(int i =0; i<l.size();i++) {
					 
					 if(l.get(i).getProductId()== id) {
						 System.out.println(l.get(i).getProductName());
							ois.close();
							fis.close();
						 return;
					 }
					 
		           }
				    System.err.println("Not Available");
				     return;

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

}
