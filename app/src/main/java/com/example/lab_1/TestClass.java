package com.example.lab_1;

/**
 * Class for laboratory work No. 1
 * @author Ilin Vitaliy gr. IP-812
 * @version 1.0
 */
public class TestClass {
    /**
     * A function for finding the minimum value among two numbers
     * @param a the first number for comparison
     * @param b the second number for comparison
     * @return returns the minimum of two numbers
     */
    public int min(int a, int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }

    /**
     * A function for finding the maximum value among two numbers
     * @param a the first number for comparison
     * @param b the second number for comparison
     * @return returns the maximum of two numbers
     */
    public int max(int a, int b){
        if(a < b){
            return b;
        }else{
            return a;
        }
    }
}

