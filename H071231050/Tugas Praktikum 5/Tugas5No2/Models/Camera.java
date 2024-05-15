package TugasPraktikum5.Tugas5No2.Models;

public class Camera extends Product{
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price) {
        super(brand, seriesNumber, price);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Resolution : " + this.resolution  + "MP");
        System.out.println("Lens Type : " + this.lensType);
    }

    public void aCamera(){
        System.out.print("Masukkan Resolution Produk (MP) : ");
        this.resolution = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Type lensa : ");
        this.lensType = sc.nextLine();
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getLensType() {
        return lensType;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }
}
