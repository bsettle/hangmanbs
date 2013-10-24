/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import java.util.Scanner;

/**
 *
 * @author rebeccasettle
 */
public class HelpMenuView {
    public void displayMenu(){
        HelpMenuControl control = new HelpMenuControl();//New class HelpMenuControl
        displayString(control.getMenu());// Displays menu
        
    }
    public void getInput(){
        Scanner input = new Scanner(System.in);// Scanner will get new input form the user
        HelpMenuControl control = new HelpMenuControl();//this class will exicute the action for the command that is input
        while (input.hasNext()){// checks to see that the user has input a new command for the menu
            String userInput = input.next();//gets command from the user
            if (control.isProperlyFormatedCommand(userInput)){
                if (control.isQuit(userInput)){//if user inputs Q then it quits
                    break;
                    }
                if (control.isStartGame(userInput)){
                    break;
                }
                displayString(control.getAction(userInput));//displays the string depending on the letter the user inputs ie. I,A,Q
            }
            else {
                displayString("invalid command");
            } 
        }
    }
    public void displayString(String input){//this function displays the output
        System.out.println(input);
    }
}
