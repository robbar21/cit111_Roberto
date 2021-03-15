/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author Roberto Barone
 */
public class PassWordAuth {
    
    private final static String PASSWORD = "Hacker";
    
    private final static String HINTPASSWORD = "Toast";
    
    private final static String SECRET = "Congrats you enter the correct password."
                    + "The redacted information is as followed.";
    private final static String HINTSECRET = "You had to use a hint to get this information"
            + "so it's not gonna be secret! Try again.";
    private final static int NUM_ATTEMPTS = 5;
    
    
    public static void main(String[] args){
        
        
        System.out.println("Hello! You must be trying to access these files.");
        System.out.println("Please, enter the password for classified information.");
        System.out.println("***CASE SENSITIVE***");
        
        
        int attempts = 0;
        String userPassword;
        
        while(attempts < NUM_ATTEMPTS){
            
             Scanner scan = new Scanner(System.in);
             userPassword = scan.next();
        
        if(userPassword.equals(PASSWORD) ){
            
            System.out.println("Correct password has been entered!");
            System.out.println("Redacted information: " + SECRET);
            System.out.println("Good job on hacking the system!");
            
            break;
            
        }else{
            if(userPassword.equals(HINTPASSWORD)){
           System.out.println(HINTSECRET);
        break;
            }
            System.out.println("WRONG! Failure to enter the correct password"
                    + " multiple times will cause the system to shut off.");
            
            attempts = attempts + 1;
            
            System.out.println("Number of attempts: " + attempts);
            System.out.println("Number of attempts allowed: " + NUM_ATTEMPTS);
            
            if(attempts == NUM_ATTEMPTS){
                
                System.out.println("To many attempts at password, protection protocol activated.");
                
                
            }else{
                System.out.println("Please try again. ");
                System.out.println("Would you like a hint?");
                System.out.println("1 for Yes. 2 for No.");
                
            int response = 0;
            Scanner userInterface = new Scanner(System.in);
            response = userInterface.nextInt();
            // switch statement for multiple variables
            if(response == 1){
                    
               System.out.println("The bread that comes out of a toaster.");
              
            }else{
                
               System.out.println("Good Luck! I know you will figure it out!");
               System.out.println("Please re-enter password");
                
                }//end of 2nd nested if/else
                
                
            }//end 1st nested if/else
                    
                    
                
                
             }//end else
             
        
            }//end while
        System.out.println("End Program");
    }//main
}
        