package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Tabung extends Attirbut { 

    public static void luas(int jari2, double PI , int tinggi){
        double luas = (PI * jari2 * tinggi) + (PI * (jari2 * jari2));
        System.out.printf("Luas Tabung : %.1f",luas);
    }
    
    public static void volume(int jari2, double PI , int tinggi){
        double volume = PI * (jari2 * jari2) * tinggi;
        System.out.printf("\nVolume Tabung : %.1f\n",volume);
    }
    
    public void display(){
        Scanner sc = new Scanner(System.in);
        
        Tambahan.baris();

        System.out.print("Masukkan Jari-jari Tabung : ");
        this.jari2 = sc.nextInt();
        System.out.print("Masukkan Tinggi Tabung : ");
        this.tinggi = sc.nextInt();

        luas(this.jari2, super.PI, this.tinggi);
        volume(this.jari2, super.PI, this.tinggi);

        Tambahan.baris();
        sc.close();
    }
}
