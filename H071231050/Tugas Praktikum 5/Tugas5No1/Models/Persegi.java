package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Persegi extends Attirbut{
    
    public static void luas(int sisi){
        double luas = sisi * sisi;
        System.out.printf("Luas Persegi : %.1f\n",luas);
    }
    
    public static void keliling (int sisi){
        double keliling = 4 * sisi;
        System.out.printf("Keliling Persegi : %.1f\n",keliling);
    }

    public void display(){
        Scanner sc = new Scanner(System.in);

        Tambahan.baris();

        System.out.print("Masukkan Panjang Sisi Persegi : ");
        this.sisi = sc.nextInt();

        luas(this.sisi);
        keliling(this.sisi);

        Tambahan.baris();
        sc.close();
    }
}
