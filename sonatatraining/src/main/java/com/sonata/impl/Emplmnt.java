package com.sonata.impl;
import com.sonata.intrf.EmpInt;
import com.sonata.model.Employee;

	
	public class Emplmnt implements EmpInt {

		@Override
		public double yearlySal(Employee e1) {
			double ySal;
			ySal = e1.getSal()*12;
			return ySal;
		}

		@Override
		public double appSal(Employee e1) {
			double aSal;
			if(e1.getSal()<10000) {
				aSal = 5000;
			}else {
				aSal = 1000;
			}
			return aSal;
		}

}
