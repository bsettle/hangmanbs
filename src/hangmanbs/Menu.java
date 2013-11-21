/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

/**
 *
 * @author rebeccasettle
 */
public abstract class Menu {
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
    protected final void display (){
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
    
}
