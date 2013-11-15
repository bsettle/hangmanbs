/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbs;

import java.io.Serializable;

/**
 *
 * @author rebeccasettle
 */
public class ClassAssignments implements Serializable {
    private static int[] anArray = { 2, 50, 490, 5, 16, 49, 34, 22, 80, 1883};
    private static int[][] multiDimensionalArray = { {0, 0, 0, 0, 0},
                    {0, 1, 2, 3, 4},
                    {0, 2, 4, 6, 8},
                    {0, 3, 6, 9, 12},
                    {0, 4, 8, 12, 16} };

    public ClassAssignments() {
    }

    public static int[] getAnArray() {
        return anArray;
    }

    public static void setAnArray(int[] anArray) {
        ClassAssignments.anArray = anArray;
    }

    public static int[][] getMultiDimensionalArray() {
        return multiDimensionalArray;
    }

    public static void setMultiDimensionalArray(int[][] multiDimensionalArray) {
        ClassAssignments.multiDimensionalArray = multiDimensionalArray;
    }
    

    public static void printMultiArray(){
    for (int column=0; column<5; column++){//This loop iterates through the columns of the 2 dimensional array
        for (int row=0; row<5; row++){//This loop iterates through the rows of the 2 dimensional array
        System.out.println(multiDimensionalArray[row][column]);//prints out the element of the 2 dimensional array    
        }   
    }
}
    public static void sortArray(){
        for (int a=1; a < anArray.length; a++)//iterates through all the elements
            for (int b =anArray.length-1; b >= a; b--){//places the elements where they belong
                if (anArray[b-1] > anArray[b]){//swaps the elememts positions
                   int t = anArray[b-1];//holds element
                   anArray[b-1] = anArray[b];//moves element
                   anArray[b] = t;//re-places element
                   
                }
            }
    }
    
    public static void sumArray(){
        int sum=0;
        for(int element : ClassAssignments.anArray){//Iterates through the array without specifing an index
            sum = sum+element;//sums up the elements
        }
        System.out.println("Sum equals " + sum);
    }
    
public static void printArray(){
    for (int i=0; i<anArray.length; i++){//This iterates through all the elements in an array
        System.out.println(anArray[i]);//prints out the element at the specific index of the array
    }
}
    @Override
    public String toString(){
        String output = "";
        
    for (int i=0; i<anArray.length; i++){ //This iterates through all the elements in an array
            output = output.concat(String.valueOf (anArray[i]));
       
    }
    for (int column=0; column<5; column++){//This loop iterates through the columns of the 2 dimensional array
        for (int row=0; row<5; row++){//This loop iterates through the rows of the 2 dimensional array
            output = output.concat(String.valueOf (multiDimensionalArray[row][column]));
           
        }   
    }
    return output;
}
    
}
