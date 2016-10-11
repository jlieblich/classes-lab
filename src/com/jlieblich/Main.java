package com.jlieblich;

public class Main {

    public static void main(String[] args) {
        StopLight first = new StopLight();
        first.setLightColor("green");
        Car myCar = new Car("white", "Honda", 120);
        for(int i=0;i<30;i++) {
            if(i==27) {
                myCar.setTopSpeed(265);
                myCar.setBrand("Bugatti");
                myCar.setColor("yellow");
            }
            if(first.isGreen()) {
                myCar.go();
                first.setLightColor("yellow");
            } else if(first.isYellow()) {
                myCar.slow();
                first.setLightColor("red");
            } else if(first.isRed() && myCar.driverIsAsshole()) {
                myCar.runLight();
                first.setLightColor("green");
            } else if(first.isRed()) {
                myCar.stop();
                first.setLightColor("green");
            }
        }
    }
}
