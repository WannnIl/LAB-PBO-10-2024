package TugasPraktikum6.Models;

import TugasPraktikum6.Utils.Util;

public class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    @Override
    public void move() {
        this.position += 3;
        Util.batas();
        System.out.println("Berhasil berpindah");
        System.out.println("Pitbull sekarang berada di posisi " + this.position);

    }

    @Override
    public void describe() {
        Util.batas();
        Util.deskripsi();
        Util.enter();
        System.out.printf(
                "Pitbull memiliki tubuh yang berotot dan kuat. Mereka biasanya memiliki dada yang lebar dan kaki yang kuat, Pitbull memiliki panjang rata-rata sekitar %d cm.\nItulah beberapa ciri khas dari anjing Pitbull\n",
                this.averageLength);
    }

}
