package com.sonata;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import com.sonata2.Calculator;

public class Testdiv {
	
	@Test
	public void divTest() {
		
		Calculator c2 = new Calculator();
		
		assertThrows(ArithmeticException.class,()->c2.div(1,0),"it is an error");
	}

}
