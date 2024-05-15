package TugasPraktikum3.Tugas3No1;

public class Main {
    public static void line() {
        System.out.print("======================================================================");
    }
    public static void main(String[] args) {
        Weapon w1 = new Weapon("Pegasus Fury", 500);
        Legend player1 = new Legend("Pegasus", 1000, 1, 2);
        
        Weapon w2 = new Weapon("Celestial Storm");
        w2.setAttackPower(800);
        Legend player2 = new Legend("Orion", 1000, 1, 3);

        player1.equipWeapon(w1);
        player2.equipWeapon(w2);
        line();
        
        player1.display();
        player2.display();

        player1.attack(player2);

        player1.setPosition(3);
        player1.movePosition();

        player1.attack(player2);
        player2.displayAfterAttack();

        player2.attack(player1);
        player1.displayAfterAttack();

        player1.winLoseInfo(player2);

        player1.levelUp();
        player1.display();

        player1.attack(player2);

        player1.winLoseInfo(player2);


    }
}
