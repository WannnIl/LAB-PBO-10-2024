package TugasPraktikum3.Tugas3No1;

public class Legend {
    String name;
    int health;
    int level;
    int position;
    Weapon weapon;

    Legend(String name, int health, int level, int position) {
        this.name = name; 
        this.health = health <= 0 ? 0 : health;
        this.level = level;
        this.position = position;
    }

    Legend(String name, int level, int position) {
        this.name = name;
        this.level = level;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health <= 0 ? 0 : health;
    }
    
    public int getLevel() {
        return level;
    }
    
    public int getPosition() {
        return position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }    
    
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void line() {
        System.out.print("======================================================================");
    }

    public void display() {
        System.out.println("\nName         : " + this.getName());
        System.out.println("Health       : " + this.getHealth() + " HP");
        System.out.println("Level        : " + this.getLevel());
        System.out.println("Position     : " + this.getPosition());
        this.weapon.display();
    }
    
    public void displayAfterAttack() {
        System.out.println("\nName                   : " + this.getName());
        System.out.println("Remaining Health       : " + this.getHealth() + " HP");
        line();
    }
    
    void attack(Legend enemy) {
        if(this.getPosition() == enemy.getPosition()) {
            enemy.health -= this.weapon.getAttackPower();
            System.out.printf("\n%s menyerang %s...\n",this.getName(),enemy.getName());
            line();
            System.out.printf("\n%s menerima %d damage. Tersisa %d HP !\n", enemy.getName(), weapon.getAttackPower(), enemy.getHealth());
            line();
                
        } else { 
            System.out.printf("\n%s dan %s berada di lane yang berbeda. Tidak bisa Adu Mekanik!\n", this.getName(),enemy.getName());
            line();
        }
    } 
    
    public void movePosition() {
        this.setPosition(position);
        System.out.printf("\n%s bergerak ke posisi --> %d\n",this.getName(), position);
        line();
    }

    public void levelUp() {
        this.level ++;
        health += 200;
        System.out.printf("\n%s Naik level --> %d. HP meningkat!\n",this.getName(),this.getLevel());
        line();
    }

    public void winLoseInfo(Legend enemy) {
        if(this.getHealth() <= 0) {
            System.out.printf("\n%s telah dikalahkan. %s Menang!\n", this.getName(), enemy.getName());
            System.out.println(">>>>>>>STATUS<<<<<<<");
            System.out.println("\nName       : " + enemy.getName());
            System.out.println("Last Health  : " + enemy.getHealth() + " HP");
            System.out.println("Last Level   : " + enemy.getLevel());
            System.out.println("Last Position: " + enemy.getPosition());
            enemy.weapon.display();
            line();
        } else if(enemy.getHealth() <= 0) {
            System.out.printf("\n%s telah dikalahkan. %s Menang!\n", enemy.getName(), this.getName());
            line();
            System.out.println("\n>>>>>>>STATUS<<<<<<<");
            System.out.println("Name         : " + this.getName());
            System.out.println("Last Health  : " + this.getHealth() + " HP");
            System.out.println("Last Level   : " + this.getLevel());
            System.out.println("Last Position: " + this.getPosition());
            this.weapon.display();
        } else {
            System.out.println("\nBATTLE MASIH BERLANGSUNG!!!");
            line();
        }
    }


























    

}
