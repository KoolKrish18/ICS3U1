/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package krish.assignment15;
import java.util.Scanner;

/**
 *
 * @author nalam
 */
public class KrishAssignment15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner (System.in); //initializes scanner for keyed Inputs 	 
        
        int [ ] numbers = new int [20]; // initializes blank integer array and sets array to store up to 20 values
        int total = 0; // initalizes integer total and sets it to 0
        
        System.out.println("Enter twenty integers:"); //prints "Enter twenty integers"
        
        for (int i = 0; i <= 19; i = i + 1){
             numbers[i] = keyedInput.nextInt(); //takes keyed input and stores it in the array based on how many times the loop has ran
        }
        //sets variable to 0, adds 1 each time, runs untill variable is equal to 19 (20 times because it starts on 0)
      
        
        for (int i = 0; i <= 19; i = i + 1){
             total = total + numbers[i]; // keeps adding next number to total
        }   	 
        //sets variable to 0, adds 1 each time, runs untill variable is equal to 19 (20 times because it starts on 0)

        System.out.println("The sum of those numbers is:\n" + total); //prints The sum

    }
    
}
