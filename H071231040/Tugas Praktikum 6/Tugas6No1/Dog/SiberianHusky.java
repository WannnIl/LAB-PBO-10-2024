package Tugas6No1.Dog;

public class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.setPosition(this.getPosition() + 3);
        System.out.println("Pitbull berpindah posisi ke posisi " + this.getPosition());
    }

    @Override
    void describe() {
        System.out.println("""
            Jenis doggy yang indah dan tangguh, berasal dari 
            Siberia, Rusia. Mereka dikenal karena bulu tebal dan 
            mata biru atau cokelat yang menawan. memiliki tubuh 
            yang kokoh dan atletis, dengan ekor yang berbulu tebal 
            terkulai di atas punggung mereka. Anjing pekerja yang 
            sangat kuat dan tahan terhadap cuaca dingin. 
            """);
    }
}
