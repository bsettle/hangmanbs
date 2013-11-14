/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rebeccasettle
 */
public class InputRetriever {

    public InputRetriever() {
    }
    
    public static String retrieveInput(){
        Scanner input = new Scanner(System.in);// Scanner will get new input form the user
        
        while (input.hasNext()){//checks to see that the user has input a new command for the menu
            String userInput = input.next();//this gets the input from the user
            Pattern p = Pattern.compile("[^a-zA-Z]", Pattern.CASE_INSENSITIVE);//Looking any character that is not a letter 
            Matcher m = p.matcher(userInput);
            if (m.find()){//if the string contains anything but letters then the return will be an error.
                System.out.println("Sorry, invalid character");
                continue;
                
            }
            return userInput;
        }
        return null;
    }
}
