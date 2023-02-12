package bullscows;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        // initial values
        int numberOfCows;
        int numberOfBulls = 0;
        int numberOfTurns = 1;

        Scanner scanner = new Scanner(System.in);
        // get user input
        setNumberLengthAndPossibleValues setNumberLengthAndPossibleValues = new setNumberLengthAndPossibleValues();

        // set number
        int userNumber = setNumberLengthAndPossibleValues.setLength();

        // set possible values
        String[] possibleValues = setNumberLengthAndPossibleValues.setPossibleValues(userNumber);

        // generate number
        generateRandomNumber randomComputerNumber = new generateRandomNumber();
        String[] correctValueArray = randomComputerNumber.getNumber(userNumber, possibleValues);

        // Print the starting instructions
        outputStartingLine.start(userNumber, possibleValues);

        // convert array to string
        String displayValue = "";
        for (String s : correctValueArray) {
            displayValue += s;
        }

        // start the game
        while (numberOfBulls != displayValue.length()) {
            System.out.printf("Turn %d", numberOfTurns);
            System.out.println("");
            numberOfTurns++;
            System.out.println("Input a value:");
            String[] userInput = scanner.nextLine().split("");

            // calculate the number of bulls & cows
            numberOfBulls = howManyBulls.numberOfBulls(userInput, correctValueArray);
            numberOfCows = howManyCows.numberOfCows(userInput, correctValueArray);

            //print the result
            if (numberOfBulls == displayValue.length()) {
                System.out.printf("Grade: %d bulls.", numberOfBulls);
                System.out.println("");
                System.out.println("Congratulations! You guessed the secret code.");
            } else if (numberOfCows > 0 && numberOfBulls > 0) {
                System.out.printf("Grade: %d bull(s) and %d cow(s).", numberOfBulls, numberOfCows);
                System.out.println("");
            } else if (numberOfCows == 0 && numberOfBulls == 0) {
                System.out.printf("Grade: None.");
                System.out.println("");
            } else if (numberOfCows > 0 && numberOfBulls == 0) {
                System.out.printf("Grade: %d cow(s).", numberOfCows);
                System.out.println("");
            } else if (numberOfCows == 0 && numberOfBulls > 0) {
                System.out.printf("Grade: %d bull(s).", numberOfBulls);
                System.out.println("");
            }
        }

    }
}
