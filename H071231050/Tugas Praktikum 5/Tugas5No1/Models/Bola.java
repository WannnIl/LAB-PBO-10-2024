package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Bola extends Attirbut{

    public static void luas(int jari2 , double PI){
        double luas = 4 * PI * (jari2 * jari2);
        System.out.printf("Luas Bola : %.1f",luas);
    }
    
    public void volume(int jari2, double PI){
        double volume = 4/3 * PI * (jari2 * jari2 * jari2);
        System.out.printf("\nVolume Bola : %.1f\n",volume);
    }
    
    public void display(){
        Scanner sc = new Scanner(System.in);

        Tambahan.baris();

        System.out.print("Masukkan Jari-jari Bola : ");
        this.jari2 = sc.nextInt();

        luas(this.jari2, super.PI);
        volume(this.jari2, super.PI);

        Tambahan.baris();
        sc.close();
    }
}
