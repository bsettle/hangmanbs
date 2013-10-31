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
    private String instructions = 
            "==========================================================================\n"
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
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      HangmanGallows myGallows = new HangmanGallows(); //This creates a new object of the Hangman Gallows class
            String b = myGallows.displayGallows(); //This runs the function under the gallows class and stores it into the variable "b"
            System.out.println(b); //This displays the variable "b", which is the gallows.
            
            
            HelpMenuView menu = new HelpMenuView();
            menu.displayMenu();
            menu.getInput();
            while (true){
                InputRetriever inputRetriever = new InputRetriever();//Creates and object to get input from the user
                System.out.println(inputRetriever.retrieveInput());//prints out whatever the user inputs
            }
      /*ClassAssignments assignment = new ClassAssignments();
      System.out.println("Printing Multi Dimensional Array");
      assignment.printMultiArray();
      System.out.println("Printing Single Dimensional Array");
      assignment.printArray();
      System.out.println("Sorting Single Dimensional Array");
      assignment.sortArray();
      System.out.println("Printing Single Dimensional Array");
      assignment.printArray();
      assignment.sumArray();*/
            
      /*CalvinArray arrayed = new CalvinArray(); "This creates an object of my CalvinArray class and calls it arrayed"
       * arrayed.arrayAssignment(); "This runs the method from the CalvinArray class called arrayAssignment, which outputs my arrays."
       */
      
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