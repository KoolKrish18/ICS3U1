/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment15.pkg2;
import java.util.Scanner;
/**
 *
 * @author nalam
 */
public class KrishAssignment152 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner (System.in); //initializes scanner for keyed Inputs 	 
        
        String [ ] friends = new String [5]; // initializes blank string array and sets array to store up to 5 values
        
        System.out.println("Enter the names of five friends:"); //prints "Enter name of five friends:"
        
        for (int i = 0; i <= 4; i = i + 1){ 
            friends[i] = keyedInput.next(); //stores each name inputted based on the loop number in array 
        }    	  
        //sets variable to 0, adds 1 each time, runs untill variable is equal to 4 (9 times because it starts on 0)

        
        System.out.println("The second, third, and fourth names were:"); //prints "The second, third and fourth names were:"
        System.out.println("Second: " + friends[1]); 
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]);
        //prints which name and than prints the indexes of the specific names from the array 
        
   

    }
    
}
