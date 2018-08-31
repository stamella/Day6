package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.LaptopDuplicate;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class Question1Test {

	@Test
	void testLaptopProducts() {
     ArrayList<Laptop> laptops = new ArrayList<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(3, laptops.size());
	}
	
	@Test
	void testCar() {
	     ArrayList<Car> carss = new ArrayList<>();
			
			assertEquals(true, carss.add(new Car("BMW", "desire", 2001, 2000000)));
			carss.add(new Car("Mahindra", "ilo", 2002, 1500000));
			carss.add(new Car("Ford", "eco", 2008, 1200000));
			
			assertEquals(3, carss.size());
		}
    
	@Test
	void testTelevisionDetails() {
	     ArrayList<Television> tv = new ArrayList<>();
			
			assertEquals(true, tv.add(new Television("Samsung","LCD", true, 52000)));
			tv.add(new Television("Videocon", "LED",false, 20000));
			tv.add(new Television("Reconnect","Plasma",true, 60000));
			
			assertEquals(3, tv.size());
		}
	
	@Test
	void testCellPhoneProducts() {
	     ArrayList<CellPhone> cell = new ArrayList<>();
			
			assertEquals(true, cell.add(new CellPhone("Samsung","duo","good","Android",10100)));
			cell.add(new CellPhone("Redmi", "note5","Excellent","Oreo", 20000));
			cell.add(new CellPhone("Reliance","v9","better","Windows", 5000));
			
			assertEquals(3, cell.size());
		}
	
	@Test
	void testSchoolDetails() {
	     ArrayList<School> schools = new ArrayList<>();
			
			assertEquals(true, schools.add(new School("SriShirdi", "kadiyam", "EastGodavari", 1)));
			schools.add(new School("Vasavi", "kavali", "Guntur", 3));
			schools.add(new School("chaitanya", "vemagiri", "Westgodavari",2));
			
			assertEquals(3, schools.size());
		}
	@Test
	void testLaptopDuplicate() {

	     HashSet<Laptop> laptops = new HashSet<>();
			
			assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
			laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
			laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
			
			assertEquals(2, laptops.size());
		}
	
}
