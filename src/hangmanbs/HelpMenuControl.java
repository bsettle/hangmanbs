/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

/**
 *
 * @author rebeccasettle
 */
public class HelpMenuControl {
    private String instructions = "This is the game of Hangman\n\n"
            + "The player guesses letters from 26 letters in the English alphabet\n"
            + "If the letter is in the word it is revealed. If the letter is\n"
            + "not in the word a body part is revealed on the hangman.\n"
            + "There are 6 parts of the hangman which are the head, body, 2 legs,\n"
            + "and 2 arms. If the player cannot guess the word before all 6\n"
            + "of the the body parts are showing on the gallows the player loses.\n"
            + "If the player guessed all the letters in the word without hanging\n"
            + "the hangman the player wins.\n\n"; 
     
    private String menu = "Instuctions = I\n"
             + "Quit = Q\n"
             + "Authors = A\n"
             + "Menu = M\n"
             + "Start Game = S\n";
     
    private String authors = "Becky\n"
             + "Calvin\n";
     public String getMenu(){
     return this.menu;
     }
     public String getInstructions(){
     return this.instructions;
     }
     public String getAuthors(){
     return this.authors;
     }
    // public String startGame(){
         
   //  }
     public boolean isQuit(String input){
         return input.equalsIgnoreCase("Q");// Will check to see if the user input the Q command
     }
     public String getAction(String input){// Checking to see what command the user input and returning the proper string to dispay
         if (input.equalsIgnoreCase("I")){return this.instructions;}
         if (input.equalsIgnoreCase("A")){return this.authors;}
         if (input.equalsIgnoreCase("M")){return this.menu;}
         if (input.equalsIgnoreCase("S")){return this.startGameHomey();}
         if (input.equalsIgnoreCase("Q")){return "";}
         
         return "unknown command";
     }
     public boolean isProperlyFormatedCommand (String input){
         if (input.length()==1){
             return true;
         }
         return false;
     }

    private String startGameHomey() {
        Hangmanbs myGame = new Hangmanbs();
            myGame.getName();
            myGame.displayHelp();
            
            return "yay you played a game.. you're so smart!!!";
    }
}
