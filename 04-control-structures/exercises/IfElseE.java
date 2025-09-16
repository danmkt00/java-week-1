/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable x and check if it is even or odd using if-else.
 *
 * 2. Create an int variable age.
 *    - If age >= 18, print "Adult".
 *    - Else, print "Minor".
 *
 * 3. Create an int variable score (0-100).
 *    - Use if-else to assign grades:
 *      >=90 -> "A"
 *      >=75 -> "B"
 *      >=50 -> "C"
 *      <50  -> "F"
 *
 * 4. Create a double variable temperature.
 *    - If temperature > 30, print "Hot".
 *    - Else if temperature >= 20, print "Warm".
 *    - Else, print "Cold".
 *
 * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
 * -------------------------------------------------------------
 */

public class IfElseE
{
    public static void main(String[] args)
    {
        int number = 10;

        if (number > 0)
        {
            System.out.println("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }

        // -------------------- Student Exercises --------------------
        // 1. Check if x is even or odd.
        int x = 2;
        if(x%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        // 2. Check age and print "Adult" or "Minor".
        int age = 18;
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Minor");

        }

        // 3. Assign grades based on score using if-else if-else.
        int score = 80;
        char grade;
        if(score >= 90){
            grade = 'A';
        }else if(score>=75){
            grade = 'B';
        }else if(score>=50){
            grade = 'C';
        }else{
            grade = 'F';
        }

        System.out.println("Your grade is "+grade);

        // 4. Check temperature and print "Hot", "Warm", or "Cold".

        int temperature = 31;
        String weather;
        if(temperature > 30){
            weather = "Hot";
        }
        else if(temperature >= 20){
            weather = "Warm";
        }
        else {
            weather = "Cold";
        }
        System.out.println("The weather is: "+ weather);

        // 5. Check if n is positive AND even using logical operators.

        int n = 6;
        if(n > 0 && n%2==0){
            System.out.println(n+" is positive and even");
        }else{
            System.out.println(n+" is not positive or even");
        }

    }
}
