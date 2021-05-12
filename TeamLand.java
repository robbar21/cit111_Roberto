/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;



import java.util.Scanner;

/**
 *
 * @author 14127
 */
public class TeamLand {
    
    public static void main(String[] args){
        
        System.out.println("You are now the proud owner of this team!");
        System.out.println("Please give them a new team name so we can start fresh!");
        
        Scanner keyScanner = new Scanner(System.in);
        //scanner to get userInput of team name
        String name = keyScanner.next();
        
        System.out.println("Great! The new identity of this football team is called " + name);
        //calling method
        quarterback();
        //calling method
        runningback();
        //calling method
        widereceiver();
        //calling method
        tightend();
        //calling method
        offensiveline();
        //calling method
        defensiveEnd();
        //calling method
        defensivetackle();
        //calling method
        linebacker();
        //calling method
        cornerback();
        //calling method
        kicker();
        //calling method
        punter();
        //calling method
        defense();
        
    }//close main
    
    public static void quarterback(){
       
        System.out.println("Your quarterback's name is Zach Bowers.");
        System.out.println("He's a younger player with great potential.");
        System.out.println("His stats from last season are..");
        //creating new object
       TeamSetting quarterback = new TeamSetting();
        
        System.out.print("passing yards: ");
        quarterback.passingStats();
        System.out.print("passing touchdowns: ");
        quarterback.passingTouchdowns();
        System.out.print("rushing yards: ");
        quarterback.rushingStats();
        System.out.print("rushing touchdowns: ");
        quarterback.rushingTouchdowns();
        System.out.print("interceptions thrown: ");
        quarterback.interceptionsThrown();
    }//close quaterback
    
    public static void runningback(){
        
        System.out.println("Our vetern runningback's name is Kyle Rexton Sr.");
        System.out.println("His stats last season are as followed.");
        //creating new object
        TeamSetting runningback = new TeamSetting();
        
        System.out.print("rushing yards: ");
        runningback.rushingStats();
        System.out.print("rushing touchdowns: ");
        runningback.rushingTouchdowns();
        System.out.print("receiving yards: ");
        runningback.recievingStats();
        System.out.print("catches: ");
        runningback.catches();
        System.out.print("receiving touchdowns: ");
        runningback.recievingTouchdowns();
        System.out.print("fumbles: ");
        runningback.fumbles();
        
    }//close runningback
    
    public static void widereceiver(){
        
        System.out.println("We have a few WR on the team. ");
        System.out.println("These are their stats from last season.");
        //creating new object
        TeamSetting widereceiver = new TeamSetting();
        //creating variable for while loop
        int widereceiver1 = 1;
        final int widereceiver4 = 4;
        //while loop to get the different players and stats
        while(widereceiver1 <= widereceiver4){
            //adding one per loop so it doesnt loop forever
                widereceiver1 = widereceiver1 +1;
                
                if(widereceiver1 == 2){
                    
                    System.out.println("Our starting WR's name is Keshawn Chester");
                    
                    System.out.print("receiving yards: ");
                    widereceiver.recievingStats();
                    System.out.print("catches: ");
                    widereceiver.catches();
                    System.out.print("receiving touchdowns: ");
                    widereceiver.recievingTouchdowns();
                    System.out.print("fumbles: ");
                    widereceiver.fumbles();
                    
                }//close first if
                if(widereceiver1 == 3){
                    
                    System.out.println("Our 2nd String WR's name is Ervin Harris");
                    
                    System.out.print("receiving yards: ");
                    widereceiver.recievingStats();
                    System.out.print("catches: ");
                    widereceiver.catches();
                    System.out.print("receiving touchdowns: ");
                    widereceiver.recievingTouchdowns();
                    System.out.print("fumbles: ");
                    widereceiver.fumbles();
                    
                }//close secound if
                if(widereceiver1 == 4){
                    
                    System.out.println("Our slot WR's name is Ned Birch");
                    
                    System.out.print("receiving yards: ");
                    widereceiver.recievingStats();
                    System.out.print("catches: ");
                    widereceiver.catches();
                    System.out.print("receiving touchdowns: ");
                    widereceiver.recievingTouchdowns();
                    System.out.print("fumbles: ");
                    widereceiver.fumbles();
                    
                }//close third if
                if(widereceiver1 == 5){
                    
                    System.out.println("And our rookie WR's name is Malik Reyes.");
                    
                    System.out.print("receiving yards: ");
                    widereceiver.recievingStats();
                    System.out.print("catches: ");
                    widereceiver.catches();
                    System.out.print("receiving touchdowns: ");
                    widereceiver.recievingTouchdowns();
                    System.out.print("fumbles: ");
                    widereceiver.fumbles();
                    
                }//close fourth if
            }//close while
            
            
    }//close widereceiver
    
    public static void tightend(){
        //creating new object
        TeamSetting tightend = new TeamSetting();
        
        System.out.println("Our TightEnd's name is Aaron Lee Jr.");
        System.out.println("He's been a solid starter for us the past couple of years.");
        
        System.out.print("receiving yards: ");
        tightend.recievingStats();
        System.out.print("catches: ");
        tightend.catches();
        System.out.print("receiving touchdowns: ");
        tightend.recievingTouchdowns();
        System.out.print("fumbles: ");
        tightend.fumbles();
        
    }//close tightend
    
    public static void offensiveline(){
        
        System.out.println("We have a few solid offensive lineman to work with.");
        System.out.println("This is how they did last season.");
        //creating new object
        TeamSetting offensiveline = new TeamSetting();
        
        System.out.print("total number of sacks allowed: ");
        offensiveline.sacksAllowedStats();
        
    }//close offensiveline
    
    public static void defensiveEnd(){
        //creating new object
        TeamSetting defensiveEnd = new TeamSetting();
        
         System.out.print("Team sacks for our defensive Ends: ");
         defensiveEnd.sackStats();
        
        
    }//close defensiveline
    
    public static void defensivetackle(){
        //creating new object
        TeamSetting defensivetackle = new TeamSetting();
        
        System.out.print("Team sacks for our defensive Tackles: ");
        defensivetackle.sackStats();
        
    }//close defensivetackle
    
    public static void linebacker(){
        //creating new object
        TeamSetting linebacker = new TeamSetting();
        
        System.out.println("Our linebacker group is made up from 4 different players.");
        //creating variable for while loop
        int linebacker1 = 1;
        final int linebacker4 = 5;
        //while loop to get the different players and stats
        while(linebacker1 <= linebacker4){
            //adding one per loop so it doesnt loop forever
                linebacker1 = linebacker1 +1;
                
                if(linebacker1 == 2){
                    
                    System.out.println("Our starting middle linebacker's name is Gus Willow");
                    
                    System.out.print("tackles: ");
                    linebacker.tackleStats();
                    System.out.print("sacks: ");
                    linebacker.sackStats();
                    System.out.print("interceptions: ");
                    linebacker.interceptionStats();
                    
                }//close first if
                if(linebacker1 == 3){
                    
                    System.out.println("Our 2nd String linebackers's name is Adrian Killins");
                    
                    System.out.print("tackles: ");
                    linebacker.tackleStats();
                    System.out.print("sacks: ");
                    linebacker.sackStats();
                    System.out.print("interceptions: ");
                    linebacker.interceptionStats();
                    
                }//close secound if
                if(linebacker1 == 4){
                    
                    System.out.println("Our third string linebacker's name is Edward Hurtchins");
                    
                    System.out.print("tackles: ");
                    linebacker.tackleStats();
                    System.out.print("sacks: ");
                    linebacker.sackStats();
                    System.out.print("interceptions: ");
                    linebacker.interceptionStats();
                    
                }//close third if
                if(linebacker1 == 5){
                    
                    System.out.println("And our rookie linebacker's name is Patrick Star.");
                    
                    System.out.print("tackles: ");
                    linebacker.tackleStats();
                    System.out.print("sacks: ");
                    linebacker.sackStats();
                    System.out.print("interceptions: ");
                    linebacker.interceptionStats();
                    
                }//close fourth if
        }//close while
    }//close linebacker
    
    public static void cornerback(){
        //creating new object
        TeamSetting cornerback = new TeamSetting();
        
        System.out.println("We have four players to work with in our secondary.");
        //creating variable for while loop
        int cornerback1 = 1;
        final int cornerback4 = 5;
        //while loop to get the different players and stats
        while(cornerback1 <= cornerback4){
            //adding one per loop so it doesnt loop forever
                cornerback1 = cornerback1 +1;
                
                if(cornerback1 == 2){
                    
                    System.out.println("Our Strong Safety's name is Dewi Harper");
                    
                    System.out.print("tackles: ");
                    cornerback.tackleStats();
                    System.out.print("sacks: ");
                    cornerback.sackStats();
                    System.out.println("interceptions: ");
                    cornerback.interceptionStats();
                    
                }//close first if
                if(cornerback1 == 3){
                    
                    System.out.println("Our Free Safety's name is Stefan O'Quinn.");
                    
                    System.out.print("tackles: ");
                    cornerback.tackleStats();
                    System.out.print("sacks: ");
                    cornerback.sackStats();
                    System.out.println("interceptions: ");
                    cornerback.interceptionStats();
                    
                }//close secound if
                if(cornerback1 == 4){
                    
                    System.out.println("Our starting corners's name is Cory Dean");
                    
                    System.out.print("tackles: ");
                    cornerback.tackleStats();
                    System.out.print("sacks: ");
                    cornerback.sackStats();
                    System.out.print("interceptions: ");
                    cornerback.interceptionStats();
                    
                }//close third if
                if(cornerback1 == 5){
                    
                    System.out.println("And our secound corner's name is Brian Marquez.");
                    
                    System.out.print("tackles: ");
                    cornerback.tackleStats();
                    System.out.print("sacks: ");
                    cornerback.sackStats();
                    System.out.print("interceptions: ");
                    cornerback.interceptionStats();
                    
                }//close fourth if
        }//close while
        
    }//close cornerback
    
    public static void kicker(){
        //creating new object
        TeamSetting kicker = new TeamSetting();
        
        System.out.println("Our kickers name is Jake Goldlegg");
        
        System.out.print("Our kicker attempted: ");
        kicker.fgAttemptedStats();
        System.out.print("And he made: ");
        kicker.fgMadeStats();
        
        
    }//close kicker
    
    public static void punter(){
        //creating new object
        TeamSetting punter = new TeamSetting();
        
        System.out.println("Our punters name is Neil Swindler, this is how he did.");
        
        System.out.print("Our punter's total yards accumalted over the season: ");
        punter.yrdsPuntedStats();
        
        
    }//close punter
    
    public static void defense(){
        //creating new object
        TeamSetting defense = new TeamSetting();
        
        System.out.println("This is our defense's yards allowed stat.");
        System.out.print("They allowed: ");
        defense.yrdsAllowedStats();
        
        
    }//close defense
    
}//close class
