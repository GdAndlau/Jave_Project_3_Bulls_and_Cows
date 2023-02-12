package bullscows;
import java.util.*;

public class generateRandomNumber {
    int acc = 0;

    public String[] getNumber(int userNumber, String[] possibleValues){
        // set answer
        String[] answer = new String[userNumber];
        // set array list to ensure no duplcates are added
        List<String> randomNumList = new ArrayList<>();

        // logic for all
        if(possibleValues.length <= 36) {
            while(acc < userNumber) {

                //generated random number
                int rnd = new Random().nextInt(possibleValues.length);

                // create the random
                if (!randomNumList.contains(possibleValues[rnd]) && acc <= userNumber) {
                    answer[acc] = possibleValues[rnd];
                    randomNumList.add(possibleValues[rnd]);
                    acc++;
                }

                if(answer[0].equals("0"))acc=0;
            }
        }

        return answer;
    }
}
