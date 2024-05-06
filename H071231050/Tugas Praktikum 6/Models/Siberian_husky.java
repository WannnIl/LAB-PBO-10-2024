package TugasPraktikum6.Models;

import TugasPraktikum6.Utils.Util;

public class Siberian_husky extends Dog {
    public Siberian_husky(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    @Override
    public void move() {
        this.position += 2;
        Util.batas();
        System.out.println("Berhasil berpindah");
        System.out.println("Siberian Husky sekarang berada di posisi " + this.position);
    }

    @Override
    public void describe() {
        Util.batas();
        Util.deskripsi();
        Util.enter();
        System.out.printf(
                "Siberian Husky memiliki tubuh yang ringan dan lincah, ideal untuk bekerja sebagai anjing penarik kereta salju. Mereka memiliki kaki yang kuat dan seimbang, Siberian Husky memiliki panjang rata-rata sekitar %d cm.\nItulah bebrapa ciri khas dari anjing Siberian Husky.\n",
                this.averageLength);
    }

}
