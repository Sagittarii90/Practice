package string;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
Task: Write a program to check if the letter 'e' is present in the word 'Umbrella'.
 */

public class CheckLetter {
    public static void main(String[] args) {
        String a = "Umbrella";
        boolean per = false;
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == 'e'){
                per=true;
                break;
            }
        }

        Logger logger = Logger.getLogger(CheckLetter.class.getName());
        if(!per){
            logger.log(Level.INFO, "false");
        } else {
            logger.log(Level.INFO, "true");
        }
    }
}
