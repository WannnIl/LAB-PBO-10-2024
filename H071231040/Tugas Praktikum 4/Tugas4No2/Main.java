package Tugas_LAB_PBO.TP_4.Task2_LiveCoding;

public class Main {
    public static void main(String[] args) {
        AcaraOlahraga obj = new AcaraOlahraga();
        obj.setNama("ASEAN GAMES");
        obj.setDurasi(120);
        obj.setPenyiar("RCTI");
        obj.setJenisOlahraga("Badminton");
        obj.setDeskripsi("Acara ini untuk menunjukan kehebatan dalam olahraga dan mempererat pertemanan antar negara");

        obj.displayInfo();
        line();

        AcaraOlahraga obj2 = new AcaraOlahraga("Olympic Sport", 180, "TVONE", "Sepak Bola", "Acara ini untuk menunjukan kehebatan dalam olahraga Sepak Bola");
     
        System.out.println(obj2.getNama());
        System.out.println(obj2.getDurasi());
        System.out.println(obj2.getPenyiar());
        System.out.println(obj2.getJenisOlahraga());
        System.out.println(obj2.getDeskripsi());

        line();
        SelfUtils.displaySelfData();
    }
    
    public static void line() {
        System.out.println("========================================");
    }
}
