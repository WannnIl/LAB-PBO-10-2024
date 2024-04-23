public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.name = "Anthony S Ginting";
        player1.gender = "Male";
        player1.raket = "Li-ning";
        player1.rate = 4.5;

        Player player2 = new Player("Jonatan Christie", "Male", "Yonex", 4.0);
        Player player3 = new Player("Kevin Sanjaya", "Male", "Victor", 4.5);
        Player player4 = new Player("Marcus Gideon", "Male", "Yonex", 4.0);
        Player player5 = new Player("Susi Susanti", "Female", "Li-ning", 4.5);

        Badminton country1 = new Badminton();
        country1.country = "Indonesia";
        country1.averageRate = 0;

        line();
        country1.invitePlayer(player1);
        country1.invitePlayer(player2);
        country1.invitePlayer(player3);
        country1.invitePlayer(player4);
        country1.invitePlayer(player5);
        line();
        country1.profileCountry();

        Player player6 = new Player("Kento Momota", "Male", "Yonex", 4.5);
        Player player7 = new Player("Yuta Watanabe", "Male", "Victor", 4.0);
        Player player8 = new Player("Yugi Kobayashi", "Male", "Yonex", 4.5);
        Player player9 = new Player("Rena Miyaura", "Female", "Li-ning", 4.0);
        Player player10 = new Player("Ayane Kurihara", "Female", "Li-ning", 4.5);

        Badminton country2 = new Badminton("Japan", 0);

        line();
        country2.invitePlayer(player6);
        country2.invitePlayer(player7);
        country2.invitePlayer(player8);
        country2.invitePlayer(player9);
        country2.invitePlayer(player10);
        line();
        country2.profileCountry();


        country1.launchMatchTo(country2);
        line();
    }

    public static void line() {
        System.out.println("=".repeat(60));
    }
}
