/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

/**
 *
 * @author rebeccasettle
 */
public enum Status {
    NEW_GAME ("NEW_GAME"),
    IN_PROGRESS ("IN_PROGRESS"),
    GAME_OVER ("GAME_OVER"),
    QUIT ("QUIT"),
    ERROR ("ERROR"),
    INSTRUCTIONS ("INSTRUCTIONS"),
    MENU ("MENU"),
    HELP ("HELP"),
    STATS ("STATS");
    
    String value;
    
    Status(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
}