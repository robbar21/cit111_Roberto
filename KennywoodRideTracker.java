/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author 14127
 */
public class KennywoodRideTracker {
    
    // MEMBER VARIABLES: Accessible to all methods
    public static int totalRiders = 0;
    public static int totalRideAttempts = 0;
    public static int totatSickRiders = 0;
    
    //constants for min heights of riders on two types of rides
    public static final int MIN_HEIGHT_INCHES_THEME = 36;
    public static final int MIN_HEIGHT_INCHES_THRILL = 52;
    
    // METHOD SECTION:
    
    /**
     * 
     * @param riders
     * @param avgHeight 
     */
    public static void rideBlackWidow(int riders, int avgHeight){
        // TODO:
        // Determine if the group is tall enough to ride by
        //comparing the avgHeight with the minium for thrill rides
        // If they are too short, increase our member variable tally for
        // failedRideAttempts
        if(avgHeight >= MIN_HEIGHT_INCHES_THRILL){
            
            System.out.println("We're on the Black Widow!");
            totalRiders = riders;
            
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totatSickRiders = numSickRiders;
            
        }else{
          
            System.out.println("Aww, I guess we'll go ride the Merry Go Round...");
            totalRideAttempts = riders;
        }//close if/else block
        // If they are tall enough, simulate the entire group riding this ride
        // and increase our tall of totalRiders
        
        // Randomly simulate some fraction of the group getting sick on this 
        // ride, and increase the tally of totalSickRiders by this amount
        
        
    }// close rideBlackWidow
    
    /**
     * 
     * @param riders
     * @param avgHeight 
     */
    public static void rideMerryGoRound(int riders, int avgHeight){
        // follow template of rideBlackWidow
        if(avgHeight >= MIN_HEIGHT_INCHES_THEME){
            System.out.println("Im on the Merry Go Round");
            
            totalRiders = riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totatSickRiders = numSickRiders;
            
        }else{
            
            System.out.println("Can we ride anything!?");
            
            totalRideAttempts = riders;
            
        }//close if/else block
    }// close rideMerryGoRound
    
    public static void printRideStats(){
        System.out.println("***** RIDER STATS ******");
        System.out.print("Total Riders: ");
        System.out.println(totalRiders);
        System.out.print("Total failed ride attempts: ");
        System.out.println(totalRideAttempts);
        System.out.print("Total sick riders: ");
        System.out.println(totatSickRiders);
        
    }// close printRideStats
    
    public static void main(String[] args){
        System.out.println("Kennywood ride simulation: ");
        printRideStats();
        System.out.println("Please enter the average group height that is riding"
                + " the Black Widow.");
        int avgHeightB;
        Scanner scan = new Scanner(System.in);
        avgHeightB = scan.nextInt();
        //simulate 30 people on black widow
        rideBlackWidow(30, avgHeightB);
        printRideStats();
        
        System.out.println("Please enter the average group height that is riding"
                + " the Merry Go Round.");
        int avgHeightM;
        avgHeightM = scan.nextInt();
        //simulate 25 people on the Merry Go Round
        rideMerryGoRound(25, avgHeightM);
        printRideStats();
        
    }// close main
    
}//close class
