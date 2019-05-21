package com.test.calc;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(4,2));
        System.out.println(sub(4,2));

    }

    public static int add (int a, int b) 
	{
		return a + b;
	}
    
    public static int sub (int a, int b) 
	{
		return a - b;
	}

}
