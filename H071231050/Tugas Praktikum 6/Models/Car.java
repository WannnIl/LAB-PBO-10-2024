package TugasPraktikum6.Models;

import TugasPraktikum6.Utils.Util;

public class Car implements IMove {
    int totalForwadGear, maxSpeed;
    String warna, jenis;

    public Car(int totalForwadGear, int maxSpeed, String warna, String jenis) {
        this.totalForwadGear = totalForwadGear;
        this.maxSpeed = maxSpeed;
        this.warna = warna;
        this.jenis = jenis;
    }

    @Override
    public void move() {
        Util.batas();
        System.out.println("Mobil sedang berakselerasi");
    }

    @Override
    public void describe() {
        Util.batas();
        Util.deskripsi();
        Util.enter();
        System.out.println("Jenis Mobil : " + this.jenis);
        System.out.println("Warna Mobil : " + this.warna);
        System.out.println("Max Speed Mobil : " + this.maxSpeed + "cc");
        Util.enter();
        System.out.printf("Jumlah Forward Gear Pada Mobil %s adalah %d", this.jenis, this.totalForwadGear);
    }

}
