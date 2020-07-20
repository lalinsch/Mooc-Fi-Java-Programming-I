
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class UI {

    private Scanner scan;
    private Grades grades;

    //UI constructor, requires a Grades object and a scanner
    public UI(Scanner scan) {
        this.scan = scan;
        this.grades = new Grades();
    }

    //starts the program
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            //loops through the scanner and stores the values on the Grades list
            int grade = Integer.valueOf(scan.nextLine());

            //when the user inputs -1, it calls all the different grades methods required in order
            if (grade == -1) {
                this.grades.printGrades();
                this.grades.printPassingGrades();
                this.grades.printPassPercentage();
                this.grades.printGradeDistribution();
                break;
            }

            //stores the values on the Grade object
            this.grades.add(grade);
        }

    }

}
