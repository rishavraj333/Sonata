package com.sonata2;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClassTest {
	
	@Test
	public void addTest() {
		Calculator c1 = new Calculator();
		Assertions.assertEquals(20,c1.add(10,10));
		Assertions.assertEquals(100,c1.mul(10,10));
	}

}

