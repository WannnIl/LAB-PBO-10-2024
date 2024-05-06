import java.util.ArrayList;
import java.util.Scanner;

public class Tugas1No1{
    public static void main(String[] args) {
        int n, totalDesimal = 0, totalInteger = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {  }
        }

        ArrayList<Double> listAngka = new ArrayList<>();
        while (!(listAngka.size() == n)) {
            String[] listString = sc.nextLine().split(" ");
            try {
                for (String angka : listString) {
                    double temp = Double.parseDouble(angka);
                    listAngka.add(temp);
                    if (temp % 1 == 0) {
                        totalInteger++;
                    } else {
                        totalDesimal++;
                    }
                }
            } catch (NumberFormatException e) {  }
        }

        System.out.println(totalInteger + " Bilangan Bulat");
        System.out.println(totalDesimal + " Bilangan Desimal");
        sc.close();
    }
}