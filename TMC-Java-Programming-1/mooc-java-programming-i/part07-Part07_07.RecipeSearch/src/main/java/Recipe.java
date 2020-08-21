
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Recipe {
    private String name;
    private int duration;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public boolean contains(String ingredient){
        return ingredients.contains(ingredient);
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.duration;
    }
}
