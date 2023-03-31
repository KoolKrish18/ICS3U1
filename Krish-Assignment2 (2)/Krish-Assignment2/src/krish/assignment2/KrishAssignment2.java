/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment2;
import java.util.Scanner;
/**
 *  
 * @author S300095291
 */
public class KrishAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        double diameter;
        double pi;
        double area;
        pi = 3.14;
        System.out.println("Enter the diameter:");
        diameter = keyedInput.nextDouble();
        area = (diameter/2);
        area = (area*area);
        area = (area*pi);
        System.out.println("The area of a circle with the diameter " + diameter + " is " + area + ".");
        
        //System.out.println("Enter the second number:");
        //num1 = keyedInput.nextInt();
        
        
        
        // TODO code application logic here
    }
    
}
