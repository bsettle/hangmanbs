/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

/**
 *
 * @author rebeccasettle
 */
public class PlayerScore extends Score {// This displays the players score
    private final static int currentScore = 0;

    public PlayerScore() {
    }
    @Override
    public void displayScore(){
        System.out.println("Player score is" + super.getCurrentScore());
    }  
    
}
