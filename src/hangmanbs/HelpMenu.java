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
public class HelpMenu extends Menu {
    private final static String [][] menuItems = {
        {"I","Instruction"},
        {"A", "Authors"},
        {"L", "Leave Help Menu"}
    };
   public HelpMenu(){
       super (HelpMenu.menuItems);
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
