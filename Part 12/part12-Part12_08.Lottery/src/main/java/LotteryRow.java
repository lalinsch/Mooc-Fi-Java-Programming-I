
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        // Implement the random number generation here
        // the method containsNumber is probably useful
        
        this.numbers = new ArrayList<>();
        Random randy = new Random(); //starts a random obkject 
        int number = 1; //starts the first lottery number index
        while (number <= 7){ //repeats the same process 7 times to get a set of lottery numbers 
            int randomNumber = randy.nextInt(40) + 1; //generates a random int betweeen 1-40(inclusive)
            //if this number already exists in the list, it ignores it and repeats until a unique number is thrown
            if(containsNumber(randomNumber)){ 
                continue;
            }
            //once we have a new unique number, it's added to our arraylsit
            this.numbers.add(randomNumber);
            number++; //and we move on to the next number
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

