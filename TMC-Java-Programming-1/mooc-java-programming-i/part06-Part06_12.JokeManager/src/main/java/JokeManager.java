
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
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (!jokes.isEmpty()) {
            return this.jokes.get((int) (Math.random() * jokes.size()));
        }
        
        return "Jokes are in short supply.";
    }
    
    public void printJokes() {
        for(String joke: jokes) {
            System.out.println(joke);
        }
    }
}
