package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class SaveableDictionary {

    //instance variables
    //since we are usign word pairs, we will be using an arraylist that contains String arrays
    private ArrayList<String[]> dictionary;
    private File file;

    //consturctor without a file path
    public SaveableDictionary() {
        this.dictionary = new ArrayList<>();
    }

    //constructor with a file pathm, starts the dictionary and specifies the location of the file
    public SaveableDictionary(String fileName) {
        this.dictionary = new ArrayList<>();
        this.file = new File(fileName);
    }

    public boolean load() {
        try {
            //A scanner is used to read the specific file given in the constructor
            Scanner fileReader = new Scanner(Paths.get(this.file.getName())); //loads the file
            //goes throw everyline of the document and splits the words into two
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]); //adds them to our dictionary
            }
            return true; //if this is exectued this returns true
            
            //otherwise it throws an exception and returns false
        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            //uses the printwrite object to create the new file
            PrintWriter pw = new PrintWriter(this.file.getName());
            for (String[] s : this.dictionary) {
                //looks at each word pair (array) in the dictionary and adds it to the document in the
                //specified format 'word:translation' on each line
                String word = s[0];
                String translation = s[1];
                pw.println(word + ":" + translation);
            }
            //closes the printwriter object
            pw.close();
            //once this code is executed succesfully it returns true
            return true;
            
        } catch (Exception e) {
            //finds any excpeitons thrown by printwriter
            System.out.println(e.getMessage());
            return false;
        }

    }

    //uses two strings to add the word pair to our dictionary
    public void add(String words, String translation) {
        //splits the words into a string array
        String[] wordPair = new String[2];
        wordPair[0] = words; 
        wordPair[1] = translation;
        this.dictionary.add(wordPair); //once the array is created, it adds it to the dictionary
    }

    public String translate(String word) {
        //looks at every string array in the dictionary and looks for a word in either language (on both indices)
        for (String[] s : this.dictionary) {
            //by chekcing if the string paramter matches either the index 0 or 1, we can translate to both languages
            if (s[0].equals(word)) {
                return s[1];
            }
            if (s[1].equals(word)) {
                return s[0];
            }
        }
        return null;
    }

    //looks for a word in either index of the array, and if it's found it removes the word pair from the dictionary
    public void delete(String word) {
        for (int i = 0; i < this.dictionary.size(); i++) {
            if (this.dictionary.get(i)[0].equals(word) || this.dictionary.get(i)[1].equals(word)) {
                this.dictionary.remove(i);
            }
        }
    }

}
