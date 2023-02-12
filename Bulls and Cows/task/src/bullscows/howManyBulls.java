package bullscows;

public class howManyBulls {
    public static int numberOfBulls(String[] userInput, String[] correctValue){
        int numberOfBulls = 0;
        for (int i = 0; i< userInput.length; i++) {
            if(userInput[i].equals(correctValue[i])){
                numberOfBulls++;
            }
        }
        return numberOfBulls;
    }
}
