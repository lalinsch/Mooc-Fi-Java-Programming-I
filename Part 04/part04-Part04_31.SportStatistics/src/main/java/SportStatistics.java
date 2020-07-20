
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //asks user for filename 
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> games = new ArrayList();
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;
        //initialises ints for game, wins and losses counts
        
        //reads the file and adds it to an ArrayList of the type Game (comma separated)
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] gameData = line.split(",");
                games.add(new Game(gameData[0], gameData[1], Integer.valueOf(gameData[2]), Integer.valueOf(gameData[3])));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //asks user what team they want to find data from
        System.out.println("Team:");
        String team = scan.nextLine();

        //finds how many games each team has played by looking at the input
        for (Game g : games) {
            //performs the object methods to calculate winners and losers
            g.getWinner();
            g.getLoser();
            if (g.getHomeTeam().equals(team) || g.getAwayTeam().equals(team)) {
                gameCount++;
            }
            
            //counts how many times the team has been winner
            if (g.getWinner().equals(team)) {
                winCount++;
            }
            //counts how many teams the team has been a loser
            if (g.getLoser().equals(team)) {
                lossCount++;
            }

        }
        
        //prints results to user
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);

    }

}
