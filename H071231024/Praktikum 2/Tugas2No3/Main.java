package TugasPraktikum2.Tugas2No3;

class Cuboid { 
    double height;
    double widht;
    double length;

    double getVolume() {
        return this.length * this.widht * this.height;
    }
}


public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.length = 30;

        System.out.println("======================");
        System.out.printf("Volume = %.2f\n", cuboid.getVolume());
        System.out.println("======================");
    }
    
}
