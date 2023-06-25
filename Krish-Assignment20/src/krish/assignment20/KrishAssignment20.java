/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment20;

import java.util.Scanner;

/**
 *
 * @author Krish
 */
public class KrishAssignment20 {
    
    
    /* Inst
        
        This method returns the instruction message
        
        Parameters: none
        
        Returns: String (instructions to play game)
    */
    
    public static String Inst(){
        return ("\n\nWelcome to Krish's Subroutine program!!!" + "Please pick one of the following choices: \n\n1. Calculate volume of a rectangle right pyramid \n2. Calculate factorial \n3. Calculate half life \n4. Calculate slope of a line \n5. Calculate sum of an arithmetic sequence \n6. Exit Program" + "\nEnter your preffered choice:");
        //prints welcome message
        //prints all options 
        //promts user to pick a choice
    }
    
    /* Volume
        
        This method recieves the 3 entered values, calculates the volume of a pyramid (multiples all than divide by 3) and returns the product
        
        Parameters: double, double, double
        
        Returns: double
    */
    
    public static double Volume(double x, double y, double z){ // method that takes in 3 double values 
        double turn = (x*y*z)/3; //calcultes 
        return (turn); //returns value
    }
    
    /* factorial
        
        This method recieves the entered value, calculates the factorial (uses a for loop to multiplethe number by a number less than it untill one less than the final number is 0) and returns it
        
        Parameters: int
        
        Returns: int
    */
    
    public static int factorial(int x){ //method that takes in one integer
        int ansf = 1; //initializes variabel and sets to 1
        for (int i = x; i > 0; i -= 1){
            ansf = ansf*i;
        }
        //for loop to keep calculating number with number-1 untill 0 (calculates factorial)
        return(ansf);//returns value
    }
    
    /* Halfie
        
        This method recieves the 3 entered doubles and used the half life formula to calculate for half life (t*log(2)/log(A/Ao))
        
        Parameters: double, double, double
        
        Returns: double
    */    
    
    public static double Halfie(double x, double y, double z){// method that takes in 3 double values
        double ansh; //initializes answer vairable
        ansh = (z*(Math.log(2)/Math.log(y/x))); //calculates halflife 
        return(ansh);//returns value
    }
    
    /* Slope
        
        This method recieves 2 pairs of doubles each pair representing a x and a y, than it calculates slope based on the assumtion that these values are 2 co-ordinates on one line (formula - y2-y1/x2-x1)
        
        Parameters: double, double, double, double
        
        Returns: double
    */    
    
    public static double Slope(double a, double b, double c, double d){// method that takes in 4 double values
        double anss;//initializes answer vairable
        anss = (d-b)/(c-a);//calciulates slope
        return (anss);//returns value
    }
    
    /* Sequence
        
        This method recieves 3 integers which are used in the sum of a sequence formula (n/2(2a+(n-1)d))
        
        Parameters: int, int, int
        
        Returns: int
    */    
    
    public static double Sequence(int x, int y, int z){// method that takes in 3 integer values
        double ansa;//initializes answer vairable
        ansa = (x/2)*((2*y) + ((x-1)*z)); //calculates sum of arthemetic sequence
        return (ansa);//returns value
    }
    
    /* denter
        
        This method recieves a blank integer and takes an input and turns it into a double 
        
        Parameters: double
        
        Returns: double
    */    
    
    public static double denter(double ent){
        Scanner keyedInput = new Scanner(System.in); //initializes scanner to take input later
        ent = keyedInput.nextDouble();
        return (ent);//returns value
    }

    /* ienter
        
        This method recieves a blank integer and takes an input and turns it into a integer 
        
        Parameters: int
        
        Returns: int
    */
    
    public static int ienter(int num){
        Scanner keyedInput = new Scanner(System.in); //initializes scanner to take input later
        num = keyedInput.nextInt();
        return (num);//returns value
    }
    
    /* Inst
        
        This method returns the exit message
        
        Parameters: none
        
        Returns: String 
    */    
    
    public static String Exit(){
        return ("Thank you!! Byee Byee!!");
        //returns exit message
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int choice = 0; //initializes variable choice
        
        
        do{ //starts do while loop

            System.out.println(Inst()); //prints instructions

            choice = ienter(choice); //takes ininput interger to use for choice

            double height = 0; //initializes height
            double length = 0;//initializes length
            double width = 0;//intializes width
            
            int fact = 0; //initializes variable for factorial
            
            double A = 0; //initializes remaining quantity
            double Ao = 0;//initializes original quantity
            double t = 0;//initializes time
            
            double xone = 0; //initializes x1
            double yone = 0; //initializes y1
            double xtwo = 0; //initializes x2
            double ytwo = 0; //initializes y2
            
            int n = 0; //initializes the number of numbers
            int a = 0; //initializes first term
            int d = 0; //initializes contast value between terms

            switch(choice){ //starts switch statement
                 
                    
                case 1: //if user picks option 1
                    System.out.println("Please enter the height of the pyramid(cm):");//promts user to enter value
                    height = denter(height); //gets input and stores in variable
                    System.out.println("Please enter the length of the base of the pyramid(cm):");//promts user to enter value
                    length = denter(length); //gets input and stores in variable
                    System.out.print("Please enter the width if the base of the pyramid(cm):");//promts user to enter value
                    width = denter(width);//gets input and stores in variable
                    //calls method and gives it inputs that user previously entered
                    System.out.println(Volume(height, length, width) + "cm cubed is the volume of your pyramid.\n"); //prints calculated value of pyramid
                    break;
                    
                case 2: //if user picks option 2
                    System.out.println("Please enter the number you want to calculate the factorial for:");//promts user to enter value
                    fact = ienter(fact);//gets input and stores in variable
                    //calls method and gives it inputs that user previously entered
                    System.out.println(factorial(fact) + " is the factorial of the number entered.\n");//prints answer
                    break;
                    
                case 3: //if user picks option 3
                    System.out.println("Please enter the remaining quantity of the substance(g):");//promts user to enter value
                    A = denter(A);//gets input and stores in variable
                    System.out.println("Please enter the initial quantity of the substance(g):");//promts user to enter value
                    Ao = denter(Ao);//gets input and stores in variable
                    System.out.println("Please enter the time elapsed(sec):");//promts user to enter value
                    t = denter(t);//gets input and stores in variable
                    //calls method and gives it inputs that user previously entered
                    System.out.print(Halfie(A, Ao, t) + " secs is the half-life of your substance.\n");//prints answer
                    break;
                    
                case 4: //if user picks option 4
                    System.out.println("Please enter x value of your first coordinate:");//promts user to enter value
                    xone = denter(xone);//gets input and stores in variable
                    System.out.println("Please enter the y value of your first coordinate:");//promts user to enter value
                    yone = denter(yone);//gets input and stores in variable
                    System.out.println("Please enter the x value of your second coordinate:");//promts user to enter value
                    xtwo = denter(xtwo);//gets input and stores in variable
                    System.out.println("Please enter the x value of your second coordinate:");//promts user to enter value
                    ytwo = denter(ytwo);//gets input and stores in variable
                    //calls method and gives it inputs that user previously entered
                    System.out.print(Slope(xone, yone, xtwo, ytwo) + " is the slope.");//prints answer
                    break;
                    
                case 5: //if user picks option 5
                    System.out.println("Please enter the number of terms to be added:");//promts user to enter value
                    n = ienter(n);//gets input and stores in variable
                    System.out.println("Please enter the first term in the sequence:");//promts user to enter value
                    a = ienter(a);//gets input and stores in variable
                    System.out.println("Please enter the constant value between terms:");//promts user to enter value
                    d = ienter(d);//gets input and stores in variable
                    //calls method and gives it inputs that user previously entered
                    System.out.print(Sequence(n, a, d) + " is the sum of your arthmetic sequence.");//prints answer
                    break;
                    
                case 6: //if user picks option 6
                    System.out.println(Exit());//prints exit statement
                    break;
            }
            
        }while(choice !=6); //ends while loop if user picks option 6   
    }
    
}
