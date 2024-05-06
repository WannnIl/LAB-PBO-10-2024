package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Trapesium extends Attirbut {
    int sisi1,sisi2,sisi3,sisi4;

    public static void luas(int sisi1, int sisi2, int tinggi){
        double luas = ((sisi1 + sisi2)/2) * tinggi;
        System.out.printf("Luas Trapesium : %.1f\n",luas);
    }
    
    public static void keliling (int sisi1, int sisi2 , int sisi3 , int sisi4){
        double keliling = sisi1 + sisi2 + sisi3 + sisi4;
        System.out.printf("Keliling Trapesium : %.1f\n",keliling);
    }

    public void display(){
        Scanner sc = new Scanner(System.in);

        Tambahan.baris();

        System.out.print("Masukkan Sisi 1 Trapesium : ");
        this.sisi1 = sc.nextInt();
        System.out.print("Masukkan Sisi 2 Trapesium : ");
        this.sisi2 = sc.nextInt();
        System.out.print("Masukkan Sisi 3 Trapesium : ");
        this.sisi3 = sc.nextInt();
        System.out.print("Masukkan Sisi 4 Trapesium : ");
        this.sisi4 = sc.nextInt();
        System.out.print("Masukkan Tinggi Trapesium : ");
        this.tinggi = sc.nextInt();

        luas(this.sisi1, this.sisi2 , this.tinggi);
        keliling(this.sisi1,this.sisi2,this.sisi3,this.sisi4);

        Tambahan.baris();
        sc.close();
    }

}
