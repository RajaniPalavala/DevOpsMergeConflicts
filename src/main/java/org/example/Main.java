package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Sum of user input is "+sumOf(5,7,3));
    }

    /**
     * Calculates the sum of three integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the sum of {@code a}, {@code b}, and {@code c}
     */
    public static int sumOf(int a, int b, int c){
        return a + b + c;
    }
}