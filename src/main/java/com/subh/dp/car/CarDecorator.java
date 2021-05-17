package com.subh.dp.car;

public class CarDecorator  implements Car{

    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
