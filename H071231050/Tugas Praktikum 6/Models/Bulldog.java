package TugasPraktikum6.Models;

import TugasPraktikum6.Utils.Util;

public class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    @Override
    public void move() {
        this.position = this.position + 1;
        Util.batas();
        System.out.println("Berhasil berpindah");
        System.out.println("Bulldog sekarang berada di posisi " + this.position);
    }

    @Override
    public void describe() {
        Util.batas();
        Util.deskripsi();
        Util.enter();
        System.out.printf(
                "Anjing bulldog merupakan anjing dengan tubuh kecil namun kuat, ia memiliki kepala yang besar dengan rahang yang lebar, Bulldog memiliki panjang rata-rata sekitar %d cm.\nItu Adalah beberapa ciri khas anjing Bulldog.\n",
                this.averageLength);
    }

}
