package TugasPraktikum6.Models;

import TugasPraktikum6.Utils.Util;

public class Smartphone1 implements IMove {
    int price;
    String brand;

    public Smartphone1(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        Util.batas();
        System.out.println("Smartphone Berpindah");
    }

    @Override
    public void describe() {
        Util.batas();
        Util.deskripsi();
        Util.enter();
        System.out.println("Jenis Smartphone : " + this.brand);
        System.out.println("Harga Smartphone: " + this.price);
    }

}
