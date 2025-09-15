/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two int variables x = 15, y = 25.
 *    - Use a ternary operator to find and print the minimum value.
 *
 * 2. Create an int variable age = 18.
 *    - Use a ternary operator to print "Adult" if age >= 18, otherwise "Minor".
 *
 * 3. Create three int variables a = 10, b = 20, c = 15.
 *    - Use nested ternary operators to find the largest of the three numbers.
 *
 * 4. Create a boolean variable isRaining = true.
 *    - Use a ternary operator to print "Take an umbrella" if true, else "No umbrella needed".
 *
 * Bonus:
 * 5. Use a ternary operator to check if a number n = 7 is even or odd and print the result.
 * -------------------------------------------------------------
 */

public class TernaryE
{
    public static void main(String[] args)
    {
//        int a = 10;
//        int b = 20;
//
//        // Using the ternary operator to find the maximum of two numbers
//        int max = (a > b) ? a : b;
//        System.out.println("The maximum value is: " + max);


        // -------------------- Student Exercises --------------------
        // 1. Create int x = 15, y = 25; use ternary to find minimum.

        int x = 15;
        int y = 25;

        int minimun = x < y ? x : y;
        System.out.println(minimun);

        // 2. Create int age = 18; use ternary to print "Adult" or "Minor".

        int age = 18;
        String isAdult = age >= 18 ? "Adult" : "Minor";
        System.out.println(isAdult);

        // 3. Create int a = 10, b = 20, c = 15; use nested ternary to find largest.

        int a = 10;
        int b = 20;
        int c = 15;
        int largest = (a > b) ?  ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(largest);

        // 4. Create boolean isRaining = true; use ternary to print umbrella advice.

        boolean isRaining = true;
        String umbrellaAdvise = isRaining ? "take umbrella" : "take sunglasses";
        System.out.println(umbrellaAdvise);

        // 5. Check if n = 7 is even or odd using ternary and print.
        int n = 7;
        String isEven = n % 2 == 0 ? "even" : "odd";
        System.out.println(isEven);
    }
}
