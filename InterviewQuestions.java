
//1. Write a Java program to find the factorial of a number (ex: 4! = 4x3x2x1)

//2. Implement a program to check if a number is prime (a prime number is divisible by itself and 1)

//3. Write a simple program to reverse a string (e.g. print a statement so that "Hello, World!" is "!dlroW ,olleH")

//4. Refactor the following code:

public class NumberUtilities {
    public static void main(String[] args) {

        int squared = 10 * 10;
        int cubed = 10 * 10 * 10;

        System.out.println("Number: " + 10);
        System.out.println("Squared: " + squared);
        System.out.println("Cubed: " + cubed);

        int anotherSquared = 5 * 5;
        int anotherCubed = 5 * 5 * 5;

        System.out.println("Number: " + 5);
        System.out.println("Squared: " + anotherSquared);
        System.out.println("Cubed: " + anotherCubed);
    }
}

/**
 * 5. This is a for loop. Right now, it counts from 1 to 100. Please make it
 * count backwards from 100 to 1 and print the value
 * without changing the conditions of the for loop.
 */

public class BackwardCounting {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}