package com.ritu.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath mymath = new MyMath();

	@BeforeEach
	public void before() {
		System.out.println("before every test");
	}

	@AfterEach
	public void after() {
		System.out.println("After every test");
	}

	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before class initialization");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After Class shut down");
	}

	@Test
	void test5Numbers() {
		System.out.println("test5numbers");
		assertEquals(20, mymath.sum(new int[] { 3, 14, 0, 1, 2 }));
	}

	@Test
	void test1Number() {
		System.out.println("test 1 number");
		assertEquals(30, mymath.sum(new int[] { 30 }));
	}
}
