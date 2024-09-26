package Tugas6No1.Dog;

import Tugas6No1.IMystery;

public abstract class Dog implements IMystery{
    int position, averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    // public abstract void move();

    abstract void describe();


    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }
    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
}
