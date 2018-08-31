package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.CarDetails;

class CarDetailsTest {

	@Test
	void testCheckCar() {
		
				TreeSet<CarDetails> car=new TreeSet<CarDetails>();
				
				car.add(new CarDetails( "scoda", "SM320",2011,5000000));
				car.add(new CarDetails( "alto", "A320",2015,5000));
				car.add(new CarDetails("maruthi suzuki", "i 10",2015,56852));
				assertEquals(3, car.size());
		for (CarDetails car1 : car) {
			System.out.println(car1);

		}
		
		
	}

}
