package TugasPraktikum5.Tugas5No1.Models;
import java.util.Scanner;

import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

public class Kubus extends Attirbut{
    
    public static void luas(int rusuk){
        double luas = 6 * rusuk * rusuk;
        System.out.printf("Luas Kubus : %.1f",luas);
    }
    
    public static void volume(int rusuk){
        double volume = rusuk * rusuk * rusuk;
        System.out.printf("\nVolume Kubus : %.1f\n",volume);
    }
    
    public void display(){
        Scanner sc = new Scanner(System.in);
        
        Tambahan.baris();

        System.out.print("Masukkan Panjang Rusuk Kubus : ");
        this.rusuk = sc.nextInt();

        luas(this.rusuk);
        volume(this.rusuk);

        Tambahan.baris();
        sc.close();
    }
}
