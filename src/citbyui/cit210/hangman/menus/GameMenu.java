/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.menus;

import java.util.Scanner;

/**
 *
 * @author rebeccasettle
 */
public class GameMenu extends Menu {
    private final static String [][] menuItems = {
        {"S","Start Game"},
        {"W", "Select Word"},
        {"T", "Try Agin"},
        {"E", "End Game"}
    };
   public GameMenu(){
       super (GameMenu.menuItems);
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
