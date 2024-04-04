package Tugas3No1;
class Size {
    int ukuran;
    double insole;

    public String getSize(){
        return "Size " + ukuran + ", Insole " + insole;
    }
}
public class Sandal {
    String merekSandal; 
    Size size = new Size();
    double damageLemaparan = 20;

    public String getMerekSandal() {
        return merekSandal;
    }

    public void setMerekSandal(String merekSandal) {
        this.merekSandal = merekSandal;
    }
    
    public double getDamageLemaparan() {
        return (size.ukuran / 10) + damageLemaparan;
    }

    public void setDamageLemaparan(int damageLemaparan) {
        this.damageLemaparan = damageLemaparan;
    }
}
