import java.util.Scanner;

public class Tugas1No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan judul film: ");
        String judul = sc.nextLine();
        
        System.out.println(revisiJudul(judul));
        sc.close();
    }

    public static String revisiJudul(String judul) {
        String hasil = "";

        for (int j = 0; j < judul.length(); j++) {
            if (j == 0 || (j > 0 && judul.charAt(j-1) == ' ')) {
                hasil += judul.toUpperCase().charAt(j);
            } else {
                hasil += judul.toLowerCase().charAt(j);
            }
        }

        return hasil;
    }
}