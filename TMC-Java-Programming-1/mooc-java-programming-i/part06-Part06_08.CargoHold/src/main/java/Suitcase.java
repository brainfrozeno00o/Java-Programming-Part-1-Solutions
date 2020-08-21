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

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight) {
        items = new ArrayList();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        int currentWeight = this.totalWeight();
        
        if(currentWeight + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }
    
    public String toString() {
        int currentWeight = this.totalWeight();
        
        String toReturn = "";
        
        if(items.isEmpty()) {
            toReturn = "no items (" + currentWeight + " kg)";
        } else if(items.size() == 1) {
            toReturn = "1 item (" + + currentWeight + " kg)";
        } else {
            toReturn = items.size() + " items (" + currentWeight + " kg)";
        }

        return toReturn;
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        
        if(!items.isEmpty()) {
            for(Item i : items) {
                currentWeight += i.getWeight();
            }
        }
        
        return currentWeight;
    }
    
    public Item heaviestItem() {
        
        if(!items.isEmpty()) {
            int heaviest = 0;
            Item heaviestItem = null;
            for(int i = 0; i < items.size(); i++) {
                if(items.get(i).getWeight() > heaviest) {
                    heaviest = items.get(i).getWeight();
                    heaviestItem = items.get(i);
                }
            }
            return heaviestItem;
        }
        
        return null;
    }
}
