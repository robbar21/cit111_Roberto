/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_Methods2;

import java.util.Scanner;

/**
 *
 * @author 14127
 */
public class UnitConverter {
    
    public static void main(String[] args) throws InterruptedException{
        
        Scanner keyScanner = new Scanner(System.in);
        
        int userUnit;
        
        System.out.println("Greetings user! I see you want to convert some measurements!");
        System.out.println("Let me help you with that!");
        System.out.println("First off, let's see how many miles you want to see converted to feet.");
        
        
        userUnit = keyScanner.nextInt();
        
        int returnedconvertMiles = MilestoFeet(userUnit);
        
        System.out.println("Your conversion of " + userUnit + " miles to feet equals " + returnedconvertMiles + " feet.");
        
        Thread.sleep(1000);
        System.out.println("Let's move on to the next conversion!");
        System.out.println("TIME! One of the most important units in our life!");
        System.out.println("Enter the amount of days you want to see converted into seconds.");
        
        int userDays = keyScanner.nextInt();
        
        System.out.println("We crunched the numbers!");
        
        int returnedconvertDays = DaystoSeconds(userDays);
        
        System.out.println("Your conversion of " + userDays + " days is equal to " + returnedconvertDays + " seconds.");
        
        
        System.out.println("Let's continue on to weight!");
        System.out.println("Please enter how many pounds you want to change to ounces.");
        int userLbs = keyScanner.nextInt();
        
        int returnedconvertLbs = LbtoOz(userLbs);
        
        System.out.println("Your conversion of " + userLbs + " pounds is equal to " + returnedconvertLbs + " ounces.");
        
        System.out.println("Thank you for using my Unit Converter!");
        System.out.println("Have a great day!");
        System.out.println("End Program.");
       }//close main
    
    public static int MilestoFeet(int userUnit){
    
        int convertMiles = Math.multiplyExact(userUnit, 5280);
        return convertMiles;
    }//close Feet To Miles
    
    /**
     * 
     * @param userDays
     * @return convertDays
     */
    public static int DaystoSeconds(int userDays){
        
        int convertDays = Math.multiplyExact(userDays, 86400);
        
        return convertDays;
    }//close Days to Seconds
    
    
    /**
     * 
     * @param userLbs
     * @return 
     */
    public static int LbtoOz(int userLbs){
        
        int convertLbs = Math.multiplyExact(userLbs, 16);
        
        return convertLbs;
    }// close Pounds to Ounces
   
    
   
    
}//close class
