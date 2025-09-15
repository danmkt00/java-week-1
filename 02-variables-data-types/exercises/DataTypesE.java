/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */

import java.util.Arrays;

public class DataTypesE
{
    public static void main(String[] args)
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();

        // -------------------- Student Exercises --------------------
        // 1. Create an int variable called age and assign it your age

        String name = "Daniel";
        int age = 21;

        // 2. Create a double variable called temperature and assign it any decimal

        double temperature = 18.5;

        // 3. Create a char variable called gradeLetter and assign it a letter

        char gradeLetter = 'A';

        // 4. Create a boolean variable called isJavaFun and assign true or false

        boolean isJavaFun = true;

        // 5. Create a String variable called favoriteColor and assign it a color

        String favoriteColor = "black";

        // 6. Create an int array called numbers with at least 5 values, then print them

        int []numbers = {1,2,3,4,5};
        System.out.println("Array of numbers:");
        System.out.println(Arrays.toString(numbers));

        // 7. Change one value inside numbers and print the updated array

        numbers[1] = 6;
        System.out.println("Updated array of numbers:");
        System.out.println(Arrays.toString(numbers));

        // 8. Create a String array with 3 favorite foods and print them in a loop
        String []foods = {"apple", "rice", "banana"};
        System.out.println("Foods array:");
        for(String food: foods){
            System.out.print(food+" ");
        }
        System.out.println();

        // 9. Create two double variables, add them together, and print the result
        double a = 1.1;
        double b = 1.2;
        double sum = a + b;
        System.out.println("Add two doubles: "+sum);

        // 10. Use String concatenation to print: "My name is ___ and I am ___ years old."

        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
