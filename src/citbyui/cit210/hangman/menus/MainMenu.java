/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.menus;

import citbyui.cit210.hangman.exceptions.MenuException;
import static citbyui.cit210.hangman.menus.HelpMenuView.displayString;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rebeccasettle
 */
public class MainMenu extends Menu {
    private final static String [][] menuItems = {
        {"S","Start Game"},
        {"H", "Help"},
        {"Q", "Quit"}
    };
   public MainMenu(){
       super (MainMenu.menuItems);
   } 
   @Override
    public String executeCommands(){
       super.display();
         Scanner input = new Scanner(System.in);// Scanner will get new input form the user
        while (input.hasNext()){try {
               // checks to see that the user has input a new command for the menu
super.getCommand(input.next());
           } catch (MenuException ex) {
               Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
  return null;
   }
}