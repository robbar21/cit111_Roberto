/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Roberto Barone
 */
public class MysteryProject {
    
    public static void main (String [] args) throws InterruptedException{
        
        int userResponse = 0; //variable for user to pick a door
        Scanner scan = new Scanner(System.in);//scanner for user to pick door
        
        System.out.println("HELLO! AND WELCOME TOOOOO...");
        Thread.sleep(1750);
        System.out.println("MYSTERY DOORS!");
        System.out.println("The game show where neither you or"
                + " I knows what is behind these doors!");
        System.out.println("Alright lets get a look at these doors, shall we!?");
        Thread.sleep(1750);
        System.out.println("**********   **********   **********");
        System.out.println("*  ***   *   *  * *   *   *  ****  *");
        System.out.println("*    *   *   * *    * *   *     *  *");
        System.out.println("*    *   *   *     *  *   *  ****  *");
        System.out.println("*    *   *   *    *   *   *     *  *");
        System.out.println("*  ****  *   *  ***** *   *  ****  *");
        System.out.println("**********   **********   **********");
        System.out.println("Three amazing!..or maybe not so amazing..doors for you"
                + " to open!");
        Thread.sleep(2000);
        System.out.println("Now isn't that exciting!");
        Thread.sleep(500);
        System.out.println("So player, which door is it gonna be?");
        Thread.sleep(1750);
        System.out.println("The audience is anxiously waiting for your decision.");
        Thread.sleep(2000);
        System.out.println("Please enter 1, 2, or 3.");
        userResponse = scan.nextInt();
        if(userResponse == 1){
            
            doorOne();//calling method doorOne for info
        }//close if for doorOne
        if (userResponse == 2){
            
            doorTwo();//calling method doorTwo for info
            
        }//close if for doorTwo
        if (userResponse == 3){
            
            doorThree();
            
        }//close if for doorThree
        
        
        
    }// close main
    
    public static void doorOne () throws InterruptedException{
        
        int breakGame = 0; //int var breakGame to start while
        final int BROKEN_GAME = 10; //final int BROKEN_GAME to make statement true and loop while
        
        System.out.println("So you chose door number one!");
        Thread.sleep(500);
        System.out.println("Well, what is behind this door!");
        Thread.sleep(1000);
        System.out.println("OPEN!");
        Thread.sleep(1500);
        System.out.println("THAT!");
        Thread.sleep(1500);
        System.out.println("DOOR!");
        
        while(breakGame <= BROKEN_GAME){
            
            System.out.println("Technical difficulties!");
            Thread.sleep(500);
            breakGame = breakGame + 1;
            
        }//end while
        
        System.out.println("Sorry player!");
        Thread.sleep(750);
        System.out.println("Looks like you chose the wrong door!");
        Thread.sleep(750);
        System.out.println("As Bruce Almighty would say!");
        Thread.sleep(750);
        System.out.println("THAT'S THE WAY THE COOKIE CRUMBLES!");
        Thread.sleep(750);
        System.out.println("Well, I hope you had fun playing...");
        Thread.sleep(1000);
        System.out.println("MYSTERY DOORS!!!");
        
        
        
    } // close doorOnce
    
    public static void doorTwo () throws InterruptedException{
        
        System.out.println("Door number two eh?");
        Thread.sleep(500);
        System.out.println("Well, what is behind this door!");
        Thread.sleep(1000);
        System.out.println("OPEN!");
        Thread.sleep(1500);
        System.out.println("THAT!");
        Thread.sleep(1500);
        System.out.println("DOOR!");
        Thread.sleep(1000);
        System.out.println("It's a cash prize!");
        System.out.println("You just won!");
        Thread.sleep(1000);
        Random r = new Random();
        BigInteger bigInt = new BigInteger(20,r);
        System.out.println("$" + bigInt);
        System.out.println("Wooow! Isn't that great! Cash is always a fun prize"
                + " to win!");
        Thread.sleep(750);
        System.out.println("Congratulations player! I hope you had fun playing...");
        Thread.sleep(750);
        System.out.println("MYSTERY DOORS!!!");
    }// close doorTwo
    
    public static void doorThree () throws InterruptedException{
        
        System.out.println("Interesting! You think door three has"
                + " what you are looking for huh?");
        Thread.sleep(1000);
        System.out.println("If you want to chose a different door right now is"
                + " your chance!");
        Thread.sleep(1000);
        System.out.println("Are you going to stay with door three or choose a"
                + " different door!?");
        System.out.println("Enter your new door number to see your prize!");
        
        
        Scanner scan = new Scanner(System.in);//scanner for user to pick door
        int newUserResponse = 0;
        
        
        newUserResponse = scan.nextInt();
        
        switch(newUserResponse){
            
            case 1:
                doorOne();
            break;
            
            case 2:
                doorTwo();
            break;
            
            case 3:
                System.out.println("Well here it is! Door Three!!");
                Thread.sleep(1000);
                System.out.println("And you just won!");
                System.out.println("A!");
                Thread.sleep(1000);
                System.out.println("BRAND!");
                Thread.sleep(1000);
                System.out.println("NEW!");
                Thread.sleep(2000);
                System.out.println("YO-YO!");
                Thread.sleep(500);
                System.out.println("Look at that Yo-Yo, GO GO!");
                Thread.sleep(1000);
                System.out.println("Congratulations player! I hope you had fun playing...");
                Thread.sleep(1000);
                System.out.println("MYSTERY DOORS!!!");
                
            break;
            default:
                System.out.println("You did not enter a valid response.");
            break;
            
        }//end switch
        
    }// close doorThree
        
    
    
}// close class
