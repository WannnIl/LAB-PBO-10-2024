package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Lingkaran extends Attirbut {
    
    public static void luas(int jari2, double PI){
        double luas = PI * jari2 * jari2;
        System.out.printf("Luas Lingkaran : %.1f\n",luas);
    }
    
    public static void keliling (int jari2, double PI){
        double keliling = 2 * PI * jari2;
        System.out.printf("Keliling Lingkaran : %.1f\n",keliling);
    }

    public void display(){
        Scanner sc = new Scanner(System.in);

        Tambahan.baris();

        System.out.print("Masukkan Jari-jari Lingkaran : ");
        this.jari2 = sc.nextInt();

        luas(this.jari2, super.PI);
        keliling(this.jari2, super.PI);

        Tambahan.baris();
        sc.close();
    }
}
