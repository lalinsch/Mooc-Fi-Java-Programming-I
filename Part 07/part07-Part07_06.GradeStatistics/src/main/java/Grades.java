
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Grades {

    //3 different lists based on the value of each grade
    private ArrayList<Integer> grades = new ArrayList<>(); //contains all grades 
    private ArrayList<Integer> passingGrades = new ArrayList<>(); //contains all passing grades
    private ArrayList<Integer> results = new ArrayList<>(); //contains the grades based on their value (0,1,3,4,5)

    public Grades() {

    }

    public void add(int grade) {
        //checks that the input is valid (between 0 and 100)
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);

            //if the grade is larger than 50, it also adds it to the passing grades list
            if (grade >= 50) {
                this.passingGrades.add(grade);
            }

            //checks the value and adds it to the results list based on its grade value
            if (grade < 50) {
                this.results.add(0);
            } else if (grade >= 50 && grade < 60) {
                this.results.add(1);
            } else if (grade >= 60 && grade < 70) {
                this.results.add(2);
            } else if (grade >= 70 && grade < 80) {
                this.results.add(3);
            } else if (grade >= 80 && grade < 90) {
                this.results.add(4);
            } else if (grade >= 90) {
                this.results.add(5);
            }
        }
    }

    //returns the sum of all the elements in the grades list (useful for calculating average)
    public int sum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    //same method but for the passing grades list
    public int passingSum() {
        int sum = 0;
        for (int grade : passingGrades) {
            sum += grade;
        }
        return sum;
    }

    //Methods for calculating averages: 
    public double average() {
        return 1.0 * sum() / this.grades.size();
    }

    public double passingAverage() {
        return 1.0 * passingSum() / this.passingGrades.size();
    }

    //Converts the size of the lists for doubles and returns the percentage as a double
    public double getPassPercentage() {
        double pass = this.passingGrades.size();
        double participants = this.grades.size();
        return 100 * pass / participants;

    }

    //prints out to the console the average of all grades based on the calculations above
    public void printGrades() {
        if (this.grades.size() > 0) {
            System.out.println("Point average (all): " + average());
        } else {
            System.out.println("-");;
        }
    }

    //prints the average of passing grades based on the calculations above
    public void printPassingGrades() {
        if (this.passingGrades.size() > 0) {
            System.out.println("Point average (passing): " + passingAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    //gets the pass percentage and prints it in the specified format
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + getPassPercentage());
    }

    //looks at the results list(which stores the grades based on their results)
    //and returns the counts (will be used for printing stars)
    public int countGrades(int query) {
        int count = 0;
        for (int grade : results) {
            if (grade == query) {
                count++;
            }
        }
        return count;
    }

    //method that takes an int value and prints that number in '*'
    public void printStars(int value) {
        for (int i = 0; i < value; i++) {
            System.out.print("*");
        }
    }

    //for grade distribution
    public void printGradeDistribution() {
        System.out.println("Grade Distribution: ");

        //the for loops decreases after each round and prints the value and the number of stars
        //based on the countGrades method
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(countGrades(i));
            System.out.println("");
        }
    }

}
