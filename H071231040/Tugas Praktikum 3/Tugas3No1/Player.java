public class Player {
    String name, gender, raket;
    double rate;
    
    public Player() {}
    
    public Player(String name, String gender, String raket, double rate) {
        this.name = name;
        this.gender = gender;
        this.raket = raket;
        this.rate = rate;
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getRaket() {
        return raket;
    }
    public void setRaket(String raket) {
        this.raket = raket;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
