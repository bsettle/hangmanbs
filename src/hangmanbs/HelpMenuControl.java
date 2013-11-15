/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

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
     
    private static String menu = "Instuctions = I\n"
             + "Quit = Q\n"
             + "Authors = A\n"
             + "Menu = M\n"
             + "Start Game = S\n";
     
    private static String authors = "Becky\n"
             + "Calvin\n";
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
         return input.equalsIgnoreCase("Q");// Will check to see if the user input the Q command
         
     }
     public static boolean isStartGame(String input){
         return input.equalsIgnoreCase("S");// Will check to see if the user input the S command
         
     }
     public static String getAction(String input){// Checking to see what command the user input and returning the proper string to dispay
         if (input.equalsIgnoreCase("I")){return HelpMenuControl.instructions;}
         if (input.equalsIgnoreCase("A")){return HelpMenuControl.authors;}
         if (input.equalsIgnoreCase("M")){return HelpMenuControl.menu;}
         if (input.equalsIgnoreCase("S")){return HelpMenuControl.startGameHomey();}
         if (input.equalsIgnoreCase("Q")){return "";}
         
         return "unknown command";
     }
     public static boolean isProperlyFormatedCommand (String input){
         if (input.length()==1){
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
