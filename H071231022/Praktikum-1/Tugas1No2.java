import java.util.Scanner;

public class Tugas1No2 { 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//untuk membaca inputn
        System.out.println("Masukkan judul film:");
        String inputan=scanner.nextLine();//membaca keseluruhan judul film

        String outputan=ubahKapital(inputan);
        System.out.println(outputan);//mencetk judul film dengan awal huruf kapital

        scanner.close();
    }

    public static String ubahKapital(String inputan){ //method yg mengubah huruf awal ke kapital
        String[] kataKata=inputan.split(" "); //buat array/daftar
        StringBuilder hasil=new StringBuilder(); //alat biar mudah memodifikasi kata

        for(String kata : kataKata){
            if(!kata.isEmpty()){ //jika ada kata tidak kosong mengubah kapital
                String keKapital=kata.substring(0,1).toUpperCase()+kata.substring(1).toLowerCase();
                hasil.append(keKapital).append(" "); //menamabahkan kata yang telah di ubah   
            }
        }
        return hasil.toString().trim();//hasil dengan spasi di akhir
    }
}