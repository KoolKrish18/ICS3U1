/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment19;

/**
 *
 * @author S300095291
 */
import java.util.Scanner; //imports scanner

public class KrishAssignment19 {
    
    public static void Volume(double x, double y, double z){ // method that takes in 3 double values 
        System.out.println();//prints blank line
        System.out.println(((x*y*z)/3) + "cm cubed is the volume of your pyramid.\n"); //prints calculated value of pyramid
    }
    public static void factorial(int x){ //method that takes in one integer
        int ansf = 1; //initializes variabel and sets to 1
        for (int i = x; i > 0; i -= 1){
            ansf = ansf*i;
        }
        //for loop to keep calculating number with number-1 untill 0 (calculates factorial)
        System.out.println();//prints blank line
        System.out.println(ansf + " is the factorial of the number entered.\n");//prints answer
    }
    public static void Halfie(double x, double y, double z){// method that takes in 3 double values
        double ansh; //initializes answer vairable
        ansh = (z*(Math.log(2)/Math.log(y/x))); //calculates halflife 
        System.out.println();//prints blank line
        System.out.print(ansh + " secs is the half-life of your substance.\n");//prints answer
    }
    public static void Slope(double a, double b, double c, double d){// method that takes in 4 double values
        double anss;//initializes answer vairable
        anss = (d-b)/(c-a);//calciulates slope
        System.out.println();//prints blank line
        System.out.print(anss + " is the slope.");//prints answer
    }
    public static void Sequence(int x, int y, int z){// method that takes in 3 integer values
        double ansa;//initializes answer vairable
        ansa = (x/2)*((2*y) + ((x-1)*z)); //calculates sum of arthemetic sequence
        System.out.println();//prints blank line
        System.out.print(ansa + " is the sum of your arthmetic sequence.");//prints answer
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in); //initializes scanner to take input later
         
        int choice; //initializes variable choice 
        
        do{ //starts do while loop

            System.out.println("\n\nWelcome to Krish's Subroutine program!!!");//prints welcome message
            System.out.println("Please pick one of the following choices: \n\n1. Calculate volume of a rectangle right pyramid \n2. Calculate factorial \n3. Calculate half life \n4. Calculate slope of a line \n5. Calculate sum of an arithmetic sequence \n6. Exit Program");
            //prints all options 
            System.out.println("\nEnter your preffered choice:"); //promts user to pick a choice

            choice = keyedInput.nextInt(); //takes ininput interger to use for choice

            double height; //initializes height
            double length;//initializes length
            double width;//intializes width
            
            int fact; //initializes variable for factorial
            
            double A; //initializes remaining quantity
            double Ao;//initializes original quantity
            double t;//initializes time
            
            double xone; //initializes x1
            double yone; //initializes y1
            double xtwo; //initializes x2
            double ytwo; //initializes y2
            
            int n; //initializes the number of numbers
            int a; //initializes first term
            int d; //initializes contast value between terms

            switch(choice){ //starts switch statement for   5E333
                
                case 1: //if user picks option 1
                    System.out.println("Please enter the height of the pyramid(cm):");//promts user to enter value
                    height = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.println("Please enter the length of the base of the pyramid(cm):");//promts user to enter value
                    length = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.print("Please enter the width if the base of the pyramid(cm):");//promts user to enter value
                    width = keyedInput.nextDouble();//gets input and stores in variable
                    Volume(height, length, width);//calls method and gives it inputs that user previously entered
                    break;
                    
                case 2: //if user picks option 2
                    System.out.println("Please enter the number you want to calculate the factorial for:");//promts user to enter value
                    fact = keyedInput.nextInt();//gets input and stores in variable
                    factorial(fact);//calls method and gives it inputs that user previously entered
                    break;
                    
                case 3: //if user picks option 3
                    System.out.println("Please enter the remaining quantity of the substance(g):");//promts user to enter value
                    A = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.println("Please enter the initial quantity of the substance(g):");//promts user to enter value
                    Ao = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.println("Please enter the time elapsed(sec):");//promts user to enter value
                    t = keyedInput.nextDouble();//gets input and stores in variable
                    Halfie(A, Ao, t);//calls method and gives it inputs that user previously entered
                    break;
                    
                case 4: //if user picks option 4
                    System.out.println("Please enter x value of your first coordinate:");//promts user to enter value
                    xone = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.println("Please enter the y value of your first coordinate:");//promts user to enter value
                    yone = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.println("Please enter the x value of your second coordinate:");//promts user to enter value
                    xtwo = keyedInput.nextDouble();//gets input and stores in variable
                    System.out.println("Please enter the x value of your second coordinate:");//promts user to enter value
                    ytwo = keyedInput.nextDouble();//gets input and stores in variable
                    Slope(xone, yone, xtwo, ytwo);//calls method and gives it inputs that user previously entered
                    break;
                    
                case 5: //if user picks option 5
                    System.out.println("Please enter the number of terms to be added:");//promts user to enter value
                    n = keyedInput.nextInt();//gets input and stores in variable
                    System.out.println("Please enter the first term in the sequence:");//promts user to enter value
                    a = keyedInput.nextInt();//gets input and stores in variable
                    System.out.println("Please enter the constant value between terms:");//promts user to enter value
                    d = keyedInput.nextInt();//gets input and stores in variable
                    Sequence(n, a, d);//calls method and gives it inputs that user previously entered
                    break;
                    
                case 6: //if user picks option 6
                    System.out.println("Thank you!! Byee Byee!!");//prints exit statement
                    break;
            }
            
        }while(choice !=6); //ends while loop if user picks option 6   
    }
    
}
