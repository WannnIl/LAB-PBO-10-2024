package TugasPraktikum5.Tugas5No2.Models;

public class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price) {
        super(brand, seriesNumber, price);
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen size : " + this.screenSize + " inches");
        System.out.println("Storage capacity : " + this.storageCapacity + "GB");
    }
    public void aSmartphone(){
        System.out.print("Masukkan ukuran layar (inci) : ");
        this.screenSize = sc.nextDouble();
        sc.nextLine();
        System.out.print("Masukkan kapasitas penyimpanan (GB) : ");
        this.storageCapacity = sc.nextInt();
        sc.nextLine();

        // sc.close();

    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
