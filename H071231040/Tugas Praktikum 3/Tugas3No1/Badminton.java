import java.util.ArrayList;
import java.util.List;

public class Badminton {
    String country;
    double averageRate;
    
    Player player = new Player();
    List<Player> players = new ArrayList<>();
    
    public Badminton() {}

    public Badminton(String country, double averageRate) {
        this.country = country;
        this.averageRate = averageRate;
    }
    
    public Badminton(String country, double averageRate, String name, String gender, String raket, double rate) {
        this.country = country;
        this.averageRate = averageRate;
        this.player.name = name;
        this.player.gender = gender;
        this.player.raket = raket;
        this.player.rate = rate;
    }

    public void invitePlayer(Player player) {
        players.add(player);
        System.out.println(getCountry() + " Invite " + player.getName() + " as a new player");
        updateAverageRate();
    }

    public void updateAverageRate() {
        double totalRate = 0;
        for(Player player  : players) {
            totalRate += player.getRate();
        }

        if (players.size() > 0) {
            setAverageRate(totalRate / players.size());
        } else {
            setAverageRate(0);
        }
    }

    public void profileCountry() {
        System.out.println("==================== " + getCountry() + " Players Profiles =====================");
        for(Player player  : players) {
            System.out.println("Player's Name \t: " + player.getName());
            System.out.println("Gender \t\t: " + player.getGender());
            System.out.println("Fav. Racket \t: " + player.getRaket());
            System.out.println("Player's Rate \t: " + player.getRate() + "\n");
        }
    }

    public void launchMatchTo(Badminton enemy) {
        System.out.println();
        System.out.println("======================= Match Report =======================");
        System.out.println(this.getCountry() + " is battling against " + enemy.getCountry());

        if (this.getAverageRate() > enemy.getAverageRate()) {
            System.out.println(this.getCountry() + " have the upper hand, it will easy for them!!");
        } else if (this.getAverageRate() < enemy.getAverageRate()) {
            System.out.println(enemy.getCountry() + " have the upper hand, it will easy for them!!");
        } else {
            System.out.println("FINALLY A WORTHY OPPONENT, THIS MATCH WILL BE LEGENDARY!!!!");
        }
    }
    
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public double getAverageRate() {
        return averageRate;
    }
    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }
}
