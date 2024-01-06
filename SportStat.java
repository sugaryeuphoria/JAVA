/*
Design and implement a set of classes that keep track of various
sports statistics. Create a driver class to instantiate and exercise several of
the classes.
*/
abstract class Sport {
    private String name;
    private int score;
    private int numOfPlayers;

    public Sport(String name, int numOfPlayers) {
        this.name = name;
        this.numOfPlayers = numOfPlayers;
        this.score = 0;
    }

    public void incrementScore() {
        this.score++;
    }

    public void decrementScore() {
        this.score--;
    }

    public void resetScore() {
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public int getScore() {
        return score;
    }
}

class Football extends Sport {
    private int goals;
    private int fouls;

    public Football(String name, int numOfPlayers, int goals, int fouls) {
        super(name, numOfPlayers);
        this.goals = goals;
        this.fouls = fouls;
    }

    public int getGoals() {
        return goals;
    }

    public int getFouls() {
        return fouls;
    }
}

public class SportStat {
    public static void main(String[] args) {
        Football ball = new Football("Manchester United", 11, 10, 2);
        System.out.println(ball.getGoals()+ " " +ball.getFouls()+ " " +ball.getName()+ " " +ball.getScore()+ " " +ball.getNumOfPlayers());
    }
}
