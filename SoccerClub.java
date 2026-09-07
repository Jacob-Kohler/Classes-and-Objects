public class SoccerClub {  //Creates a class for a Soccer club with name, goals scored, goals conceded and its league
    String clubName;
    int goalsScored;
    int goalsConceded;
    String league;

    public SoccerClub(String clubName, int goalsScored, int goalsConceded, String league) { //Constructors for the class
        this.clubName = clubName;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.league = league;

    }
    public SoccerClub() { //Sets all fields to zero or null
        this.clubName = null;
        this.goalsScored = 0;
        this.goalsConceded = 0;
        this.league = null;
    }
    public String getClubName() { //Gets and returns club name
        return clubName;
    }
    public void setClubName(String clubName) { //Sets club name
        this.clubName = clubName;
    }
    public int getGoalsScored() { //Gets and returns the number of goals scored
        return goalsScored;
    }
    public void setGoalsScored(int goalsScored) { //Sets the number of goals scored
        this.goalsScored = goalsScored;
    }
    public int getGoalsConceded() { //Gets and returns the number of goals conceded
        return goalsConceded;
    }
    public void setGoalsConceded(int goalsConceded) { //Sets the number of goals conceded
        this.goalsConceded = goalsConceded;
    }
    public String getLeague() { //Gets the league and returns the league
        return league;
    }
    public void setLeague(String league) { //Sets the league
        this.league = league;
    }

    public void goalDifference() { //Prints a clubs goal difference
        int goalDifference = goalsScored - goalsConceded; //Calculates goal difference which is goals scored subtracted by goals conceded
        System.out.println(clubName + " has a goal difference of " + goalDifference);
    }
    public void print(){ //Prints all information about a club
        System.out.println("Club Information:");
        System.out.println(clubName);
        System.out.println(goalsScored + " goals scored");
        System.out.println(goalsConceded +  " goals conceded");
        System.out.println(league);
    }

}
