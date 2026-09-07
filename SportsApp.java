/* Jacob Kohler
COP 3330
09/06/26
 */
//The program takes information about either a soccer club or football team and prints the information.
/*The user is able to soccer club name, goals scored, goals conceded, and the teams current league.
The program then returns that information and calculates goal difference
The user is able to enter the football team name, number of wins, number of losses, and stadium name.
The program then returns that as well as the teams record
*/
public class SportsApp { //Creates SportsApp class


    public static void main(String[] args) {

        SoccerClub soccerClub = new SoccerClub( //Creats Soccer Club object and assigns values
                "Manchester United",
                50,
                12,
                "Premier League"
        );

        FootballTeam footballTeam = new FootballTeam( //Creates Football Team object and assigns values
                "Atlanta Falcons",
                7,
                2,
                "Mercedes Benz Stadium"

        );

        System.out.println();
        soccerClub.print(); //Prints soccer club information
        soccerClub.goalDifference(); //Prints goal difference


        System.out.println();
        footballTeam.print(); //Prints Football Team information
        footballTeam.teamRecord(); //Prints the team record

        soccerClub.setGoalsScored(53); //Updates the goals scored

        footballTeam.setLosses(3); //Updates the team losses

        System.out.println();
        soccerClub.print(); //Prints the updated information
        soccerClub.goalDifference();

        System.out.println();
        footballTeam.print(); //Prints the updated information
        footballTeam.teamRecord();



    }

}