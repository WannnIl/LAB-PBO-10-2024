import java.util.Scanner;

public class Tugas1No3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputTgl=scanner.nextLine();//membaca bris input ebagai tanggal
        System.out.println(ubahTgl(inputTgl));
        scanner.close();
    }

    public static String ubahTgl(String inputTgl) {
        String[] bagian=inputTgl.split("-");//memecah tanggal bagian hari

        int hari=Integer.parseInt(bagian[0]);
        int tahun=Integer.parseInt(bagian[2]);
        
        if(tahun>41||tahun==41){
            tahun+=1900;
        }else{
            tahun+=2000;
        }
        String bulan = ubahBulan(bagian[1]);

        return hari+" "+bulan+" "+tahun;
    }

    private static String ubahBulan(String nomorBulan) {
        String[] bulanBulan = {//array yang berisi nama2 bulan
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        int indeksBulan = Integer.parseInt(nomorBulan) - 1; //kasih sesuai dengan indeks, bulan 1 itu indeks 0

        return bulanBulan[indeksBulan];//mengembalikan nama bulan
    }
}