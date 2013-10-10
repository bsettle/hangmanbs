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
    private String word = "word";
    private ArrayList <String> lettersGuessed = new ArrayList <>();
    
    public void displayWord(){
        System.out.println("\nWord " + this.word+"\n");
     
    }
    public void setWord (String word){
        this.word = word;
    }
    public String getWord(){
        return this.word;
    }
    public boolean isLetterInWord(String letter){
        String lowerCaseLetter = letter.toLowerCase();
        String word = this.word.toLowerCase();
        return word.contains(lowerCaseLetter);
    }
    
   
    public void displayLettersGuessed(){
        System.out.println("\nLetters Guessed " + this.lettersGuessed+"\n");
    }
    }
