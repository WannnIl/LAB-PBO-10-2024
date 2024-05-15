package TugasPraktikum5.Tugas5No1;
import TugasPraktikum5.Tugas5No1.Models.Balok;
import TugasPraktikum5.Tugas5No1.Models.Bola;
import TugasPraktikum5.Tugas5No1.Models.Kubus;
import TugasPraktikum5.Tugas5No1.Models.Lingkaran;
import TugasPraktikum5.Tugas5No1.Models.Persegi;
import TugasPraktikum5.Tugas5No1.Models.PersegiPanjang;
import TugasPraktikum5.Tugas5No1.Models.Tabung;
import TugasPraktikum5.Tugas5No1.Models.Trapesium;
import TugasPraktikum5.Tugas5No1.Utils.Tambahan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int pilihan = 0;

        // while (pilihan != 9){
            Tambahan.baris();
            Tambahan.bangunRuang();
            Tambahan.bangunDatar();
            Tambahan.baris();

            Scanner sc = new Scanner(System.in);
            Tambahan.pilihan();
            int pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    Kubus kubus = new Kubus();
                    kubus.display(); 
                    break;
                case 2:
                    Balok balok = new Balok();
                    balok.display();
                    break;
                case 3:
                    Bola bola = new Bola();
                    bola.display();
                    break;
                case 4:
                    Tabung tabung = new Tabung();
                    tabung.display();
                    break;
                case 5:
                    Persegi persegi = new Persegi();
                    persegi.display();
                    break;
                case 6:
                    PersegiPanjang pj = new PersegiPanjang();
                    pj.display();
                    break;
                case 7:
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.display();
                    break;
                case 8:
                    Trapesium trapesium = new Trapesium();
                    trapesium.display();
                    break;
                // case 9:
                //     break;
                default:
                    System.out.println("MASUKKAN 1-8 SAJA!!!!!");
                    break;
                }
            sc.close();
    }
}
