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

    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;

    public Game(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public String getWinner() {
        if (this.homePoints > this.awayPoints) {
            return this.homeTeam;
        } else {
            return this.awayTeam;
        }
    }

    public String getLoser() {
        if (this.homePoints > this.awayPoints) {
            return this.awayTeam;
        } else {
            return this.homeTeam;
        }
    }

    @Override
    public String toString() {
        return "Score: H: " + this.homeTeam + " " + this.homePoints + " vs " + this.awayPoints + " A:" + this.awayTeam + "\n";
    }

}
