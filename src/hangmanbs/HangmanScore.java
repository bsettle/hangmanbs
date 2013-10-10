/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import java.io.Serializable;

/**
 *
 * @author Calvin
 */
public class HangmanScore implements Serializable{
    
    private String scoreString;
    private int scoreNumber = 0;

    public HangmanScore(String score) {
        this.scoreString = score;
    }

    public String getScore() {// this allows other classes to access private variables
        return scoreString;
    }
    public void setScoreNumber (int newScore){// this allows other classes to set private variables
        this.scoreNumber = newScore;
    }
    
    public int getScoreNumber (){
        return this.scoreNumber;
    }
    public void resetScoreNumber(){
        this.scoreNumber = 0;
    }
    public String addNumberToScore(int numberToAdd){
        if (numberToAdd > 0){// if statement checking to make sure number to add greater than zero
        int step1 = this.scoreNumber + numberToAdd;// adding number to score and storing it in step 1 primitive variable 
        int step2 = step1 + 0;// adding zero to step 1 to fullfill assignment requirement
        this.scoreNumber = step2;// saving step 2 in score number
        return "score = " + this.scoreNumber + "\n";// returning score in string format
        }
        return "score Unchanged\n";
        
    }
    public boolean isScoreEqualTo (int number){// this will check to see if the score is equal to number
        if (this.scoreNumber == number){
            return true;
        }
        return false;
    }
    public void setScore(String score) {
        this.scoreString = score;
    }
    
    
    
}
