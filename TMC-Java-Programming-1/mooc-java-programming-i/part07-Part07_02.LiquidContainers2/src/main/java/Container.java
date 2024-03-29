/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Container {
    private int amount;
    
    public Container(){
        this.amount = 0;
    }
    
    public void add(int amount){
        if (amount > 0) {
            if (this.amount + amount > 100){
                this.amount = 100;
            } else {
                this.amount += amount;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (this.amount - amount < 0) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }
        }
    }
    
    public int contains() {
        return this.amount;
    }
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
