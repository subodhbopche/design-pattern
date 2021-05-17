package com.subh.dp.car;

public class TestDecorator {

    public static void main(String[] args) {
        Car car = new BasicCar();
        car.assemble();

        Car car1 = new LuxuryCar(new BasicCar()) ;
        car1.assemble();

        Car car2 = new SportCar(new BasicCar());
        car2.assemble();
    }
}
