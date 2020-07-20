
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hm = new HashMap<>();

    }
    
    //method that takes a hashmap as a parameter and then does a for loop to print all of its keys
    public static void printKeys(HashMap<String, String> hashmap){
        for (String key : hashmap.keySet()){
            System.out.println(key);
        }
    }
    
    //method that takes a hashmap and a string and looks for any keys that contain the string, and prints the key
    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        for (String key : hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }
    
    //similar method as the previous one but it prings out the value of that key from the map.
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text){
        for (String key : hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

}
