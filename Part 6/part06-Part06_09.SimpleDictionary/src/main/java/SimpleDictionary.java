import java.util.ArrayList;
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    //Gets the input's word, otherwise returns error message
    public String translate(String word) {
        if (translations.containsKey(word)){
         return translations.get(word);   
        } else {
            return "Word " + word + " was not found";
        }    
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
    
    public int dictionarySize(){
        return this.translations.size();
    }
    
    //adds every key from the map to an ArrayList of the type string in the right format.
    public ArrayList<String> listOfWords(){
        ArrayList<String> list = new ArrayList<>();
        for (String word : this.translations.keySet()){
            list.add(word + " = " + translations.get(word));
        }
        return list;
    }
}
