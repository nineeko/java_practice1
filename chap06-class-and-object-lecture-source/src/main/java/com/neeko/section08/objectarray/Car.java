package com.neeko.section08.objectarray;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    public void driveMaxSpeed() {
        System.out.println( modelName+"이(가) 최고 시속 " + maxSpeed +"으로 달립니다.");
    }
}
