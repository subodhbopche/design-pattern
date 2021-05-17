package com.subh.dp.car;

public class SportCar extends CarDecorator {

    public SportCar(Car car){
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Sport Car implementation");
    }
}
