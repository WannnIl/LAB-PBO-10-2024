import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas1No5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//array
        int target = 0;//menyimpan nilai target yang di cari

        while (true) {//tanpa batas meminta input
            try {
                target = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Masukkan bilangan!");
                scanner.next();
            }
        }

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                    found = true;//target telah di temukan
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        scanner.close();
    }
}