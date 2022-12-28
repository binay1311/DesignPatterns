package AbstractFactory;

import AbstractFactory.Car.CarType;

public class AbstractDesignMain {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
//        System.out.println(CarFactory.buildCar(CarType.MINI));
//        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
