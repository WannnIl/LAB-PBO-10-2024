import java.util.Scanner; //untuk membaca input

public class Tugas1No1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //atur alat biar bisa baca input

        int barisPertama; //mendeklarasikan untuk menyimpan input pertama
        double inputan; //ini untuk baris kedua
        int bilBul=0;//menghitung jumlah bilangan
        int bilDes=0;
        
        while (true){ //perulangan baris pertama, harus bil. bulat positif
            if(scanner.hasNextInt()){ //jika integer/bil. bulat masuk maka ini jalan
                barisPertama=scanner.nextInt();
                if (barisPertama>0){
                    break; //keluar dari perulangan ketika bilangan bulat positif dimasukkan
                }else{
                    System.out.println("Masukkan bilangan bulat positif!");
                }
            }else{  //jika bkn integer masuk
                scanner.next();
                System.out.println("Masukkan bilangan bulat positif!");
            }
        }

        for(int i=0;i<barisPertama;i++){  //inisialisasi; kondisi; increment(biar berhenti)
            try {
                inputan=scanner.nextDouble(); //ini baris kedua, jika bilangan masuk (desimal atau bulat)
                if(inputan%1==0){
                    bilBul++; //kita tambah 1 bilBul
                }else{
                    bilDes++;
                }
            } catch (Exception e) {
                System.out.println("Masukkan bilangan!");
                scanner.next(); //kalau nextLine terulang dari awal jika baris kedua ada angka dan bukan angka
                i--; //biar terulang lagi
            }
        }

        System.out.println(bilBul+" Bilangan Bulat");
        System.out.println(bilDes+" Bilangan Desimal");
        scanner.close(); //tutup alat
    }
}