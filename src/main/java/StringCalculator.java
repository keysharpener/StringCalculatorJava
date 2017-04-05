package main.java;

/**
 * Created by robin on 05/04/2017.
 */
public class StringCalculator {

    public int add(String numbersToAdd){
        Integer result = 0;
        String[] split = numbersToAdd.split(",|\n");
        for(String integerAsString : split){
            if (integerAsString == null || integerAsString.isEmpty()){
                throw new UnsupportedOperationException();
            }
            result = result + Integer.parseInt(integerAsString);
        }
        return result;
    }
}
