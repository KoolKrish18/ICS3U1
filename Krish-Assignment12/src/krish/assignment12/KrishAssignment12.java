/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package krish.assignment12;

import java.util.Scanner;

/**
 *
 * @author S300095291
 */
public class KrishAssignment12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in); //Initializing keyed Input
        
        String choice; //Initializing variable choice
        
        System.out.println("---Krish's Cool Counting Program---\n"); //Prints Title
        
        System.out.println("A... Count from 0 to 14 by 2"); 
        System.out.println("B... Count from 170 to 0 by 17");
        System.out.println("C... Count from 95 to 125 by 5");
        System.out.println("D... Count from 8800 to 0 by 800");
        //Gives user all choices to count
        
        System.out.println("Please enter your choice:\n"); //Asks user to enter their choice
       
        choice = keyedInput.next(); //Gets input from user
        
        System.out.println("\n------------------------------------------------------------------------"); //Prints seperator
        
        if (choice.equalsIgnoreCase("a")){ //Checks for option A or a
            System.out.println("You have chosen to count 0 to 14 by 2"); //Re-tells user what they picked
            for (int i = 0; i <= 14; i = i + 2){ //Starts for loop for the counting pattern
                System.out.println(i); //prints the number value 
            }
        }
        
        else if (choice.equalsIgnoreCase("b")){ //Checks for option B or b
            System.out.println("You have chosen to count 170 to 0 by 17"); //Re-tells user what they picked
            for (int j = 170; j > 0; j = j - 17){ //Starts for loop for the counting pattern
                System.out.println(j); //prints the number value 
            }
        }
        
        else if (choice.equalsIgnoreCase("c")){ //Checks for option C or c
            System.out.println("You have chosen to count 95 to 125 by 5"); //Re-tells user what they picked
            for (int k = 95; k > 125; k = k + 5){ //Starts for loop for the counting pattern
                System.out.println(k); //prints the number value 
            }
        }
        
        else if (choice.equalsIgnoreCase("d")) { //Checks for option D or d
            System.out.println("You have chosen to count 8800 to 0 by 800"); //Re-tells user what they picked
            for (int l = 8800; l > 0; l = 1 - 800) { //Starts for loop for the counting pattern
                System.out.println(l); //prints the number value 
            }
        }
        
        System.out.println("------------------------------------------------------------------------"); //Prints seperator
    }
    
}
