package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import com.capgemini.day6.Students;

class StudentTest {

	@Test
	void test() {
		ArrayList<Students>  student = new ArrayList<Students>();
		
		student.add(new Students("swathi",276,"EEE"));
		student.add(new Students("sree",270,"CSE"));
		student.add(new Students("sri",271,"ECE"));
		
		assertEquals(3, student.size());
		for(Students students : student) {
			System.out.println(students);
			
		}
	}
		
	
    
	@Test
	void testStudentDetails() {
		TreeSet<Students>  student = new TreeSet<Students>();
		
		student.add(new Students("swathi",276,"EEE"));
		student.add(new Students("sree",270,"CSE"));
		student.add(new Students("sri",271,"ECE"));
		
		assertEquals(3, student.size());
		for(Students students : student) {
			System.out.println(students);
			
		}
	}
}


