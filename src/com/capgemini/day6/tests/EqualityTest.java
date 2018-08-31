package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.LaptopEquality;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class EqualityTest {


	@Test
	void testLaptopEquality() {
		

		     HashSet<LaptopEquality> laptops = new HashSet<>();
				
				assertEquals(true, laptops.add(new LaptopEquality("Dell", "Inspiron5558", "Windows 8", "i5")));
				laptops.add(new LaptopEquality("HP", "HP567", "Windows 9", "i7"));
				laptops.add(new LaptopEquality("HP", "HP567", "Windows 10", "i3"));
				
				assertEquals(2, laptops.size());
			}
	@Test
	void testCarEquility() {
		HashSet<Car> carss = new HashSet<>();
		
		assertEquals(true, carss.add(new Car("BMW", "desire", 2001, 2000000)));
		carss.add(new Car("Ford", "eco", 2002, 1500000));
		carss.add(new Car("Ford", "eco", 2008, 1200000));
		
		assertEquals(2, carss.size());
	}
	@Test
	void testTelevisionDetailsEquility() {
	     HashSet<Television> tv = new HashSet<>();
			
			assertEquals(true, tv.add(new Television("Samsung","LCD", true, 52000)));
			tv.add(new Television("Videocon", "LED",false, 60000));
			tv.add(new Television("Videocon","LED",true, 60000));
			
			assertEquals(2, tv.size());
		}
	@Test
	void testCellPhoneProductsEquility() {
	     HashSet<CellPhone> cell = new HashSet<>();
			
			assertEquals(true, cell.add(new CellPhone("Samsung","duo","good","Android",10100)));
			cell.add(new CellPhone("Redmi", "note5","Excellent","Oreo", 20000));
			cell.add(new CellPhone("Redmi","note5","better","Oreo", 5000));
			
			assertEquals(2, cell.size());
		}
	@Test
	void testSchoolDetails() {
	     HashSet<School> schools = new HashSet<>();
			
			assertEquals(true, schools.add(new School("SriShirdi", "kadiyam", "EastGodavari", 1)));
			schools.add(new School("Vasavi", "kavali", "Guntur", 3));
			schools.add(new School("Vasavi", "kavali", "Guntur",2));
			
			assertEquals(2, schools.size());
		}
}


