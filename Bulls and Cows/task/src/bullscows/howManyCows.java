package bullscows;

public class howManyCows {
    public static int numberOfCows(String[] userInput, String[] correctValue){
        int numberOfCows = 0;
        for (String i: userInput) {
            for (String j: correctValue) {
                if(i.equals(j)){
                    numberOfCows++;
                    break;
                }
            }
        }
        return numberOfCows;
    }
}
