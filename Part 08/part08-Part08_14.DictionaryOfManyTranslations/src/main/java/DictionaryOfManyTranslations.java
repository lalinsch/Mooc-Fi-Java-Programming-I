
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author laloschjetnan
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        //if the word hasn't been added to dictionary, it creates a new ArrayList
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        //it then sets a translation list for the specified word and adds the new translation
        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate (String word){
        //checks if the word exists in the dictionary and returns the arraylist with translations
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        //otherwise it returns an empty array list
       return new ArrayList<>();
    }
    
    //removes the specified word from the dictionary
    public void remove(String word){
        this.dictionary.remove(word);
    }
    
    

}
