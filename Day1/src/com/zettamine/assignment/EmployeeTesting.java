package com.zettamine.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeTesting {

	public static void main(String[] args) {
		
//	  h.put(new Employee(1, "mallesh", 10), set<new Certification(1, "JAva", 1), new Certification(0, null, 0)>);
	  
	  Certification cf1 = new Certification(1, "Java", 67);
	  Certification cf2 = new Certification(4, "JavaFullStack",7);
	  Certification cf3 = new Certification(3, "SQL", 47);
	  Certification cf4 = new Certification(5, "Python", 67);
	  
	  Employee e1, e2, e3 , e5, e4,e6;
	  e1 = new RegulorEmployee(2, "Yugandhar", 20,"347ab");
	  e2 = new RegulorEmployee(3, "Azmat", 40,"487kj");
	  e3 = new RegulorEmployee(4, "Inthiyaz", 10,"894nm");
	  
      e4 = new ContractEmployee(1, "Mallesh", 10, 207);
	  e5 =new ContractEmployee(3, "Siva", 20, 308);
	  e6 = new ContractEmployee(5, "Yeduguri", 30, 407);
	  
	  
	  Set<Certification> s1 = new HashSet<Certification>();
	   s1.add(cf1);
	   s1.add(cf2);
	   
	  Set<Certification> s2 = new HashSet<Certification>();
	  s2.add(cf3);
	  
	  Set<Certification> s3 = new HashSet<Certification>();
	  s3.add(cf3);
	  s3.add(cf4);
	  
	  s3.add(cf1);
	  s3.add(cf2);
	  
	  Map<Employee, Set<Certification>> emap1 = new LinkedHashMap<Employee, Set<Certification>>();
	  emap1.put(e5, null);
	  emap1.put(e4, s1);
	  emap1.put(e6, s2);
	  emap1.put(e1, null);
	  emap1.put(e2, s3);
	  emap1.put(e3, s2);
	  
	  
	    Iterator<Map.Entry<Employee, Set<Certification>>> iterator = emap1.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Employee, Set<Certification>> entry = iterator.next();
            Employee employee = entry.getKey();
            Set<Certification> certifications = entry.getValue();

            System.out.println("Employee: " + employee);
            System.out.println("Certifications: " + certifications);
        }
	  
    
    // SERIALIZATION 
    

	FileOutputStream fos;
	ObjectOutputStream os;
	
	 try {
		fos = new FileOutputStream("C:\\Users\\Siva Malleshwar\\Desktop\\EmployeeDat\\Employee.EmployeeTesting");
		os = new ObjectOutputStream(fos);
         
		
		os.writeObject(emap1);         
		os.close();
		fos.close();
		System.out.println("Program execution completed");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
  
	  
	  // DESERIALIZATION
	  
	  
	 FileInputStream fis;
	 ObjectInputStream ois;
	    try {
			String FILE_NAME = "C:\\\\Users\\\\Siva Malleshwar\\\\Desktop\\\\EmployeeDat\\\\Employee.EmployeeTesting";
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			
			 Map<Employee, Set<Certification>> emap2 = (Map<Employee, Set<Certification>>) ois.readObject();
			 
				ois.close();
				fis.close();
				
		      System.out.println("Deserialization successful");

	
	            for (Map.Entry<Employee, Set<Certification>> entry : emap2.entrySet()) {
	                Employee employee = entry.getKey();
	                Set<Certification> certifications = entry.getValue();

	                System.out.println("Employee: " + employee);
	                System.out.println("Certifications: " + certifications);
	            }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	  
	    
	}
}
