/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;

/**
 *
 * @author 14127
 */
public class TeamSetting {
    
    public String playerName;
     
    public boolean teamCaptain;
    public boolean QB;
    public boolean RB;
    public boolean WR;
    public boolean TE;
    public boolean OL;
    public boolean DE;
    public boolean DT;
    public boolean LB;
    public boolean CB;
    public boolean K;
    public boolean P;
    public boolean DEF;
    
   
    public void passingStats(){
    
    int min = 2000;
        int max = 4000;
        
        int random_passing = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_passing);
        
}//close passingStats
    
    public void passingTouchdowns(){
        
        int min = 15;
        int max = 40;
        
        int random_passingtouchdowns = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_passingtouchdowns);
        
    }
    public void interceptionsThrown(){
        
        int min = 1;
        int max = 23;
        
        int random_ints = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_ints);
        
    }//close interceptionsThrown
    public void catches(){
        
        int min = 20;
        int max = 110;
        
        int random_catches = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_catches);
        
    }//close catches
    public void recievingStats(){
        
        int min = 500;
        int max = 1000;
        
        int random_recieving = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_recieving);
        
    }//close receivingStats
    public void recievingTouchdowns(){
        
        int min = 2;
        int max = 15;
        
        int random_recievingtouchdowns = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_recievingtouchdowns);
        
    }
    public void rushingStats(){
    
        int min = 50;
        int max = 750;
        
        int random_rushing = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_rushing);
        
}//close rushing
    public void rushingTouchdowns(){
        
        int min = 8;
        int max = 15;
        
        int random_rushingtouchdowns = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_rushingtouchdowns);
        
    }
    public void fumbles(){
        
        int min = 0;
        int max = 8;
        
        int random_fumbles = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_fumbles);
        
    }
    public void sacksAllowedStats(){
        
        int min = 0;
        int max = 10;
        
        int random_sacksAllowed = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_sacksAllowed);
        
    }
    public void sackStats(){
        
        int min = 0;
        int max = 18;
        
        int random_sacks = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_sacks);
        
    }
    public void tackleStats(){
        
        int min = 15;
        int max = 110;
        
        int random_tackles = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_tackles);
        
    }
    public void interceptionStats(){
        
        int min = 0;
        int max = 8;
        
        int random_interceptions = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_interceptions);
        
    }
    public void fgAttemptedStats(){
        
        int min = 10;
        int max = 30;
        
        int random_fgAttemped = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_fgAttemped);
        
    }
    public void fgMadeStats(){
        
        int min = 10;
        int max = 30;
        
        int random_fgMade = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_fgMade);
        
    }
    public void yrdsPuntedStats(){
        
        int min = 500;
        int max = 1500;
        
        int random_yrdsPunted = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_yrdsPunted);
        
    }
    public void yrdsAllowedStats(){
        
        int min = 2500;
        int max = 5000;
        
        int random_yrdsAllowed = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_yrdsAllowed);
        
    }
    
    
}// close class teamsetting
