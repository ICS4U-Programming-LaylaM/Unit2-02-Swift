import java.util.Scanner;

/**
* This program calculates the factorial of numbers.
*
* @author Layla Michel
* @version 1.0
* @since 2022-04-04
*/

class RecursiveFactorial {
    /**
    * Creating function to calculate the factorial.
    *
    * @param integer as int
    *
    * @return factorials as int
    */
    public int factorial(int integer) {
        int ints = integer;
        int factorials;

        // Calculate the factorial
        if (ints == 1 || ints == 0) {
            factorials = 1;
        } else {
            factorials = ints * factorial(ints - 1);
        }

        return factorials;
    }

    /**
    * Creating main function.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        // Declaring variables.
        Scanner myObj;
        String userString;
        int userInt;
        int fact;

        // Create a recursive factorial object
        RecursiveFactorial recursiveFactorial = new RecursiveFactorial();

        myObj = new Scanner(System.in);

        while (true) {
            // Get a number from the user
            System.out.print("Enter a number: ");
            userString = myObj.nextLine();

            // Check that userInt is an integer
            try {
                userInt = Integer.parseInt(userString);

                // Check that userInt is negative
                if (userInt < 0) {
                    System.out.println("Number must "
                        + "be greater or equal to 0.\n");
                } else {
                    // Call the factorial function
                    fact = recursiveFactorial.factorial(userInt);
                    // Print the factorial
                    System.out.println(userInt + "! is " + fact);
                    break;
                }
            } catch (NumberFormatException ex) {
                // Error message if input isn't a number
                System.out.println("Please enter a valid number.\n");
            }
        }
        myObj.close();
    }
}
