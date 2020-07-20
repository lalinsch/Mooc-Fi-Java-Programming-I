/**
 *
 * @author laloschjetnan
 */
public class CD implements Packable{
    private String artist;
    private String albumTitle;
    private int year; 
    private double weight;
    
    //constructor
    public CD(String artist, String albumTitle, int year){
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.year = year;
        this.weight = 0.1;
    }
    
    //includes the interface method
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.albumTitle + " (" + this.year + ")";
    }
    
    

}
