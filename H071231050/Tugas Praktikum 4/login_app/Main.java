package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        for (int b = 2 ; b >= 0 ; b--){
            System.out.println("-------------------------");
            System.out.println("Login");
            // Menginput Username dan Menyimpannya di attribute username;
            System.out.println("Masukkan Username");
            System.out.print("> ");

            String username = sc.next();
            // Membuat variabel userIndex yang mana nanti akan menampung index dari user
            int userIndex = -1;
            // System.out.println(listUser.get(userIndex));
            for (int i = 0; i < listUser.size(); i++) {
                if (username.equals(listUser.get(i).getUsername())) {
                    userIndex = i;
                    break;
                } else {
                    continue;
                }
                /*
                * TODO
                * Buatlah sebuah perkondisian (IF) yang akan
                * Mengecek apakah user index ke i dari listUser memiliki username yang sama
                * dengan username yang
                * diinput.
                * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
                * perulangan
                */
            }
            // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
            if (userIndex != -1) {
                // Menginput Password
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.next();
                boolean isPasswordMatch;
                if (password.equals(listUser.get(userIndex).getPassword())) {
                    isPasswordMatch = true;
                } else {
                    isPasswordMatch = false;
                }

                /*
                * TODO
                * Mengecek apakah password dari User yang login berdasarkan username
                * sama dengan password yang diinput sebelumnya, kemudian simpan
                * hasilnya di variabel isPasswordMatch
                */

                // Jika passwordnya sama maka berhasil login
                if (isPasswordMatch) {
                    System.out.println("Berhasil Login");
                    showDetailUser(listUserProfile.get(userIndex));
                    System.exit(0);
                    /*
                    * TODO
                    * panggil method showDetailUser dan kirimkan data Profile User yang login
                    * 
                    */
                } else {
                    // saat password salah akan menampikan password salah
                    System.out.println("Password Salah");
                    System.out.println("tersisa " + b + " kesmepatan lagi");
                }
            }else {
                System.out.println("Username Tidak Valid!!");
                System.out.println("tersisa " + b + " kesmepatan lagi");
            }
        }
        System.out.println("-------------------------");
        System.out.println("Password & Username Yang Anda Masukkan Salah 3 kali");
        System.out.println("TUNGGULAH BEBERAPA SAAT LAGI!!");
        System.exit(0);
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        User user = new User(username, password);
        /*
         * 
         * TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */

        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        profile.setName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        // StringUtils utils = new StringUtils();
        // StringUtils.MadeNickame(fullName);
        profile.setNickname(StringUtils.MadeNickame(fullName));
        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap\t: " + profile.getName());
        System.out.println("Nama Panggilan\t: " + profile.getNickname());
        System.out.println("Umur\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
    }
}