import java.util.Scanner;

public class TP2_2_H071231022 {
    public static void main(String[] args) {
        Produk indomie = new Produk("IND28", "Indomie", 50, 3000);
        Produk gunting = new Produk("GUN03", "Gunting", 20, 15000);
        Produk obatNyamuk = new Produk("OBN10", "Obat Nyamuk", 15, 25000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama produk (Indomie/Gunting/Obat Nyamuk):");
        String inputNama = scanner.nextLine();

        switch (inputNama.toLowerCase()) {
            case "indomie":
                indomie.displayInfo();
                break;
            case "gunting":
                gunting.displayInfo();
                break;
            case "obat nyamuk":
                obatNyamuk.displayInfo();
                break;
            default:
                System.out.println("Produk tidak tersedia.");
                break;
        }

        scanner.close();
    }
}