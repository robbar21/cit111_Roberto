/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_Methods2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 14127
 */
public class FundamentalProject {
        public static String Gender;
        public static int Age;  
        public static String EyeColor;
        public static double Height;
        public static String HairColor;
        public static String Physique;
        public static String Clothes;
        public static String Scars;
        public static String Tattoos;
        
    public static void main(String[] args){
        System.out.println("If you can start out by telling me your name first"
                + " that would be great!");
        Scanner keyScanner = new Scanner(System.in);
        String name = keyScanner.next();
        
        System.out.println("Well, Hello " + name + ", Thank you for taking your time to help"
                + " us possibly identify the person that robbed the bank.");
        
        System.out.println("We just want to ask you a few questions that could"
                + " help us in our investigation.");
        
        System.out.println("Were you able to tell if they were male or female?");
        System.out.println("If you were could you tell us?");
        Gender();
        
        System.out.println("Do you know roughly how old they were?");
        Age();
        
        System.out.println("Thank you any information is helpful!");
        System.out.println("Our next question is, did you get a "
                + "good look at their eyes?");
        System.out.println("1 for Yes and 2 for No.");
        EyeColor();
        
        System.out.println("Roughly how tall was the suspect in feet?");
        Height();
        
        System.out.println("Did you get a good look at his hair?");
        System.out.println("1 for Yes and 2 for No.");
        HairColor();
        
        System.out.println("Are there any details of the type of body build they have?");
        Physique();
        
        System.out.println("What kind of clothes were they wearing?");
        Clothes();
        
        System.out.println("Now for some detailed questions.");
        System.out.println("If you can't awnser these it's ok!");
        System.out.println("Did they have any noticable scars?");
        System.out.println("1 for Yes 2 for No please.");
        Scars();
        
        System.out.println("Our final question for you then you're free to go");
        System.out.println("Did you notice any tattoos?");
        System.out.println("1 for Yes and 2 for No.");
        Tattoos();
        
        Random rand = new Random();
        int suspects = rand.nextInt(25);
        System.out.println("With all this information that you gave us it helped dwindle all the suspects down to "+ suspects);
    }//close main
    
    public static void Gender(){
        Scanner keyScanner = new Scanner(System.in);
        
        String suspectGender = keyScanner.next();
        
        System.out.println("Interesting, so you say the suspect was "+ suspectGender);
    }//close Gender
    
    public static int Age(){
        
        Scanner keyScanner = new Scanner(System.in);
        
        int suspectAge = keyScanner.nextInt();
        
        if(suspectAge <= 30){
            System.out.println("Thank you this is great information!");
            System.out.println("So according to you the suspect is roughly " + suspectAge);
        }
        if(suspectAge >= 31){
            System.out.println("This is great information thank you!");
            System.out.println("I'll just write down that the suspect is roughly " + suspectAge
            + " years old");
        }
        
        return suspectAge;
    }//close Age
    
    public static void EyeColor(){
        int userResponse3 = 0;
        
        Scanner keyScanner = new Scanner(System.in);
        userResponse3 = keyScanner.nextInt();
                
        
        if(userResponse3 == 1){
            System.out.println("That's great!");
            System.out.println("I'm going to give you a list of colors.");
            System.out.println("Can you tell me what color you saw selecting"
                    + " the number the corresponds with it please?");
            System.out.println("1. Brown");
            System.out.println("2. Blue");
            System.out.println("3. Green");
            System.out.println("4. Other");
            int suspectEyeColor = keyScanner.nextInt();
        
        switch(suspectEyeColor) {
            case 1 -> {//Brown Eyes  
                System.out.println("Ok so the suspect had brown eyes.");
                
                break;
                }
            case 2 -> {//Blue Eyes
                System.out.println("Glad to know the suspect had blue eyes.");
                
                break;
                }
            case 3 -> {//Green Eyes
                System.out.println("A unique color of eyes so that's very helpful!");
                
                break;
                }
            default -> {
                System.out.println("Ok so if it wasn't one of those colors can you "
                        + "tell me what color it was exactly?");
                
                String userResponse2;
                userResponse2 = keyScanner.next();
                
                System.out.println("Great so now we know that the suspect has "+ userResponse2 + " colored eyes.");
                }
        }
            
                    }else{
            System.out.println("That's ok you are helping us with the other information!");
            
        }//close if else
                
          
            
         
        
    }//close EyeColor
    
    public static void Height(){
        double suspectHeight;
        
        System.out.println("If you can only tell us in feet that's ok.");
        System.out.println("But if you can estimate any inches please tell us.");
        
        Scanner scan = new Scanner(System.in);
        
        suspectHeight = scan.nextDouble();
        
        System.out.println("Thank you, you are helping this investigation tremendously!");
        System.out.println("Let me just put down that the suspect is roughly "+ suspectHeight +" feet.");
        
    }//close Height
    
    public static void HairColor(){
        
        int userResponse4 = 0;
        
        Scanner keyScanner = new Scanner(System.in);
        userResponse4 = keyScanner.nextInt();
                
        
        if(userResponse4 == 1){
            System.out.println("That's great!");
            System.out.println("I'm going to give you a list of colors.");
            System.out.println("Can you tell me what color you saw selecting"
                    + " the number the corresponds with it please?");
            System.out.println("1. Brown");
            System.out.println("2. Black");
            System.out.println("3. Blonde");
            System.out.println("4. Other");
            int suspectHairColor = keyScanner.nextInt();
        
        switch(suspectHairColor) {
            case 1 -> {//Brown Hair 
                System.out.println("Ok so the suspect has brown hair.");
                
                break;
                }
            case 2 -> {//Black Hair
                System.out.println("Glad to know the suspect has black hair.");
                
                break;
                }
            case 3 -> {//Blonde Hair
                System.out.println("A suspect with blonde hair that's very helpful!");
                
                break;
                }
            default -> {//Other Hair
                System.out.println("Ok so if it wasn't one of those colors can you "
                        + "tell me what color it was exactly?");
                
                String userResponse5;
                userResponse5 = keyScanner.next();
                
                System.out.println("Great so now we know that the suspect has "+ userResponse5 + " colored hair.");
                }
        }
            
                    }else{
            System.out.println("That's ok you are helping us with the other information!");
            
            
        }//close if else
        
    }//close HairColor
    
    public static void Physique(){
        System.out.println("If so give a one word adjective on his physique.");
        Scanner keyScanner = new Scanner(System.in);
        
        String suspectPhysique = keyScanner.next();
        
        System.out.println("Perfect, glad to know that the suspect is "+ suspectPhysique);
        
    }//close Physique
    
    public static void Clothes(){
        
        int ClothesIf = 0;
                
        
        if(ClothesIf == 0){
            
            Scanner keyScanner = new Scanner(System.in);
            System.out.println("I'm going to give you a list of styles of clothes.");
            System.out.println("Can you tell me what style you saw selecting"
                    + " the number that corresponds with it please?");
            System.out.println("1. T-shirt");
            System.out.println("2. Long Sleeve Shirt");
            System.out.println("3. Sweater");
            System.out.println("4. Hoodie");
            System.out.println("5. Other");
            int suspectHairColor = keyScanner.nextInt();
        
        switch(suspectHairColor) {
            case 1 -> {//T-Shirt
                System.out.println("Suspect was wearing a T-Shirt great.");
                
                break;
                }
            case 2 -> {//Long Sleeve
                System.out.println("Glad to know the suspect was wearing a long sleeve shirt.");
                
                break;
                }
            case 3 -> {//Sweater
                System.out.println("A suspect with a sweater on, that's very helpful!");
                
                break;
                }
            case 4 -> {//Hoodie
                System.out.println("Suspect seen with a hoodie on, thank you.");
            }
            default -> {//Other clothes
                System.out.println("Ok so if it wasn't one of those styles can you "
                        + "tell me what style it was exactly?");
                
                String userResponse9;
                userResponse9 = keyScanner.next();
                
                System.out.println("Great so now we know that the suspect was wearing a "+ userResponse9 + " .");
                }
        }
            
                    }
        
    }//close Clothes
    
    public static void Scars(){
        int userResponse7 = 0;
        
        Scanner keyScanner = new Scanner(System.in);
        userResponse7 = keyScanner.nextInt();
                
        
        if(userResponse7 == 1){
            
            System.out.println("If you could tell me where the scar was located that would help so much.");
        
            String suspectScarsLocation = keyScanner.next();
            
            System.out.println("Interesting, so the suspect has a scar located on their "
        + suspectScarsLocation);
            
        }else{
            
            System.out.println("What you have given us should be enough, we just like to try for details.");
        }
        
        
    }//close Scars
    
    public static void Tattoos(){
        int userResponse10 = 0;
        
        Scanner keyScanner = new Scanner(System.in);
        userResponse10 = keyScanner.nextInt();
                
        
        if(userResponse10 == 1){
            
            System.out.println("If you could start by telling me what the tattoo looked like.");
            System.out.println("For example, was it an animal or a symbol or even a pattern?");
        
        String suspectTattoos = keyScanner.next();
        
        System.out.println("Next if you can tell me where it is located on the suspects body.");
        
        String suspectTattoosLocation = keyScanner.next();
        
        System.out.println("Interesting, so the suspect has a "+ suspectTattoos + " located on their "
        + suspectTattoosLocation);
            
        }else{
            
            System.out.println("You have given us plenty of information thank you for your co-operation.");
        }
        
        
    }//close Tattoos
    
}//close class
