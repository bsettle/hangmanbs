/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.becky.scores;

/**
 *
 * @author rebeccasettle
 */
public class PlayerScore extends Score implements ScoreOperations {// This displays the players score
    private static int currentScore = 0;

    public PlayerScore() {
    }
    @Override
    public void displayScore(){
        System.out.println("Player score is" + super.getCurrentScore());
    }  

    @Override
    public void addScoreToCurrentScore(int scoretoadd) {
        PlayerScore.currentScore += scoretoadd;
    }
    
}
        
