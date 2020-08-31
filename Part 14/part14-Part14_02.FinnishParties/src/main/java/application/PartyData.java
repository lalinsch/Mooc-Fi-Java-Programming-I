package application;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author laloschjetnan
 */

//The purpose of this class is to parse the file which contains the data as tab separated values, using a 
//hashmap, we are able to load and organise all the data before the application launches
public class PartyData {

    //these are the instance variables for the class
    Scanner fileReader;
    Map<String, Map<Integer, Double>> dataEntries;

    public PartyData(String fileName) throws Exception {
        this.fileReader = new Scanner(Paths.get(fileName)); //the scanner will read the file that is passed on the constructor
        this.dataEntries = new HashMap<>();//this creates the hashmap
    }

    //this method will go through the file to read all the data and organise it in the hashmap
    public void readFile() {
        
        //first, we read the first line of the document and split it by tabs "\t", 
        //we can then convert that array to Integer since it contains years data
        String dataSeries = fileReader.nextLine();
        String[] firstLine = dataSeries.split("\t");
        Integer[] years = IntStream.range(1, firstLine.length)
                .mapToObj(i -> Integer.valueOf(firstLine[i]))
                .toArray(Integer[]::new);

        //to read the rest of the document, we will use a while loop, that goes through each line of the 
        //document, gathering data for each party in each year
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split("\t");
            String partyName = parts[0]; //takes the first element in each line and gives it the variable partyName
            Map<Integer, Double> yearAndData = new HashMap<>(); //creates the inner map, where it links the year and the value
            
            //this inner for loop goes through each element and converts it to a double, 
            //if there are no data it specifies the value as 0.0
            //once it's done it adds it all to our inner map yearAndData
            for (int i = 0; i < years.length; i++) {
                if (parts[i + 1].equals("-")) {
                    parts[i + 1] = "0.0";
                } 
                yearAndData.put(years[i], Double.valueOf(parts[i+1]));
            }
            //once it's finished creating the inner map, it adds both the party name and the inner map to our main hashmap
            this.dataEntries.put(partyName, yearAndData);
        }
    }

    //returns the completed hashmap
    public Map getData() {
        return this.dataEntries;
    }
 
    

}
