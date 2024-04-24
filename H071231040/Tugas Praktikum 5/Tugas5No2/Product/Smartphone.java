package Tugas_LAB_PBO.TP_5.Task2_Stok_Produk.Product;

public class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size \t: " + this.getScreenSize() + " inches");
        System.out.println("Storage Capacity: " + this.getStorageCapacity() + "GB");
    }

    // public static void runSmartphone(String brand, int seriesNumber, double price) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Masukkan ukuran layar (inci) \t\t: ");
    //     double inSize = sc.nextDouble();
    //     sc.nextLine();
    //     System.out.print("Masukkan kapasitas penyimpanan (GB) \t: ");
    //     int inCapacity = sc.nextInt();
    //     sc.nextLine();

    //     Smartphone smartphone = new Smartphone(brand, seriesNumber, price, inSize, inCapacity);

    //     smartphone.addProduct(smartphone);
        
    //     sc.close();
    // }

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
