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

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        people = new ArrayList();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (!people.isEmpty()) {
            if(people.size() == 1) {
                return people.get(0);
            } else {
                int shortest = people.get(0).getHeight();
                Person shortestPerson = people.get(0);
                for(int i = 1; i < people.size(); i++) {
                    if (people.get(i).getHeight() < shortest) {
                        shortest = people.get(i).getHeight();
                        shortestPerson = people.get(i);
                    }
                }
                return shortestPerson;
            }
        }
        return null;
    }
    
    public Person take() {
        if (!people.isEmpty()) {
            if(people.size() == 1) {
                Person temp = people.get(0);
                people.remove(0);
                return temp;
            } else {
                int shortest = people.get(0).getHeight();
                Person shortestPerson = people.get(0);
                int index = 0;
                for(int i = 1; i < people.size(); i++) {
                    if (people.get(i).getHeight() < shortest) {
                        shortest = people.get(i).getHeight();
                        shortestPerson = people.get(i);
                        index = i;
                    }
                }
                people.remove(index);
                return shortestPerson;
            }            
        }
        return null;
    }
}
