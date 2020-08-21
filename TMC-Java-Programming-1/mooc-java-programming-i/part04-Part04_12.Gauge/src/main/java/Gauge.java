/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public boolean full() {
        return value == 5;
    }
    
    public int value() {
        return value;
    }
    
    public void increase() {
        if(!this.full()) {
            value++;
        }
    }
    
    public void decrease() {
        if(value > 0){
            value--;
        }
    }
}
