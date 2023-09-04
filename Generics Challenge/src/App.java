

// Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

public class App {
    public static void main(String[] args) throws Exception {
        Team<Football> liverpoolFC = new Team<>("Liverpool FC");
        Team<Football> manchesterCity = new Team<>("Manchester City");
        Team<Football> chelseaFC = new Team<>("Chelsea");
        Team<Football> manchesterUnited = new Team<>("Manchester United");
        Team<Football> tottenhamHotspur = new Team<>("Tottenham Hotspur");
        Team<Football> arsenal = new Team<>("Arsenal");

        SportLeagueTable<Team<Football>> premierLeague = new SportLeagueTable<>("Premier League");

        premierLeague.addTeam(liverpoolFC);
        premierLeague.addTeam(manchesterCity);
        premierLeague.addTeam(chelseaFC);
        premierLeague.addTeam(manchesterUnited);
        premierLeague.addTeam(tottenhamHotspur);
        premierLeague.addTeam(arsenal);

        liverpoolFC.matchResult(chelseaFC, 3, 2);
        liverpoolFC.matchResult(manchesterCity, 2, 2);
        liverpoolFC.matchResult(manchesterUnited, 4, 0);
        liverpoolFC.matchResult(tottenhamHotspur, 2, 2);
        liverpoolFC.matchResult(arsenal, 2, 0);

        manchesterCity.matchResult(chelseaFC, 2, 0);
        manchesterCity.matchResult(manchesterUnited, 3, 0);
        manchesterCity.matchResult(tottenhamHotspur, 3, 4);
        manchesterCity.matchResult(arsenal, 2, 1);

        chelseaFC.matchResult(manchesterUnited, 2, 1);
        chelseaFC.matchResult(tottenhamHotspur, 2, 1);
        chelseaFC.matchResult(arsenal, 1, 2);

        manchesterUnited.matchResult(tottenhamHotspur, 2, 3);
        manchesterUnited.matchResult(arsenal, 2, 2);

        tottenhamHotspur.matchResult(arsenal, 1, 2);

        premierLeague.printLeagueTable();

        premierLeague.printTeamStats(chelseaFC);

    }

    
}
