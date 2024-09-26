package login_app.utils;

public class StringUtils {

    public static String MadeNickame(String fullName){
        String[] jumlah = fullName.split("\\s+");
        int hasil = jumlah.length;
        if (hasil == 1){
            return fullName;
        }else {
            return jumlah[1];
        }
    }

    
    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
}