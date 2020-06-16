package com.ritu.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {
	

	
	
	@Test
	void testAssertEquals() {
		assertEquals(3, 3);
		
	}
	@Test
	void testAssertTrue() {
		
		assertTrue("Ritika".length()==6);
		
	}
	@Test
	void testAssertFalse() {
		
		assertFalse("yashvi".charAt(2)=='a');
	}
	
}
