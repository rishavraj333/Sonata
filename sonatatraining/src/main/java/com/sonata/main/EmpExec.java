package com.sonata.main;
import com.sonata.model.Employee;
import com.sonata.impl.Emplmnt;
public class EmpExec {
	
	

	
		
		public static void main(String[] args) {
			
			Employee e1 = new Employee();
			e1.setEmpid(123);
			e1.setName("Rishav");
			e1.setSal(100);
			Emplmnt e2=new Emplmnt();
		e2.yearlySal(e1);
			e2.appSal(e1);
		}

}
