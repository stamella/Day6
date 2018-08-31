package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class StudentFruitsTest {

	@Test
	void testStudentFavouriteFruit() {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		String[] favorites = new String[] { "fasgh", "asdyau" };
		map.put("swathi", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] { "banana", "kiwi", "orange" };
		map.put("sree", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] { "peru", "cockroach" };
		map.put("abhi", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] { "peru", "papaya", "apple" };
		map.put("sriS", new ArrayList<>(Arrays.asList(favorites)));

		assertEquals(4, map.size());
		/*for (Entry<String, ArrayList<String>> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());*/
       System.out.println(favorites.length);
	}
}
