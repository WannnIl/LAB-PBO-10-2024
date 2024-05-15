package TugasPraktikum5.Tugas5No2.Models;
import java.util.Scanner;
public class Product {
    String brand;
    int seriesNumber;
    double price;
    Scanner sc = new Scanner(System.in);
    
    public Product() {
    }

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Brand : " + this.brand);
        System.out.println("Series Number : " + this.seriesNumber);
        System.out.println("Price : $" + this.price);
    }

    public void aProduct(){
        System.out.print("Masukkan Nama Produk : ");
        this.brand = sc.nextLine();
        System.out.print("Masukkan Nomor Seri : ");
        this.seriesNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Harga : ");
        this.price = sc.nextDouble();
        sc.nextLine();
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeriesNumber() {
        return this.seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
