package bullscows;
import java.util.*;


public class setNumberLengthAndPossibleValues {

    public int setLength(){
        int length = 0;
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");

        if(scanInt.hasNextInt()) {
            length = scanInt.nextInt();
            if(length == 0){
                System.out.println("Error: \"" + length +"\" isn't a valid number.");
                System.exit(0);
            }
        } else {
            System.out.println("Error: \"" + scanInt.nextLine()+"\" isn't a valid number.");
            System.exit(0);
        }
        return length;
    }

    public String[] setPossibleValues(int length){
        // all values
        String[] allAvailableValues = "0123456789abcdefghijklmnopqrstuvwxyz".split("");

        //scan user input
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Input the number of possible symbols in the code:");
        int amountOfValues = scanInt.nextInt();
        String[] allPossibleValues = new String[amountOfValues];
        if(amountOfValues<= 36) {
            // create array
            for (int i = 0; i < amountOfValues; i++) {
                allPossibleValues[i] = allAvailableValues[i];
            }
        } else {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z)");
            System.exit(0);
        }

        if(allPossibleValues.length < length){
            System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", allPossibleValues.length, length);
            System.exit(0);
        }
        // return value
        return allPossibleValues;
    }
}

