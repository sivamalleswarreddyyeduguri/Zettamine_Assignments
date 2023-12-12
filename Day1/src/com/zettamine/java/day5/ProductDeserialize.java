package com.zettamine.java.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


public class ProductDeserialize {

	public static void main(String[] args) {
		FileInputStream fis;
		 ObjectInputStream ois;
		 
		 Product pd;
		  
		    try {
				String FILE_NAME = "C:\\Users\\Siva Malleshwar\\Desktop\\Stocks\\Product.ProductsSaving";
				fis = new FileInputStream(FILE_NAME);
				ois = new ObjectInputStream(fis);
				
				List<Product> l = (List<Product>) ois.readObject();
				
				for(Product s : l) {
					System.out.println(s);
				}
				
				
				
				ois.close();
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

}
