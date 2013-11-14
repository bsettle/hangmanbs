/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rebeccasettle
 */
public class HangmanWord implements Serializable{
    private static String word = "word";
    private static ArrayList <String> lettersGuessed = new ArrayList <>();
    private static String[] anArray = {"Hello", "Java", "BYUI"};

    public static String[] getAnArray() {
        return anArray;
    }

    public static void setAnArray(String[] anArray) {
        HangmanWord.anArray = anArray;
    }
    
    
    public static void displayWord(){
        System.out.println("\nWord " + HangmanWord.word+"\n");
     
    }

    public static String getWord() {
        return word;
    }

    public static void setWord(String word) {
        HangmanWord.word = word;
    }

    public static ArrayList<String> getLettersGuessed() {
        return lettersGuessed;
    }

    public static void setLettersGuessed(ArrayList<String> lettersGuessed) {
        HangmanWord.lettersGuessed = lettersGuessed;
    }

    public HangmanWord() {
    }
    public static void setRandomWord(){
        Random rand = new Random();
        setWord(HangmanWord.anArray[rand.nextInt()%HangmanWord.anArray.length]);//Randomly chooses a word from our set array of words and sets it as the word to play with.
    }
    public static boolean isLetterInWord(String letter){
        String lowerCaseLetter = letter.toLowerCase();
        String myWord;
        myWord = HangmanWord.word.toLowerCase();
        return myWord.contains(lowerCaseLetter);
    }
    
   
    public static void displayLettersGuessed(){
        for(String guess : HangmanWord.lettersGuessed){
            System.out.println(guess+"n");//Displays each letter guessed by user.
        }
       
    }
    public static void displayWordStatus (){
        for (int i=0;i<HangmanWord.word.length();i++){//This for loop iterates through each letter of the word
            if (lettersGuessed.contains(Character.toString(HangmanWord.word.charAt(i)))){//This checks to see if the user guessed a correct letter
                System.out.printf("%c", HangmanWord.word.charAt(i));//Letter appears if correct
            }
            else{
                System.out.printf(" ");//Nothing print out if incorrect
            }
        }
        
        System.out.println();
        
        for (int i=0;i<HangmanWord.word.length();i++){//This for loop iterates throught each letter of the word
            System.out.printf("-");//This prints out how many letters are in the word
        }
    }
    @Override
    public String toString(){
        String output = "";
    output = HangmanWord.word;
    for(String guess : HangmanWord.lettersGuessed){
           output = output.concat(guess);   
    }
    return output;
    }
    }
