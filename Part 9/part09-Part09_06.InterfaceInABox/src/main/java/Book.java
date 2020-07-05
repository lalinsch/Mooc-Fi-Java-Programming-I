/**
 *
 * @author laloschjetnan
 */
public class Book implements Packable{

    private String author;
    private String title; 
    private double weight;
    
    //constructor
    public Book(String author, String title, double weight){
        this.author = author;
        this.title = title;
        this.weight = weight;
    }
    
    //includes the interface method 
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.author + ": " + this.title;
    }
    
}
