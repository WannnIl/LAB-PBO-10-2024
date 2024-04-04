public class Tugas2No3 {

    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
    public static void main(String[] args) {
        Tugas2No3 cuboid = new Tugas2No3();
        cuboid.height = 15;
        cuboid.width = 10;
        cuboid.length = 30;
        
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}