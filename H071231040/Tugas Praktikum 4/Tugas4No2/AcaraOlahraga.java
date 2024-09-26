package Tugas_LAB_PBO.TP_4.Task2_LiveCoding;

public class AcaraOlahraga {
    String nama;
    double durasi;
    String penyiar;
    String jenisOlahraga;
    String deskripsi;
        
    public AcaraOlahraga() {}
    
    public AcaraOlahraga(String nama, double durasi, String penyiar, String jenisOlahraga, String deskripsi) {
        this.nama = nama;
        this.durasi = durasi;
        this.penyiar = penyiar;
        this.jenisOlahraga = jenisOlahraga;
        this.deskripsi = deskripsi;
    }
    
    public void displayInfo() {
        System.out.println("==================== INFO ACARA OLAHRAGA ====================");
        System.out.println("Nama Acara \t: " + getNama());
        System.out.println("Durasi \t\t: " + getDurasi() + " Menit");
        System.out.println("Penyiar \t: " + getPenyiar());
        System.out.println("Jenis Olahrga \t: " + getJenisOlahraga());
        System.out.println("Deskripsi \t: " + getDeskripsi());
    }    

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getDurasi() {
        return durasi;
    }
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }
    public String getPenyiar() {
        return penyiar;
    }
    public void setPenyiar(String penyiar) {
        this.penyiar = penyiar;
    }
    public String getJenisOlahraga() {
        return jenisOlahraga;
    }
    public void setJenisOlahraga(String jenisOlahraga) {
        this.jenisOlahraga = jenisOlahraga;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
}
