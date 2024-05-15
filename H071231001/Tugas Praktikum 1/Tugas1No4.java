import java.util.Scanner;

public class Tugas1No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double jari = sc.nextDouble();
            double luas = Math.PI * jari * jari;
            System.out.printf("%.2f\n", luas);
        } catch (Exception e) { 
            System.out.println("Input tidak valid");
        }

        sc.close();
    }
}