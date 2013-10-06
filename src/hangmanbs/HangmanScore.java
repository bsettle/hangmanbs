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
    
    private String score;
    private Number score = 0;

    public HangmanScore(String score) {
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    
    
}
