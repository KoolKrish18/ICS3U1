/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment6;

import java.text.DecimalFormat; //Imports decimal rounding function
import java.util.Scanner; //Imports scanner to take input

/**
 *
 * @author S300095291
 */
public class KrishAssignment6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.00"); //sets function df to round 2 decimal places
        DecimalFormat pf = new DecimalFormat("#"); //sets function pf to round to a whole number
        
        Scanner keyedInput = new Scanner(System.in); //initializes keyedInput
        
        final double DISCOUNT1 = 0.15;//initializes the discount and sets the percent
        final double DISCOUNT2 = 0.20;//initializes the discount and sets the percent
        final double DISCOUNT3 = 0.25;//initializes the discount and sets the percent
        final double DISCOUNT4 = 0.35;//initializes the discount and sets the percent
        
        final double FIELD1 = 50.00;//initializes price range and sets the maximum
        final double FIELD2 = 90.00;//initializes price range and sets the maximum
        final double FIELD3 = 130.00;//initializes price range and sets the maximum
        
        System.out.println("Welcome to Krish's Fruit Mart! Today is Fruit Sale Day! \n"
                + "Please enter the money you spent at the store to see if you are eligible for a discount:");//prints a welcome message and promts user to input
        
        double amount = keyedInput.nextDouble(); //takes the imput and stores it in the initialized variable amount
        
        System.out.println("\nYou spent $" + df.format(amount));//prints amount spend
        
        if (amount == 0) //checks if amount is 0
        {
            System.out.println("\nPlease enter a valid amount above $0"); //asks user to re-enter amount as 0 is not in the range 
        }
      
        else if  (amount <= FIELD1) //checks if amount is in first price range
        {    
            
            System.out.println("You are eligible to save " + pf.format(DISCOUNT1*100) + "%"); //prints discount percent
            System.out.println("You save $" + df.format(DISCOUNT1*amount));//calculates and prints how much is saved
            System.out. println("\nFinal Price:       $" + df.format(amount-(DISCOUNT1*amount)));//calculates and prints final price
        }  
        
        else if (amount <= FIELD2)//checks if amount is in second price range
        {
            System.out.println("You are eligible to save " + pf.format(DISCOUNT2*100) + "%");//prints discount percent
            System.out.println("You save $" + df.format(DISCOUNT2*amount));//calculates and prints how much is saved
            System.out. println("\nFinal Price:       $" + df.format(amount-(DISCOUNT2*amount)));//calculates and prints final price
        }
        
        else if (amount <= FIELD3)//checks if amount is in third price range
        {
            System.out.println("You are eligible to save " + pf.format(DISCOUNT3*100) + "%");//prints discount percent
            System.out.println("You save $" + df.format(DISCOUNT3*amount));//calculates and prints how much is saved
            System.out. println("\nFinal Price:       $" + df.format(amount-(DISCOUNT3*amount)));//calculates and prints final price
        }
        
        else if (amount > FIELD3)//checks if amount is above all price ranges
        {
            System.out.println("You are eligible to save " + pf.format(DISCOUNT4*100) + "%");//prints discount percent
            System.out.println("You save $" + df.format(DISCOUNT4*amount));//calculates and prints how much is saved
            System.out. println("\nFinal Price:       $" + df.format(amount-(DISCOUNT4*amount)));//calculates and prints final price
        }     
        
        
        // TODO code application logic here
    }
    
}
