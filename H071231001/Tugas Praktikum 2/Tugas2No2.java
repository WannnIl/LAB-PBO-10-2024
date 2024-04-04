public class Tugas2No2 {

    int id;
    String nama;
    int stok;
    double harga;
  
      public void infoProduk() {
          System.out.println("ID     : " + this.id);
          System.out.println("Produk : " + this.nama);
          System.out.println("Stok   : " + this.stok);
          System.out.println("Harga  : " + this.harga);
      }
  
      public String cekStok() {
          if (stok > 0) {
              return "Produk tersedia!";
          } else {
              return "Produk tidak tersedia!";
          }
      }
  
      public static void main(String[] args) {
          Tugas2No2 produk1 = new Tugas2No2();
          produk1.id = 123;
          produk1.nama = "baju";
          produk1.stok = 23;
          produk1.harga = 12000;
          produk1.infoProduk();
          System.out.println(produk1.cekStok());
      }
  }