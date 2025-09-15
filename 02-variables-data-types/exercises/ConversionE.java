/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
//        // --- Implicit Conversions (Widening) ---
//        int intValue = 100;
//        double widenedDouble = intValue; // int to double
//        char letter = 'A';
//        int widenedInt = letter;         // char to int (ASCII/Unicode value)
//
//        System.out.println("=== Implicit (Widening) Conversions ===");
//        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
//        System.out.println("char ('" + letter + "') → int: " + widenedInt);
//
//        // --- Explicit Conversions (Narrowing) ---
//        double doubleValue = 9.78;
//        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
//        float floatValue = 130.75f;
//        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)
//
//        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
//        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
//        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------
        // 1. Create a short variable with any value and assign it to an int (implicit)

//        short shortValue = 123;
//        int intFromShort = shortValue;

        // 2. Create an int variable with a large value and assign it to a long (implicit)

//        int intValue = 1000000;
//        long longFromInt = intValue;

        // 3. Create a long variable and assign it to a float (implicit)

//        long longValue = 100000000;
//        float floatFromLong = longValue;

        // 4. Create a double variable and cast it to a float (explicit)

//        double doubleValue = 1.3;
//        float floatFromDouble = (float) doubleValue;

        // 5. Create an int variable and cast it to a short (explicit)

//        int intValue = 100;
//        short intToShort = (short) intValue;


        // 6. Create a long variable and cast it to a byte (explicit)

        long longValue = 123123123;
        byte longToByte = (byte) longValue;

        // 7. Try converting a large int (e.g., 1000) to a byte and print the result

        int intValue = 1000;
        System.out.println((byte) intValue);

        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value

        char charValue = 'Z';
        System.out.println((int) charValue);

        // 9. Convert an int into a char and print the resulting character

        System.out.println((char) intValue);

        // 10. Create a double with decimals, convert it to int, and print the result

        double doubleWithDecimals = 11.73;
        System.out.println((int) doubleWithDecimals);
    }
}
