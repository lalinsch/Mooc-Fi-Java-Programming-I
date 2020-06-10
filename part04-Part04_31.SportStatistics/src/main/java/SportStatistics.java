
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> games = new ArrayList();
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] gameData = line.split(",");
                games.add(new Game(gameData[0], gameData[1], Integer.valueOf(gameData[2]), Integer.valueOf(gameData[3])));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String team = scan.nextLine();

        //finds how many games each team has played by looking at the input
        for (Game g : games) {
            g.getWinner();
            g.getLoser();
            if (g.getHomeTeam().equals(team) || g.getAwayTeam().equals(team)) {
                gameCount++;
            }

            if (g.getWinner().equals(team)) {
                winCount++;
            }

            if (g.getLoser().equals(team)) {
                lossCount++;
            }

        }
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);

    }

}
