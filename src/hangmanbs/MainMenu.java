/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import static hangmanbs.HelpMenuView.displayString;
import java.util.Scanner;

/**
 *
 * @author rebeccasettle
 */
public class MainMenu extends Menu {
    private final static String [][] menuItems = {
        {"1","One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"P", "Change preferences"},
        {"X", "Exit Hangman"}
    };
   public MainMenu(){
       super (MainMenu.menuItems);
   } 
   @Override
    public String executeCommands(){
       super.display();
         Scanner input = new Scanner(System.in);// Scanner will get new input form the user
        while (input.hasNext()){// checks to see that the user has input a new command for the menu
           super.getCommand(input.next());
        }
  return null;
   }
}