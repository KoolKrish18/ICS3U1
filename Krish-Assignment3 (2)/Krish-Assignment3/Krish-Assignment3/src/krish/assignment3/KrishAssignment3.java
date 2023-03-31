/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment3;
import java.util.Scanner;

/**
 *
 * @author S300095291
 */
public class KrishAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        final double APPLES = 1.50;
        final double BANANA = 1.99;
        final double PINEAPPLE = 2.99;
        final double STRAWBERRIES = 1.99;
        int napples;
        int nbanana;
        int npineapple;
        int nstrawberries;
        System.out.println("Welcome to Krish's fruit store!\nPlease state how many of the following fruit you would like to buy, in order to recieve a bill containing the total.");
        System.out.println("How many apples would you like to buy?");
        napples = keyedInput.nextInt();
        System.out.println("How many bananas would you like to buy?");
        nbanana = keyedInput.nextInt();
        System.out.println("How many pineapples would you like to buy?");
        npineapple = keyedInput.nextInt();
        System.out.println("How many strawberries would you like to buy?");
        nstrawberries = keyedInput.nextInt();
        final double TAXRATE = 1.13;
        double subtotal;
        int coupon; 
        double discount;
        double grand;
        System.out.println("Do you have any coupons you would like to use?\n(if so type the amount your coupon will deduct from the total, if you do not possess a coupon please enter the value 0)");
        coupon = keyedInput.nextInt();
        subtotal = (npineapple*PINEAPPLE)+(nbanana*BANANA)+(napples*APPLES)+(nstrawberries*STRAWBERRIES);
        subtotal = Math.round(subtotal * 100.0) / 100.0;
        discount = subtotal - coupon;
        grand = discount*TAXRATE;
        grand = Math.round(grand * 100.0) / 100.0;
        System.out.println("\n - \n \nYour subtotal is: $" + subtotal);
        System.out.println("After applying any given discounts the total is: $" + discount);
        System.out.println("Your Grand Total after a 13% tax is: $" + grand);
        // TODO code application logic here
    }
    
}
