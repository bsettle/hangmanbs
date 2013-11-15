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
public class HangmanPlayer implements Serializable {
    private static String playerName;//instance variable
    private static int guesses;//instance variable

    public HangmanPlayer() {
        this.guesses = 0;
        this.playerName = "Player";
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        HangmanPlayer.playerName = playerName;
    }

    public static int getGuesses() {
        return guesses;
    }

    public static void setGuesses(int guesses) {
        HangmanPlayer.guesses = guesses;
    }
    
    public static void incrementGuesses(){
        HangmanPlayer.guesses = (HangmanPlayer.guesses + 1);
    }
    public static void resetGuesses(){
        HangmanPlayer.guesses = 0;
    }       
     public static String addNumberToGuesses(int numberToAdd){
        if (numberToAdd > 0){// if statement checking to make sure number to add greater than zero
        int step1 = HangmanPlayer.guesses + numberToAdd;// adding number to score and storing it in step 1 primitive variable 
        int step2 = step1 + 0;// adding zero to step 1 to fullfill assignment requirement
        HangmanPlayer.guesses = step2;// saving step 2 in score number
        return "guess = " + HangmanPlayer.guesses + "\n";// returning score in string format
        }
        return "guess Unchanged\n";
     }
    public static void displayPlayerName(){
        System.out.println("\nPlayer Name " + HangmanPlayer.playerName+"\n");//prints out player name
     
    }
    public static void displayGuesses(){
        System.out.println("\nGuesses " + HangmanPlayer.guesses+"\n");
    }
    @Override
    public String toString(){
        String output = "";
        output = HangmanPlayer.playerName;
        output = output.concat(String.valueOf(HangmanPlayer.guesses));
        return output;
    }
}
