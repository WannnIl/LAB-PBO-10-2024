package TugasPraktikum6.Models;

import TugasPraktikum6.Utils.Util;

public class German_shepherd extends Dog {
    public German_shepherd(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    @Override
    public void move() {
        this.position += 3;
        Util.batas();
        System.out.println("Berhasil berpindah");
        System.out.println("German Shepherd sekarang berada di posisi " + this.position);
    }

    @Override
    public void describe() {
        Util.batas();
        Util.deskripsi();
        Util.enter();
        System.out.printf(
                "German Shepherd memiliki tubuh yang kokoh dan berotot. Mereka memiliki punggung yang lurus dan dada yang dalam, German Sherpherd memiliki panjang rata-rata sekitar %d cm.\nItulah beberapa ciri khas dari German Shepherd.\n",
                this.averageLength);
    }

}
