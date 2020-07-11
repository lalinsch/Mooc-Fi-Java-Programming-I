/**
 *
 * @author laloschjetnan
 */
public class Book {
    private String title;
    private int recommendedAge;
    
    //Book class constructor
    public Book(String title, int recommendedAge){
        this.title = title;
        this.recommendedAge = recommendedAge;
    }
    
    //Getters
    public String getTitle(){
        return this.title;
    }
    
    public int getRecommendedAge(){
        return this.recommendedAge;
    }
    
    
    //Specifies how the book object should be printed to the console
    @Override
    public String toString(){
        return this.title.trim() + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }

}
