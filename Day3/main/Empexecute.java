package com.sonata.main;

//import com.sonata.Emplyoee;
import com.sonata.Model.Emplyoee;
import com.sonata.Impl.Empimpl;

public class Empexecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoee e1 =new Emplyoee();
		e1.setEmpId(121);
		e1.setEmpName("thanush");
		e1.setSal(100);
		Empimpl e2 =new Empimpl();
		System.out.println(e2.yearSal(e1));
		System.out.println(e2.appSal(e1));
	}

}
