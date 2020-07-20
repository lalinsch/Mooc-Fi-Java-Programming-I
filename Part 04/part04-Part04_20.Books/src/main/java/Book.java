/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
public class Book {
    //book class parameters 
    private String title;
    private int pages;
    private int year;
    
    //book constructor
    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    //getters
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getYear(){
        return this.year;
    }
    
    //toString method to return all the info in the requested format
    @Override
    public String toString(){
        return getTitle() + ", " + getPages() + " pages, " + getYear();
    }
    
}
