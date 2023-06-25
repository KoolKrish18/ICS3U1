/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment15.pkg3;

/**
 *
 * @author nalam
 */
public class KrishAssignment153 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [ ] marks = {33.7, 55.1, 32.8, 97.6, 41.6, 49.2, 65.2, 44.6, 88.4}; //initializes decimal array and lists the numbers that are stored in the array
        double total=0; //initializes double total and sets to 0
        double average; //initializes double average
        
        System.out.println("These are the marks:"); //prints "These are the marks"
        
        for (int i = 0; i<=8; i= i + 1){ 
             System.out.println(marks[i]); //prints the number from the initialized decimal array based on loop number (indexes with loop number)
        } 
        //sets variable to 0, adds 1 each time, runs untill variable is equal to 8 (9 times because it starts on 0)

        for (int i = 0; i<=8; i= i + 1){ 
             total = total + marks[i]; //adds new indexed (by loop number) decimal to total
        } 
        //sets variable to 0, adds 1 each time, runs untill variable is equal to 8 (9 times because it starts on 0)
        
        average = total/9; //divdes the added up array by 9 (calculates mean)
        
        average = average * 10; 
        average = Math.round(average); 
        average = average/10;
        //rounds to 1 decimal place (multiplys by 10, rounds to whole, than divides by ten)
        
        System.out.println("The average mark is:"); //prints "The average mark is:"
        System.out.println(average); //prints final rounded number 

    }
    
}
