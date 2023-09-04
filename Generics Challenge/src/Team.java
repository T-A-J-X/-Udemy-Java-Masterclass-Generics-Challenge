public class Team<T> extends Football implements Comparable<Team<T>> {

    private String name; 
    int played;
    int won;
    int drew;
    int lost;
    int score;
    
    public Team(String name) {
        super(name);
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPlayed() {
        return this.played;
    }

    public int getWon() {
        return this.won;
    }

    public int getDrew() {
        return this.drew;
    }

    public int getLost() {
        return this.lost;
    }

    public int getOverallScore() {
        score = (getWon()*3) + (getDrew());
        return this.score;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){//<T> specifies that this method will only parse the same class as the instantiated object
        String message;

        if (ourScore>theirScore) {
            won++;
            //score+=3;
            message = " beat "; 
        } else if (ourScore == theirScore) {
            drew++;
            //score+=1;
            message = " drew with ";
        } else  {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }
    
    @Override
    public int compareTo(Team<T> team) {
        if (this.getOverallScore() > team.getOverallScore()) {
            return -1;
        } else if (this.getOverallScore() < team.getOverallScore()) {
            return 1;
        } else {
            return 0;
        }
        
    }
}
