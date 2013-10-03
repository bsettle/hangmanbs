/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import java.util.ArrayList;

/**
 *
 * @author rebeccasettle
 */
public class HangmanWord {
    String word = "word";
    ArrayList <String> lettersGuessed = new ArrayList <>();
    
    public void displayWord(){
        System.out.println("\nWord " + this.word+"\n");
     
    }
    public void displayLettersGuessed(){
        System.out.println("\nLetters Guessed " + this.lettersGuessed+"\n");
    }
    }
