/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.hangman.menus;

import java.util.Scanner;

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
    private boolean validComand(String command){
        for (int row=0; row<this.menuItems.length; row++){
            if (command.equals(this.menuItems[row][0]))
                return true;
        }
        return false;
    }
    protected final String getCommand(String command){
        for (int row=0; row<this.menuItems.length; row++){
            if (command.equals(this.menuItems[row][0]))
                return this.menuItems[row][1];
        }
        return null;
    }
    public abstract String executeCommands();

    @Override
    public void getInput() {
        Scanner input = new Scanner(System.in);// Scanner will get new input form the user
        System.out.println(getCommand(input.next()));
        
    }
    
}
