import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas1No4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radius;

        while(true){//looping tanpa batas untuk meminta input radius 
            try{
                if(scanner.hasNextDouble()){//memeriksa input apakah double
                    radius=scanner.nextDouble();
                    break;
                }else{
                    throw new InputMismatchException();
                }
            }catch(InputMismatchException e){
                scanner.next();
                System.out.println("Masukkan angka valid!");
            }
        }
        
        System.out.println("Luas lingkaran dengan radius " + radius+" adalah: "+String.format("%.2f",hitungLuas(radius)));
        scanner.close();
    }

    public static double hitungLuas(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}