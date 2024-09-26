package TugasPraktikum6;

import TugasPraktikum6.Models.Car;
import TugasPraktikum6.Models.Dog;
import TugasPraktikum6.Models.Pitbull;
import TugasPraktikum6.Models.Smartphone1;
// import TugasPraktikum6.Models.Teknologi;

public class Main {
    public static void main(String[] args) {
        Dog pitbull = new Pitbull(11, 50);
        Smartphone1 smartphone = new Smartphone1(12000000, "Iphone 12");
        Car car = new Car(6, 480, "Black", "BMW");

        pitbull.move();
        pitbull.describe();

        smartphone.move();
        smartphone.describe();

        car.move();
        car.describe();

    }

}
