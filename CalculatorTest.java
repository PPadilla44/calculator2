package com.calculator2;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.performOperations(10.2);
        c.performOperations('+');
        c.performOperations(5);
        c.performOperations('*');
        c.performOperations(2.75);
        c.performOperations('/');
        c.performOperations(5);
        c.performOperations('*');
        c.performOperations(2);
        c.performOperations('-');
        c.performOperations(10);
        c.performOperations('+');
        c.performOperations(10.9);
        c.performOperations('=');

        //get final anwer
        System.out.println(c.getResults());
    }

}
