package Tugas6No1;

public class Car implements IMystery{
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }
    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
