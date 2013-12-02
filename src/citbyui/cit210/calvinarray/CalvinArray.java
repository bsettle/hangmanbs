/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit210.calvinarray;

/**
 *
 * @author Calvin
 */
public class CalvinArray {
    
    public static void arrayAssignment(){
            int myArray [][]={{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 11, 12}};
    int myArray2[][]={{13, 12, 13, 12, 13, 12},{1, 9, 5, 100},{8, 7, 6, 5, 4,3, 2, 1}};
    System.out.println("This is the 1st array");
    show(myArray);
    System.out.println("This is the 2nd array");
    show(myArray2);
    }
    public static void show(int x[][]){
        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++){
                System.out.print(x[row][column] +"\t");
            }
            System.out.println();
    }
}
}
