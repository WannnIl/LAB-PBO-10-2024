package TugasPraktikum3.Tugas3No1;

public class Weapon {
    String name;
    int attackPower;

    Weapon(String name) {
        this.name = name;
    }

    Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
    
    void display() {
        System.out.print("Weapon \t     : " + this.name + "\nWeapon Power : " + this.attackPower + "\n");
        line();
    }

    public void line() {    
        System.out.print("======================================================================");
    }

}
