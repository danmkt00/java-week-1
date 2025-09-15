/**
 * Exercises:
 * ---------------------------------------------------------------------
 * 1. Create a variable of type 'char' called myLetter and assign it any letter.
 * 2. Create a variable of type 'float' called myFloat and assign it any decimal value.
 * 3. Create a variable of type 'long' called myBigNumber and assign it a large number.
 * 4. Create a variable of type 'byte' called mySmallNumber and assign it a small number.
 * 5. Create a variable of type 'short' called myShortNumber and assign it a number.
 * Bonus:
 * 6. Change the value of an existing variable (for example, myNumber) and print it again.
 * 7. Create two int variables, add them together, and print the result.
 * 8. Create a String variable for your name and print a greeting message using it.
 */

public class VariablesE
{
    public static void main(String[] args)
    {
        // Variable declaration and initialization (already done for you)
        int myNumber = 10;
        String myText = "Hello, World!";
        double myDecimal = 5.99;
        boolean myBoolean = true;

        // Print variables to the console
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Boolean: " + myBoolean);

        // -------------------- Student Exercises --------------------
        // 1. Create a char variable called myLetter and assign it any letter

        char myLetter = 'a';

        // 2. Create a float variable called myFloat and assign it any decimal

        float myFloat = 1.33f;

        // 3. Create a long variable called myBigNumber and assign it a large number

        long myBigNumber = 123123123;

        // 4. Create a byte variable called mySmallNumber and assign it a small number

        byte mySmallNumber = 1;

        // 5. Create a short variable called myShortNumber and assign it a number

        short myShortNumber = 123;

        // 6. Change the value of myNumber and print the new value

        myNumber = 15;
        System.out.println("My number: " + myNumber);

        // 7. Create two int variables, add them, and print the result

        int firstInt = 1;
        int secondInt = 2;
        System.out.println("Result of adding two ints: " + firstInt + secondInt);

        // 8. Create a String variable for your name and print a greeting message

        String name = "Daniel";
        System.out.println("My name is: " + name);
    }
}
