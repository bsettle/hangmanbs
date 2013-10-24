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
public class Hangmanbs {
    private String name;
    private String instructions = "This is the game of Hangman\n\n"
            + "The player guesses letters from 26 letters in the English alphabet\n"
            + "If the letter is in the word it is revealed. If the letter is\n"
            + "not in the word a body part is revealed on the hangman.\n"
            + "There are 6 parts of the hangman which are the head, body, 2 legs,\n"
            + "and 2 arms. If the player cannot guess the word before all 6\n"
            + "of the the body parts are showing on the gallows the player loses.\n"
            + "If the player guessed all the letters in the word without hanging\n"
            + "the hangman the player wins.\n\n"; 
            
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      HangmanGallows myGallows = new HangmanGallows();
            String b = myGallows.displayGallows();
            System.out.println(b);
            HelpMenuView menu = new HelpMenuView();
            menu.displayMenu();
            menu.getInput();
            while (true){
                InputRetriever inputRetriever = new InputRetriever();//Creates and object to get input from the user
                System.out.println(inputRetriever.retrieveInput());//prints out whatever the user inputs
            }
           
        // TODO code application logic here
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name = input.next();
                
    }
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name+"\n");
        System.out.println("\nInstructions: " + this.instructions+"\n");
        
    }
}