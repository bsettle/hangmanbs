/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.becky.scores;

import citbyui.cit210.hangman.becky.scores.Score;

/**
 *
 * @author rebeccasettle
 */
public class Guesses extends Score implements ScoreOperations {//This displays a score related to the players guesses
     private static int currentScore = 0;

    public Guesses() {
    }
    @Override
    public void displayScore(){
        System.out.println("Number of guesses is " + super.getCurrentScore());
    }  

    @Override
    public void addScoreToCurrentScore(int scoretoadd) {
        Guesses.currentScore += scoretoadd;
    }
    
    
}
