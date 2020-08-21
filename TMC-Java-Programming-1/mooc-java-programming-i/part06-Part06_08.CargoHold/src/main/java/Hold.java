/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList();
    }
    
    //own helper methods
    public int totalWeight() {
        int currentWeight = 0;
        
        if(!suitcases.isEmpty()) {
            for(Suitcase i : suitcases) {
                currentWeight += i.totalWeight();
            }
        }

        return currentWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = this.totalWeight();

        if(suitcase.totalWeight() + currentWeight <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int currentWeight = this.totalWeight();
        
        String toReturn = "";
        
        if(suitcases.isEmpty()) {
            toReturn = "no suitcases (" + currentWeight + " kg)";
        } else if(suitcases.size() == 1) {
            toReturn = "1 suitcase (" + + currentWeight + " kg)";
        } else {
            toReturn = suitcases.size() + " suitcases (" + currentWeight + " kg)";
        }

        return toReturn;
    }
    
    public void printItems() {
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }
}
