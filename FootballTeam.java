public class FootballTeam { //Creates class FootballTeam with a team name, number of wins, number of losses, and the stadiumName
    String teamName;
    int wins;
    int losses;
    String stadiumName;

    public FootballTeam(String teamName, int wins, int losses, String stadiumName) { // Constructors for the class
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.stadiumName = stadiumName;

    }
    public FootballTeam() { //Set all fields to zero or null
        this.teamName = null;
        this.wins = 0;
        this.losses = 0;
        this.stadiumName = null;

    }

    public String getTeamName() { //Gets and returns team name

        return teamName;
    }
    public void setTeamName(String teamName) { //Sets team name

        this.teamName = teamName;
    }
    public int getWins() { //Gets and returns number of wins

        return wins;
    }
    public void setWins(int wins) { //Sets number of wins

        this.wins = wins;
    }
    public int getLosses() { //Gets and returns number of losses
        return losses;
    }
    public void setLosses(int losses) { //Sets number of losses

        this.losses = losses;
    }
    public String getStadiumName() { //Gets and returns the stadiumName

        return stadiumName;
    }
    public void setStadiumName(String stadiumName) { //Sets the stadiumName

        this.stadiumName = stadiumName;
    }

    public void teamRecord () { //Prints the team record
        System.out.println(teamName + " has a record of " + wins + " wins and " + losses + " losses");
    }
    public void print(){ //Prints all the team information
        System.out.println("Team Information:");
        System.out.println(teamName);
        System.out.println(wins + " wins");
        System.out.println(losses  + " losses");
        System.out.println(stadiumName);
    }
}
