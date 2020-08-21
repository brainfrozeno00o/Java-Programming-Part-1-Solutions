/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Timer {
    private int seconds;
    private int hundredths;
    
    public Timer(){
        this.seconds = 0;
        this.hundredths = 0;
    }
    
    public void advance(){
        hundredths = hundredths + 1;
        if(hundredths >= 100){
            hundredths = 0;
            seconds = seconds + 1;
            if(seconds >= 60){
                seconds = 0;
            }
        }
    }
    
    public String toString(){
        String fullSeconds = "";
        String fullHundredths = "";
        
        if(seconds < 10){
            fullSeconds = "0" + seconds;
        } else {
            fullSeconds = Integer.toString(seconds);
        }
        
        if(hundredths < 10) {
            fullHundredths = "0" + hundredths;
        } else {
            fullHundredths = Integer.toString(hundredths);
        }
        
        return fullSeconds + ":" + fullHundredths;
    }
}
