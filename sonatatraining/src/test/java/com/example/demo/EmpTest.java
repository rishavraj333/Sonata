
package com.example.demo;
import com.sonata.model.Employee;
import com.sonata.intrf.*;
import com.sonata.impl.*;

    import org.junit.Test;
    import org.junit.jupiter.api.Assertions;
    
    

public class EmpTest {
	@Test
	
     public void addTest() {
		Emplmnt c1 = new Emplmnt();
		Employee e1= new Employee();
		e1.setSal(1000);
		double a=c1.yearlySal(e1);
		Assertions.assertEquals(12000,c1.yearlySal(e1));
	    
		
	}

}