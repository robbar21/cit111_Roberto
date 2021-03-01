/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendsProject;

import java.util.Scanner;

/**
 *
 * @author Roberto Barone
 */
public class MyFriendsProject {
    public static void main(String[] args){
        //storage container for variables
        int compatScore = 0;
        final int COMPAT_THRESHOLD = 90;
        int userResponse = 0;
        Scanner inputScanner;
        boolean passedThreshold = false;
        
        //Points for questions awnsered
        final int Q1_YES_POINTS = 50;
        final int Q1_NO_POINTS = -35;
        
        final int Q2_NO_POINTS = -50;
        
        final int Q3_NO_POINTS = -15;
        
        inputScanner = new Scanner (System.in);
        
        System.out.println("HI! My name is Roberto!");
        System.out.println("Would you be willing to take a compatablity test?");
        System.out.println("If so, please answer the following questions truthfully!");
        
        //****************
        //Question 1
        //****************
        
        System.out.println("Q1: Do you enjoy playing videogames? ");
        System.out.println("Enter 1 for yes, any other number for no.");
        
        // Use Scanner for userResponse
        userResponse = inputScanner.nextInt();
        
        if (userResponse ==1){
            //Logic for if the user response is a 1
            
            //Add 50 for saying yes
            compatScore = compatScore + Q1_YES_POINTS;
            System.out.println("That's awesome that you like videogames too!");
            System.out.println("Maybe we could play sometime.");
            
        
       } else { //this runs if the user awnsered no to the first question
            
            compatScore = compatScore + Q1_NO_POINTS;
            System.out.println("Sorry, we are already off to a bad start..");
            
            System.out.println("Your score was " + compatScore);
            } // close if/else block
        
        //**************
        //QUESTION 2
        //**************
        
        System.out.println("Q2: Do you enjoy having pets?");
        System.out.println("Enter 1 for yes or any other number for no like before.");
        userResponse = inputScanner.nextInt();
        if( userResponse == 1){
           compatScore = compatScore + 10;
           
        System.out.println("Enter one of the options that is your favorite for bonus points!");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Fish");
        System.out.println("4. Other");
        
        userResponse = inputScanner.nextInt();
        
        switch(userResponse) {
            
            // Dog
            case 1: 
                
                compatScore = compatScore + 50;
                break;
            // Cat
            case 2:
                
                compatScore = compatScore + 40;
                break;
            // Fish 
            case 3:
                
                compatScore = compatScore + 25;
                break;
            //other
            default:
                
                compatScore = compatScore + 5;
            
            }//end switch   
        
        System.out.println("I love animals too! You're 2 for 2!");
        System.out.println("Your current score right now is " + compatScore);
        
        } else { 
            //only runs if the awnser to question 2 was a no.
            
            compatScore = compatScore + Q2_NO_POINTS;
            
            System.out.println("Sorry I don't know if I want to be friends with");
            System.out.println("someone who doesnt like animals.");
            System.out.println("Your current score is " + compatScore);
        } // end if/else
        
        System.out.println("Are you into any sports?");
        System.out.println("Yes for 1 and No for 2!");
        
        userResponse = inputScanner.nextInt();
        
       if(userResponse == 1){
           
           compatScore = compatScore + 25;
           
           System.out.println("Awesome! Do you have a favorite sport?");
           System.out.println("1. Basketball");
           System.out.println("2. Football");
           System.out.println("3. Hockey");
           System.out.println("4. Golf");
           System.out.println("5. Other");
           
            userResponse = inputScanner.nextInt();
        
        switch(userResponse) {
            
            // Basketball
            case 1: 
                
                compatScore = compatScore + 50;
                break;
            // Football
            case 2:
                
                compatScore = compatScore + 50;
                break;
            // Hockey
            case 3:
                
                compatScore = compatScore + 15;
                break;
            // Golf
            case 4:
                
                compatScore = compatScore + 30;
                break;
            // Other
            default:
                
                compatScore = compatScore + 10;
            
            }//end switch
           
            System.out.println("That's cool that you like sports!");
            System.out.println("So does your favorite team happen to be the Steelers if you like football?");
            System.out.println("Enter 1 for a big yes and any other number if it's another team.");
            
            userResponse = inputScanner.nextInt();
            
            if(userResponse == 1){
                
                compatScore = compatScore + 100;
                System.out.println("Sweet! LET'S GO STEELERS!");
                System.out.println("Your final score was " + compatScore);
                
            } else {
                
                compatScore = compatScore + -5;
                System.out.println("That's alright, you can like who you like.");
                
            } //end nested if/else
            
            
        } else{
           //runs if a no was the response for question 3.
           
           compatScore = compatScore + Q3_NO_POINTS;
           
           System.out.println("Aw, I was really hoping that you would enjoy sports! Thats ok though.");
           System.out.println("Your final score is " + compatScore);
           
           
       }// end if/else
       
       if(compatScore >= COMPAT_THRESHOLD){
            passedThreshold = true;
            System.out.println("We should hangout sometime!");
        } else {
            System.out.println("We don't have the same interests, sorry.");
        } // close if/else for overall compat checking
        
        System.out.println("Thanks for taking my test!");
           
      } // close main
        
        
    }//close class

      