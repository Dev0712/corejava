package com.arya.main;


import com.arya.pojos.Student;

public class MainStudent {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		
		Student student1=new Student(1,"XYZ",(byte)23);
		
		student1.printProperties(); 
		
		student.printProperties();
		
		
	}

}
