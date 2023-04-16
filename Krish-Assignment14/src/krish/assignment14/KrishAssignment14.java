/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment14;

import java.util.Scanner; //imports Scanner

/**
 *
 * @author S300095291
 */
public class KrishAssignment14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in); //Initializing keyed Input
        
        int base; //initializes base number (number user wants to use)
        int acc; //initializes storage for base number so the value doesnt change
        int expo; //initializes expo; only used when user picks option 3
        int choice = 0; //initializes strage for which option user picks
                
        while (choice != 4) { //runs while loop repating untill user presses option 4 exiting the program
            
            System.out.println("---Krish's Exceptional Exponent Program---\n"); //Prints Title
        
            System.out.println("Option 1: Find the value of a number squared"); 
            System.out.println("Option 2: Find the value of a number cubed");
            System.out.println("Option 3: Find the value of a number, to any power");
            System.out.println("Option 4: Exit");
            //Gives user all choices to count
            
            System.out.println("\nPlease enter the option number for your choice:"); //Asks user to enter their choice
            
            choice = keyedInput.nextInt(); //gets input option chosen from user
                                   
            switch (choice){ //switch statement to check which case the user chose
                
                case 1: //option 1 chosen 
                    System.out.println("Please enter the number you want to use:"); //Asks user to enter their choice
                    base = keyedInput.nextInt(); //stores number based on input from user 
                    acc = base; //stores original number user inputted to multiply by 
                    
                    for (int i = 0; i < 1; i++){ //loops through 1 time to square the given number
                        base = base*acc; // keeps multiplying by orginal input number and stores in base 
                    }
                    System.out.println("The answer is " + base); //outputs answer
                    break;
                
                    
                case 2: //option 2 chosen
                    System.out.println("Please enter the number you want to use:"); //Asks user to enter their choice
                    base = keyedInput.nextInt(); //stores number based on input from user
                    acc = base; //stores original number user inputted to multiply by          
                    
                    for (int j = 0; j < 2; j++){ //loops through 2 times to cube the given number
                        base = base*acc; // keeps multiplying by orginal input number and stores in base 
                    }
                    System.out.println("The answer is " + base); //outputs answer
                    break;
                
                    
                case 3: //option 3 chosen
                    System.out.println("Please enter the number you want to use:"); //Asks user to enter their choice
                    base = keyedInput.nextInt(); //stores number based on input from user
                    acc = base; //stores original number user inputted to multiply by                  
                    
                    System.out.println("Please enter the exponent you want to use:"); //Asks user to enter their choice
                    expo = keyedInput.nextInt(); //stores number based on input from user
                    
                    for (int k = 0; k < (expo-1); k++){ //loops through as many times as the second input expo states 
                       base = base*acc; // keeps multiplying by orginal input number and stores in base 
                    }
                    System.out.println("\nThe answer is " + base); //outputs answer
                    break;
                
                    
                case 4: //option 4 chosen
                    System.out.println("\nBye Bye!! Thank you for using my program!!"); //outputs exit message
                    break;
                
                    
                default: //every other number 
                    System.out.println("\nThat was not a specified input. Please try again."); //tells user to press a valid option as an input
            }            
            System.out.println("\n------------------------------------------------------------------------\n"); //Prints seperator
        }
    }
    
}
