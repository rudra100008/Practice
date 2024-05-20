package com.company.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Students{
	private final int id;
	private final String name;
	private final String address;
	private final String number;
	
	public Students(int id,String name,String address,String number) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getNumber() {
		return number;
	}
}
public class ListExample5 {
	public static void main(String[] args) {
		 List<Students>  list1= new ArrayList<Students>();
		
		  Students s1= new Students(1, "Ashum Bhuju", "Narayanter", "9813959554");
		  Students s2= new Students(2, "Shyam", "Narayanter", "9813959555");
		  Students s3= new Students(3, "Hari", "Narayanter", "9813959556");
		  Students s4= new Students(4, "John", "Narayanter", "9813959557");
		  Students s5= new Students(2, "Shyam", "Narayanter", "9813959555");
		  list1.add(s1);
		  list1.add(s2);
		  list1.add(s3);
		  list1.add(s4);
		  list1.add(s5);
		  
		 
		 for(Students s:list1) {
			 System.out.println(" "+s.getId()+" "+s.getName()+" "+s.getAddress()+" "+s.getNumber());
		 }
		 
		 Set<Integer> idSet = new HashSet<Integer>();
		  for(Students st:list1) {
			  if(!idSet.add(st.getId())) {
				  System.out.println("Duplicate id found:"+st.getName());
			  }
		  }
		
	   
	}
 
  
 
 
}
