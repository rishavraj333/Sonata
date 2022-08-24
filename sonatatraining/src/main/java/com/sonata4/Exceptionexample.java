package com.sonata4;

public class Exceptionexample {
    public void div(int a, int b) {
    	try {
    	int c=a/b;
    	System.out.println(c);
    	int d[] = {1,2,3};
    	System.out.println(d[2]);
    }catch(ArithmeticException e1) {
    	System.out.println(e1);
    	}
    	catch(ArrayIndexOutOfBoundsException e2) {
    		System.out.println(e2);
    	}
    	finally {
    		System.out.println("Finally Block");
    	}
    }
    public void show() {
    	System.out.println("this is my program");
    	
    }
    
    public static void main (String args[]) {
    	Exceptionexample e1 = new Exceptionexample();
    	e1.div(10, 1);
    	e1.show();
    }
}
