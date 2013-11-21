/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

/**
 *
 * @author rebeccasettle
 */
public class Guesses extends Score {//This displays a score related to the players guesses
     private final static int currentScore = 0;

    public Guesses() {
    }
    @Override
    public void displayScore(){
        System.out.println("Number of guesses is " + super.getCurrentScore());
    }  
    
    
}
