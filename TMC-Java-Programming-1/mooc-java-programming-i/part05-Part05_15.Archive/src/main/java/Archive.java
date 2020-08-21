/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Archive {
    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifer() {
        return identifier;
    }
    
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Archive)) {
            return false;
        }

        // let's cast the object to SimpleDate
        Archive otherArchive = (Archive) compared;

        // if the object's values are the same, the objects are the same
        return this.identifier.equals(otherArchive.identifier);
    }

    public String toString(){
        return identifier + ": " + name;
    }
}
