/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void addMoney(double amount) {
        if(balance + amount > 150){
           balance = 150;
        } else if(amount > 0){
            balance += amount;
        }
    }
    
    public void eatAffordably() {
        if(!((balance - 2.60) < 0)){
            balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if(!((balance - 4.60) < 0)){
            balance -= 4.60;
        }
    }
}
