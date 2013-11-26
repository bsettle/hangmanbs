/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.menus;

import static citbyui.cit210.hangman.menus.MenuItems.AUTHORS;
import static citbyui.cit210.hangman.menus.MenuItems.MENU;
import static citbyui.cit210.hangman.menus.MenuItems.START_GAME;
import java.io.Serializable;

/**
 *
 * @author rebeccasettle
 */
public class HelpMenuControl implements Serializable {
    private static String instructions = "==========================================================================\n"
            +"\tThis is the game of Hangman\n\n"
            + "\tThe player guesses letters from 26 letters in the English alphabet\n"
            + "\tIf the letter is in the word it is revealed. If the letter is\n"
            + "\tnot in the word a body part is revealed on the hangman.\n"
            + "\tThere are 6 parts of the hangman which are the head, body, 2 legs,\n"
            + "\tand 2 arms. If the player cannot guess the word before all 6\n"
            + "\tof the the body parts are showing on the gallows the player loses.\n"
            + "\tIf the player guessed all the letters in the word without hanging\n"
            + "\tthe hangman the player wins.\n\n" 
            + "==========================================================================\n"; 
     
    private static String menu = "Instuctions = INSTRUCTIONS\n"
             + "Quit = QUIT\n"
             + "Authors = AUTHORS\n"
             + "Menu = MENU\n"
             + "Start Game = START_GAME\n";
     
    private static String authors = "Becky\n"
             + "Calvin\n";

    private static MenuItems MenuItems(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public HelpMenuControl() {
    
    }

    public static String getInstructions() {
        return instructions;
    }

    public static void setInstructions(String instructions) {
        HelpMenuControl.instructions = instructions;
    }

    public static String getMenu() {
        return menu;
    }

    public static void setMenu(String menu) {
        HelpMenuControl.menu = menu;
    }

    public static String getAuthors() {
        return authors;
    }

    public static void setAuthors(String authors) {
        HelpMenuControl.authors = authors;
    }
    
     
     public static boolean isQuit(String input){
         MenuItems newItem = MenuItems.valueOf(input);
         if (newItem == MenuItems.QUIT)
             return true;
         return false;
         
     }
     public static boolean isStartGame(String input){
          MenuItems newItem = MenuItems.valueOf(input);
         if (newItem == MenuItems.START_GAME)
             return true;
         return false;
             
     }
     public static String getAction(String input){
          MenuItems newItem = MenuItems.valueOf(input);
          switch(newItem){
              case INSTRUCTIONS:{
                  return HelpMenuControl.instructions;
                }
              case AUTHORS:{
                  return HelpMenuControl.authors;
              }
              case MENU:{
                  return HelpMenuControl.menu;
              }
              case START_GAME:{
                  return HelpMenuControl.startGameHomey();
              }
              case QUIT:{
                  return "";
              }
          }
        return "unknown command";
     }
     public static boolean isProperlyFormatedCommand (String input){
         if (input.length()>=1){
             return true;
         }
         return false;
     }

    private static String startGameHomey() {
        //Hangmanbs myGame = new Hangmanbs();
           // myGame.getName();
           //  myGame.displayHelp();
        return "Welcome to Hangman";
          // return "yay you played a game... you're so smart!!!";
    }
    @Override
    public String toString(){
        String output = "";
        output = output.concat (instructions);
        output = output.concat (authors);
        output = output.concat (menu);
        return output;
    }
    
}
