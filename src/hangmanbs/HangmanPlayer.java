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
    private String playerName;//instance variable
    private int guesses;//instance variable

    public HangmanPlayer() {
        this.guesses = 0;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public void setGuesses(int guesses){
        this.guesses = guesses;
    }
    
    public String getPlayerName (){
        return this.playerName;
    }
    public int getGuesses (){
        return this.guesses;
    }
    public void incrementGuesses(){
        this.guesses = (this.guesses + 1);
    }
    public void resetGuesses(){
        this.guesses = 0;
    }       
     public String addNumberToGuesses(int numberToAdd){
        if (numberToAdd > 0){// if statement checking to make sure number to add greater than zero
        int step1 = this.guesses + numberToAdd;// adding number to score and storing it in step 1 primitive variable 
        int step2 = step1 + 0;// adding zero to step 1 to fullfill assignment requirement
        this.guesses = step2;// saving step 2 in score number
        return "guess = " + this.guesses + "\n";// returning score in string format
        }
        return "guess Unchanged\n";
     }
    public void displayPlayerName(){
        System.out.println("\nPlayer Name " + this.playerName+"\n");//prints out player name
     
    }
    public void displayGuesses(){
        System.out.println("\nGuesses " + this.guesses+"\n");
    }
    
}
