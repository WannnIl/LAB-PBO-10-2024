public class SangPetarunk {
    String name;
    Sarunk sarunk = new Sarunk();
    int health = 100; // Default Health
    double coordinate;

    public SangPetarunk() {
    }

    public SangPetarunk(String name) {
        this.name = name;
    }

    public SangPetarunk(String name, String sarunkType) {
        this.name = name;
        this.sarunk.type = sarunkType;
    }

    public SangPetarunk(String name, String sarunkType, int sarunkDamage) {
        this.name = name;
        this.sarunk.type = sarunkType;
        this.sarunk.damage = sarunkDamage;
    }

    public SangPetarunk(String name, double coordinate) {
        this.name = name;
        this.coordinate = coordinate;
    }

    public SangPetarunk(String name, String sarunkType, int sarunkDamage, double coordinate) {
        this.name = name;
        this.sarunk.type = sarunkType;
        this.sarunk.damage = sarunkDamage;
        this.coordinate = coordinate;
    }

    public SangPetarunk(String name, String sarunkType, int sarunkDamage, int health, double coordinate) {
        this.name = name;
        this.sarunk.type = sarunkType;
        this.sarunk.damage = sarunkDamage;
        this.health = health;
        this.coordinate = coordinate;
    }

    public void checkStatus() {
        System.out.println("===== Sang Petarunk's Status =====");
        System.out.println("Name            : " + this.getName());
        System.out.println("Sarunk Type     : " + this.getSarunk().getType());
        System.out.println("Sarunk Damage   : " + this.getSarunk().getDamage());
        System.out.println("Health          : " + this.getHealth());
        System.out.println("Coordinate      : " + this.getCoordinate());
    }

    public void travelToCoordinate(double coordinate) {
        this.setCoordinate(coordinate);
        System.out.printf("%s is moving to coordinate: %.1f \n", this.getName(), coordinate);
    }

    public void upgradeSarunk(String type, int damage) {
        this.sarunk.type = type;
        this.sarunk.damage = damage;
        System.out.printf("%s has upgraded the sarunk to %s with %d damage \n", this.getName(), type, damage);
    }

    public void launchBattleTo(SangPetarunk enemy) {
        if (this.getCoordinate() == enemy.getCoordinate()) {
            enemy.health -= this.sarunk.getDamage();
            this.health -= enemy.sarunk.getDamage();

            if (enemy.getHealth() <= 0) {
                System.out.printf("%s has lost \n", enemy.getName());
            }

            System.out.printf("%s launch attack to %s ... \n", this.getName(), enemy.getName());
        } else {
            System.out.printf("%s and %s are in a different coordinate. Can't launch attack \n", this.getName(),
                    enemy.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sarunk getSarunk() {
        return sarunk;
    }

    public void setSarunk(Sarunk sarunk) {
        this.sarunk = sarunk;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double coordinate) {
        this.coordinate = coordinate;
    }
}
