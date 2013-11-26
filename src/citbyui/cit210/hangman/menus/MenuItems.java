/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.menus;

/**
 *
 * @author rebeccasettle
 */
public enum MenuItems {
    START_GAME ("START_GAME"),
    SELECT_WORD ("SELECT_WORD"),
    TRY_AGAIN ("TRY_AGAIN"),
    END_GAME ("END_GAME"),
    INSTRUCTIONS ("INSTRUCTIONS"),
    AUTHORS ("AUTHORS"),
    LEAVE ("LEAVE"),
    GO_BACK ("GO_BACK"),
    QUIT ("QUIT"),
    ONE_PLAYER_GAME ("ONE_PLAYER_GAME"),
    TWO_PLAYER_GAME ("TWO_PLAYER_GAME"),
    HELP ("HELP"),
    PREFERENCES ("PREFERENCES"),
    MENU ("MENU");
    
    String value;
    
    MenuItems (String value) {
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
   
    
}
