/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String title, int pages, int publicationYear){
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public int getPublicationYear(){
        return publicationYear;
    }
    
    public String toString(){
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
