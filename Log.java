/*
* The "log" program calculates how many logs fit in a truck.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-11-18
*/

/**
* This is the log program
*/

// code from https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner; // import the Scanner class

final class Log {

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

	float truckCapacity = 1100;
	float logDensity = 20;

        // get the logs length
	Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is the length of the logs? (0.25, 0.5, or 1 meter)");

	float logsLength = input.nextFloat();

	float logsNumber = (truckCapacity / logsLength) / logDensity;

	System.out.println("\nThe number of logs that can be put in the truck are:" + logsNumber);

        System.out.println("\nDone.");
    }
}

