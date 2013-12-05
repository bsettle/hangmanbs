/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.miscellaneous;

/**
 *
 * @author rebeccasettle
 */
public class GuessesException extends Exception{
    public GuessesException(){
    }
    public GuessesException(String message){
        super (message);
    }
    public GuessesException(String message, Throwable cause){
        super (message, cause);
    }
    public GuessesException(Throwable cause){
        super (cause);
    }
    
}
