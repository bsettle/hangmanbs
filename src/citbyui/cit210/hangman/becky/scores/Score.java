/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.becky.scores;

/**
 *
 * @author rebeccasettle
 */
public abstract class Score {//This is like a score board
    private int currentScore = 0;

    public Score() {
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
public abstract void displayScore();  
public void incrementScore(){
    ++this.currentScore;
} 
public void decrementScore(){
    --this.currentScore;
}
}

