/*
* The "log" program calculates how many logs fit in a truck.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-11-18
*/

import java.util.Scanner;

/**
* This is the log program.
*/
final class Log {
    /**
    * Created constants.
    */
    public static final double LOG_DENSITY = 20;

    /**
    * Created constants.
    */
    public static final double TRUCK_CAPACITY = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Log() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // get the logs length
        // code from https://www.w3schools.com/java/java_user_input.asp
        final Scanner input = new Scanner(System.in);
        System.out.println(
            "What is the length of the logs? (0.25, 0.5, or 1 meter)"
        );

        final double logsLength = input.nextFloat();

        final double logsNumber = (TRUCK_CAPACITY / logsLength) / LOG_DENSITY;

        System.out.println(
            "\nThe number of logs that can be put in the truck are:"
            + logsNumber
        );

        System.out.println("\nDone.");
    }
}
