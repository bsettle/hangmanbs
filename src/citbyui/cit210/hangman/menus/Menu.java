/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.menus;

import citbyui.cit210.hangman.exceptions.MenuException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rebeccasettle
 */
public abstract class Menu implements DisplayInfo, EnterInfo {
    private String [][] menuItems = null;
    public Menu(){}
    public Menu (String [][] menuItems){
        this.menuItems = menuItems;
    }
    public String [][] getMenuItems(){
        return this.menuItems;
    }
    public void setMenuItems (String [][] menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public final void display (){
        for (int row=0; row<this.menuItems.length; row++){
            System.out.println(this.menuItems[row][0]+"\t"+this.menuItems[row][1]);
        }
    }
    private boolean validComand(String command) throws MenuException {
        for (int row=0; row<this.menuItems.length; row++){
            if (command.equals(this.menuItems[row][0]))
                return true;
        }
        throw new MenuException("Invalid command");
        //return false;
    }
    protected final String getCommand(String command) throws MenuException{
        for (int row=0; row<this.menuItems.length; row++){
            if (command.equals(this.menuItems[row][0]))
                return this.menuItems[row][1];
        }
        throw new MenuException("Command does not exist");
        //return null;
    }
    public abstract String executeCommands();

    @Override
    public void getInput() {
        Scanner input = new Scanner(System.in);// Scanner will get new input form the user
        try {
            System.out.println(getCommand(input.next()));
        } catch (MenuException ex) {
            System.out.println("re-enter the menu selection");
           
        }
        
    }
    protected final String getCommandAtIndex(int index) throws NumberFormatException {//This is to fulfill the Lesson 11 #4 assignment.
        if (index >= 0 && index <this.menuItems.length)
            return this.menuItems[index][1];
        throw new NumberFormatException ("Command does not exist");
          
    }
    public final String getFirstCommand () throws MenuException {//This is to fulfill the Lesson 11 #4 assignment.
        try{
            return getCommandAtIndex (-1);
            
        } catch(NumberFormatException ex){
            throw new MenuException(ex.getMessage());
        }
    }
    
}
