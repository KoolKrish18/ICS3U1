/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishassignment22;

import java.util.Scanner;

/**
 *
 * @author S300095291
 */
public class KrishAssignment22 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in); //Create a scanner object to read user input.
        String enter; //string variable for user input
        int enter2; //Initializes an integer variable
        boolean valid = false; //Initialize a boolean flag as false.
        
        
        do{
            System.out.println("Please enter a string that is greater than 6 charactes long:"); //prints instructions
            enter = keyedInput.nextLine(); //gets input from user
            if ((enter.length()) <= 6){ //check if string is greater than 6 or not
                System.out.println("The string entered does not meet the criteria of the requested string. Please Try Again. \n"); //prints try again message
            }
        }while((enter.length()) <= 6); //Repeat until the entered string length is greater than 6.
        
        enter = ""; //Reset the value of variable enter
        System.out.println("Congratulations!! You managed to get through the first stage!. \n"); //prints congratulatory message
        
        
        
        do{
            System.out.println("Please enter a string that contains at least one lowercase letter 'a':"); //prints instructions
            enter = keyedInput.nextLine();//gets input from user
            if ((enter.contains("a") != true)){ //check if string is contains a or not
                System.out.println("The string entered does not meet the criteria of the requested string. Please Try Again. \n");//prints try again message
            }
        }while((enter.contains("a") != true)); //runs loop untill string contains a
        
        enter = ""; //Reset the value of variable enter
        System.out.println("Congratulations!! You managed to get through the second stage!.\n");//prints congratulatory message

        
        
        do{
            System.out.println("Please enter a string that is between 5 and 15 characters long, and does not contain the letter 'z':"); //prints instructions
            enter = keyedInput.nextLine();//gets input from user
            if (((enter.length()) < 5) || ((enter.length()) > 15) || (enter.contains("z") == true)){ //check if string is between 5 and 15 characters long, and does not contain z
                System.out.println("The string entered does not meet the criteria of the requested string. Please Try Again.\n");//prints try again message
            }
        }while(((enter.length()) < 5) || ((enter.length()) > 15) || (enter.contains("z") == true));//runs loop if string is not between 5 and 15 characters long, and contain z
        
        enter = ""; //Reset the value of variable enter
        System.out.println("Congratulations!! You managed to get through the third stage!.\n");//prints congratulatory message
        
        
        
        while(valid == false){
            System.out.println("Please enter an integer between 5 and 500:"); //prints instructions
            enter = keyedInput.nextLine();//gets input from user
            try{
                enter2 = Integer.parseInt(enter); //try to change string value into integer
                valid = ((enter2 <= 500) && (enter2 >= 5)); //if successful checks if it is inbetween 5 and 500
                if (valid == false) //if not
                    System.out.println("Sorry, that is not a valid Input. Please Try Again.\n");//prints try again message
            }
            catch (NumberFormatException e){ //if cannot be converted to integer (catch)
                System.out.println("Sorry, that is not a valid Input. Please Try Again.\n");//prints try again message

            }
        }
        
        enter = ""; //Reset the value of variable enter
        valid = false;//Reset the value of variable valid
        System.out.println("Congratulations!! You managed to get through the fourth stage!.\n");//prints congratulatory message
        
        
        
        while(valid == false){
            System.out.println("Please enter a negative integer:"); //prints instructions
            enter = keyedInput.nextLine();//gets input from user
            try{
                enter2 = Integer.parseInt(enter);//try to change string value into integer
                valid = (enter2 < 0); //if successful checks if it is under 0 (negative)
                if (valid == false)//if not
                    System.out.println("Sorry, that is not a valid Input. Please Try Again.\n");//prints try again message
            }
            catch (NumberFormatException e){//if cannot be converted to integer (catch)
                System.out.println("Sorry, that is not a valid Input. Please Try Again.\n");//prints try again message

            }
        }
        
        enter = ""; //Reset the value of variable enter
        valid = false;//Reset the value of variable valid
        System.out.println("Congratulations!! You managed to get through the fifth stage!.\n");//prints congratulatory message
        
        
        
        while(valid == false){
            System.out.println("Please enter a positive odd integer:"); //prints instructions
            enter = keyedInput.nextLine();//gets input from user
            try{
                enter2 = Integer.parseInt(enter);//try to change string value into integer
                valid = ((enter2 > 0) && (enter2 % 2 == 1)); //if successful checks if it is above 0 (positive) and if its odd (modulus)
                if (valid == false)//if not
                    System.out.println("Sorry, that is not a valid Input. Please Try Again.\n");//prints try again message
            }
            catch (NumberFormatException e){//if cannot be converted to integer (catch)
                System.out.println("Sorry, that is not a valid Input. Please Try Again.\n");//prints try again message

            }
        }
        
        System.out.println("Congratulations!! You managed to get through the last stage!.\n");//prints congratulatory message
        
        
        System.out.println("Congratulations!! YOU PASSED!!\n");//prints final congratulatory message

        
                
    }
    
}
