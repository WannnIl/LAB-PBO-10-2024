package TugasPraktikum5.Tugas5No2.Models;

public class Laptop extends Product{
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price) {
        super(brand, seriesNumber, price);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ram Size : " + this.ramSize  + "GB");
        System.out.println("Processor type : " + this.processorType);
    }
    
    public void aLaptop(){
        System.out.print("Masukkan size ram produk (Gb) : ");
        this.ramSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Processor Produk : ");
        this.processorType = sc.nextLine();
        // sc.nextLine();
    }
    public int getRamSize() {
        return ramSize;
    }
    
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    
    public String getProcessorType() {
        return processorType;
    }
    
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

}
