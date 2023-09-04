import java.util.ArrayList;
import java.util.Collections;


public class SportLeagueTable<T extends Team> {
    private String leagueName;
    ArrayList<T> league = new ArrayList<>();

    public SportLeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return this.leagueName;
    }

    public boolean addTeam(T team){
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already in the " + this.leagueName);
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " added to the " + this.leagueName);
            return true;
        }
    }

    public void printTeamStats(T team) {
        System.out.println(league.indexOf(team)+1 + ". " + team.getName() + ": Won " + team.getWon() + " Drawn " + team.getDrew() + " Lost " + team.getLost() + " Overall Score " + team.getOverallScore());
    }

    public void printLeagueTable() {
        Collections.sort(league);
        for(T t : league) {
            System.out.println(league.indexOf(t)+1 + ". " + t.getName() + ": Won " + t.getWon() + " Drawn " + t.getDrew() + " Lost " + t.getLost() + " Overall Score " + t.getOverallScore());
        }
    }


}   
