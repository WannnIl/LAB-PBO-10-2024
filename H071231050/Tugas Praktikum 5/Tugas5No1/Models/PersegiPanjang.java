package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class PersegiPanjang extends Attirbut {
    
    public static void luas(int panjang , int lebar){
        double luas = panjang * lebar;
        System.out.printf("Luas Persegi Panjang : %.1f\n",luas);
    }
    
    public static void keliling (int panjang , int lebar){
        double keliling = 2 *(panjang + lebar);
        System.out.printf("Keliling Persegi Panjang : %.1f\n",keliling);
    }

    public void display(){
        Scanner sc = new Scanner(System.in);

        Tambahan.baris();

        System.out.print("Masukkan Panjang Persegi Panjang : ");
        this.panjang = sc.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang : ");
        this.lebar = sc.nextInt();

        luas(this.panjang,this.lebar);
        keliling(this.panjang,this.lebar);

        Tambahan.baris();
        sc.close();
    }
}
