package com.sonata.Impl;

import com.sonata.Model.Emplyoee;
import com.sonata.intf.empintf;

public class Empimpl implements empintf {

	@Override
	public double yearSal(Emplyoee e1) {
		// TODO Auto-generated method stub
		double ySal;
		ySal=e1.getSal()*12;
		return ySal;
	}

	@Override
	public double appSal(Emplyoee e1) {
		// TODO Auto-generated method stub
		double asal;
		if(e1.getSal()<10000) {
			asal=5000;
		}else {
				asal=100;
			}
				
		
		return asal;
	}

}
