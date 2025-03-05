package com.neeko.section01.creation.subsection02.staticfactorymethod;

public class Car {
    private String model;

    private Car(String model) {
        this.model = model;
    }

    public static Car createCar(String model) {
        return new Car(model);
    }

    public void showModel() {
        System.out.println("model: " + model);
    }

    public static void main(String[] args) {
        Car car = Car.createCar("Tesla");
        car.showModel();
        /* Java API 예제 */
        Integer num = Integer.valueOf(10);
       // Integer num2 = new Integer(10);

    }


}
