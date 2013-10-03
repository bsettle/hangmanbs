/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

/**
 *
 * @author rebeccasettle
 */
public class HangmanPlayer {
    String playerName;
    Number guesses = 0;
    
    public void displayPlayerName(){
        System.out.println("\nPlayer Name " + this.playerName+"\n");
     
    }
    public void displayGuesses(){
        System.out.println("\nGuesses " + this.guesses+"\n");
    }
    
}
