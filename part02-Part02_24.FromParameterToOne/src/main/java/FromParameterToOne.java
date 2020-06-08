

public class FromParameterToOne {
    
    public static void printFromNumberToOne(int number){
        for (int i = number; i >= 1 ; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printFromNumberToOne(6);
    }

}
