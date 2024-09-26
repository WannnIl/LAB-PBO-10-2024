package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Balok extends Attirbut {

    public static void luas(int panjang, int lebar, int tinggi){
        double luas = (2* panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi );
        System.out.printf("Luas Balok : %.1f\n",luas);
    }
    
    public static void volume(int panjang, int lebar, int tinggi){
        double volume = panjang * lebar * tinggi;
        System.out.printf("Volume Balok : %.1f\n",volume);
    }
    public void display(){
        Scanner sc = new Scanner(System.in);

        Tambahan.baris();

        System.out.print("Masukkan Panjang Balok : ");
        this.panjang = sc.nextInt();
        System.out.print("Masukkan Lebar Balok : ");
        this.lebar = sc.nextInt();
        System.out.print("Masukkan Tinggi Balok : ");
        this.tinggi = sc.nextInt();

        luas(this.panjang,this.lebar,this.tinggi);
        volume(this.panjang,this.lebar,this.tinggi);

        Tambahan.baris();
        sc.close();
    }
}
