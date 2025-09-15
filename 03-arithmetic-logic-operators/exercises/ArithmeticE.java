/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // -------------------- Student Exercises --------------------
        // 1. Create two int variables
        int x = 7;
        int y = 3;

        // 2. Perform basic arithmetic operations
        System.out.println("x + y = " + (x + y));       // 10
        System.out.println("x - y = " + (x - y));       // 4
        System.out.println("x * y = " + (x * y));       // 21
        System.out.println("x / y = " + (x / y));       // 2 (int division)
        System.out.println("x % y = " + (x % y));       // 1 (remainder)

        // 3. Division that doesn’t divide evenly
        System.out.println("7 / 2 (int division): " + (7 / 2)); // 3
        System.out.println("7 % 2 (remainder): " + (7 % 2));    // 1

        // 4. Double division using x and y
        double dx = x;
        double dy = y;
        System.out.println("x / y (double division): " + (dx / dy)); // 2.3333

        // 5. Sum of x, y, and another number
        int z = 5;
        int total = x + y + z;
        System.out.println("Total of x, y, z: " + total); // 15

        // 6. Average of x, y, z
        double average = total / 3.0; // divide by 3.0 for double
        System.out.println("Average: " + average); // 5.0

        // 7. Division by zero
        // int resultInt = x / 0; // would cause ArithmeticException
        double resultDouble = x / 0.0; // Infinity
        System.out.println("Double division by zero: " + resultDouble); // Infinity

    }
}
