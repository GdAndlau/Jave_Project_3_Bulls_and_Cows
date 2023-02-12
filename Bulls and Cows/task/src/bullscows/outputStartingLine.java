package bullscows;

public class outputStartingLine {

    public static void start(int userNumber, String[] possibleValues){
        //secret code as a string
        String displaySecretCode = "";
        for (int i = 0; i < userNumber; i++){
            displaySecretCode += "*";
        }

        //code
        if(possibleValues.length<= 9){
            System.out.printf("The secret is prepared: %s (0-%s)", displaySecretCode, possibleValues.length-1);
            System.out.println("");
            System.out.println("Okay, let's start a game!");
        } else {
            System.out.printf("The secret is prepared: %s (0-9, a-%s)", displaySecretCode, possibleValues[possibleValues.length-1]);
            System.out.println("");
            System.out.println("Okay, let's start a game!");
        }
    }
}
