
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        
        //test code
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println("Manhattan: " + manhattanStudioApt.getPrice() + " Atlanta: " + atlantaTwoBedroomApt.getPrice());
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // flase
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true

    }
}
