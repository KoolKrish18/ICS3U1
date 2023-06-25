/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment16;
import java.util.Scanner;

/**
 *
 * @author nalam
 */
public class KrishAssignment16 {

    static void inst(){
        System.out.println("Welcome to Krish's Kool Matching Game!! \n\nInstrutions: \n1.Enter any character except e to start playing \n2. Use the following grid to pick a coordinate for the card(0) you want to flip over. \n    - Please enter the coordinate with letter first than a number(i.e a1, b2, c3) \n3. The card you picked will flip over and will have a white number; You will than pick more cards to flip using the coordinate method \n4.The goal of the game is to flip as many cards as possible without getting the same card as your first pick (the white text) \n\nPlay with friends and see who can get the highest score or Play by yourself and try to beat your own score!! \nHave fun!! :) \n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
    //method to print out instructions 
    
    static void display(String line, String[] menu){ //method that takes in a blank string and an array
        final int SQUARE2 = 8;  //declares constant and sets permenantly to 8
        line = "\u001B[40m" + " -  a  b  c  d  e  f  g  h " + "\u001B[0m"; //sets variable to the abc grid indicator line in plain text
        for (int i = 0; i < SQUARE2; i++){ //for loop for columns
            line = line + "\u001B[40m" + "\n " + (i+1) + " " +"\u001B[0m"; //writes the first blank 123 grid indicator and presses enter
            for (int j = 0; j < SQUARE2; j++){ //for loop for rows
                line = line + menu[j+(i*SQUARE2)]; //adds text formatted array value into indicated row in string line
            }
        }
        System.out.print(line + "\n"); //prints the array values as a string line (grid)
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner (System.in); //initializes scanner for keyed Inputs 
        
        final int SQUARE = 8; //declares constant and sets permenantly to 8
        final int CUBE = 64; //declares constant and sets permenantly to 64
        
        String [] menu = new String [CUBE]; //initializes array 0 card with 64 values
        String [] menu2 = new String [CUBE]; //initializes array solutions with 64 values
        String [] menu3 = new String [CUBE];//initializes array transformer with 64 values
        String line = ""; //initializes variable line (later stores all value of array to print)
        //String line2 = "";
        

        
        final String YELLOW = "\u001B[43m" + " 1 " + "\u001B[0m";
        final String RED = "\u001B[41m" + " 2 " + "\u001B[0m";
        final String GREEN = "\u001B[42m" + " 3 " + "\u001B[0m";
        final String BLUE = "\u001B[46m" + " 4 " + "\u001B[0m";
        //all final constants that are peremenantly set to one colour/number card (later used to randomly generate in array)

        
        final String DEFAULT = "\u001B[47m" + " 0 "; //final constant for back of card (0 card)
        
        String choice = ""; //initializes string that will later take in input for card 1
        String choice2 = "";//initializes string that will later take in input for card 2

        int num; //initializes integer num
        
        String column = " a"; //initializes variable column and sets to " a"
                    
        int acc = 0; //initializes integer acc and sets to 0
        int acc2 = 0;//initializes integer acc2 and sets to 0
        
        String game; //initializes variable game
        int score = 0;//initializes integer score and sets to 0
        int best = 0;//initializes integer best and sets to 0
        
        inst(); //uses method to print instructions
        
        for (int k = 0; k < SQUARE; k++){ //starts a for loop that loops 8 times
            for (int l = 0; l < SQUARE; l++){ //starts a for loop that loops 8 times
                menu3[k+(l*SQUARE)] = column + (l+1); //resets each value in array to a letter plus a number
            }
            switch(k){
                case 0:
                    column = " b";
                    break;
                case 1:
                    column = " c";
                    break;
                case 2:
                    column = " d";
                    break;
                case 3:
                    column = " e";
                    break;
                case 4:
                    column = " f";
                    break;
                case 5:
                    column = " g";
                    break;
                case 6:
                    column = " h";
                    break;
            //switch statement to set a number to each value in array
            }
        }
        game = keyedInput.next(); //takes input for what user wants to do (exit or play)
        while((game.equalsIgnoreCase("e")) == false){ //runs while loop until user wants to press e to exit 
            
            score = 0; //sets score to 0
            
            for (int k = 0; k < CUBE; k++) {
                menu[k] = DEFAULT;
            }
            //for loop above sets all values in array 1 to default card (0 card)

            for (int k = 0; k < CUBE; k++) { //for loop to set solutions 
               num = (int)Math.round(Math.random()*3+1); //generates a random number 
               switch(num){
                   case 1:
                       menu2[k] = YELLOW;
                       break;
                   case 2:
                       menu2[k] = RED;
                       break;
                   case 3:
                       menu2[k] = GREEN;
                       break;
                   case 4:
                       menu2[k] = BLUE;
                       break;                   
               }
               //based on which number is generated sets value to one of the possible cards (YELLOW, RED, GREEN, BLUE)
            }


                display(line, menu); //calls method to display the array for main array            
                //display(line2, menu2);


                System.out.println("\nPlease use the coordinate method appropriately(i.e a8, h7, g5) to pick a card to flip over(0)"); //gives instruction on what to enter
                choice = keyedInput.next(); //takes in input for grid picker


                choice = " " + choice; //formats choice to be used (matches value in array)
                for (int q = 0; q < CUBE; q++){ //for loop that checks every value in array
                    if (choice.equals(menu3[q])){
                        acc = q; //records which value in array matches user input
                    break;
                    //stops loop and once users value is identified in array
                    }
                }
                menu[acc] = menu2[acc]; //flips over 0 card and sets to solution card using the recorded value            
                menu[acc] = "\u001B[4;37m" + menu[acc] + "\u001B[0m";
                display(line, menu);
                

                do{
                    System.out.println("\nPlease use the coordinate method appropriately(i.e a8, h7, g5) to pick a card to flip over(0)");//gives instruction on what to enter

                    choice2 = keyedInput.next();//takes in input for grid picker            
                    choice2 = " " + choice2;//formats choice to be used (matches value in array)
                    for (int w = 0; w < CUBE; w++){//for loop that checks every value in array
                        if (choice2.equals(menu3[w])){
                            acc2 = w;//records which value in array matches user input
                            break;
                            //stops loop and once users value is identified in array
                        }
                    }            

                    menu[acc2] = menu2[acc2];//flips over 0 card and sets to solution card using the recorded value
                    display(line, menu); //calls method to display the array for main array  
                    score++; //adds one to score
                    if (score > best){ //checks if current score is higher than best score
                        best = score; //sests best score to current score
                    }
                }while(((menu2[acc]).equals(menu2[acc2])) == false); //do while loop checking when to stop code (if user guess equals original guess)

                System.out.println("\nCurrent Score:    " + score); //prints current score
                System.out.println("Highest Score:    " + best); //prints best score 
                System.out.println("\nTo exit enter E, For instructions again enter R, To play again enter any other key:"); //prints instruction on what user needs to input to play game
                game = keyedInput.next();//takes input for what user wants to do (exit or play)
                if (game.equalsIgnoreCase("r")){ //if user asks for instructions again
                    inst();//uses method to print instructions
                }

            }
        
        
    }
    
}
