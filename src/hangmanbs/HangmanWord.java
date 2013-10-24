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
        for(String guess : this.lettersGuessed){
            System.out.println(guess+"n");//Displays each letter guessed by user.
        }
       
    }
    public void displayWordStatus (){
        for (int i=0;i<this.word.length();i++){//This for loop iterates through each letter of the word
            if (lettersGuessed.contains(Character.toString(this.word.charAt(i)))){//This checks to see if the user guessed a correct letter
                System.out.printf("%c", this.word.charAt(i));//Letter appears if correct
            }
            else{
                System.out.printf(" ");//Nothing print out if incorrect
            }
        }
        
        System.out.println();
        
        for (int i=0;i<this.word.length();i++){//This for loop iterates throught each letter of the word
            System.out.printf("-");//This prints out how many letters are in the word
        }
    }
    }
