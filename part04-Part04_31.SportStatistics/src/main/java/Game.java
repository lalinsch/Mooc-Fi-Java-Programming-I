/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
public class Game {

    //game attributes
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;

    //game constructor (useful for adding that to the arraylist later on)
    public Game(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    //getters
    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    // figures out the winner for a game
    public String getWinner() {
        if (this.homePoints > this.awayPoints) {
            return this.homeTeam;
        } else {
            return this.awayTeam;
        }
    }

    //figures out the loser for a game
    public String getLoser() {
        if (this.homePoints > this.awayPoints) {
            return this.awayTeam;
        } else {
            return this.homeTeam;
        }
    }

    //not used in this exercise but useful to display the data more clearly to the user 
    @Override
    public String toString() {
        return "Score: H: " + this.homeTeam + " " + this.homePoints + " vs " + this.awayPoints + " A:" + this.awayTeam + "\n";
    }

}
