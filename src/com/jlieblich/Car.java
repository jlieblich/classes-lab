package com.jlieblich;

/**
 * Created by jonlieblich on 10/11/16.
 */
public class Car {
    private String mColor;
    private String mBrand;
    private int mTopSpeed;

    public Car(String color, String brand, int topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go() {
        System.out.println("The " + mColor + " " + mBrand + " is accelerating");
    }

    public void slow() {
        System.out.println("The " + mColor + " " + mBrand + " is slowing down");
    }

    public void stop() {
        System.out.println("The " + mColor + " " + mBrand + " is standing still");
    }

    public void setColor(String color) {
        mColor = color;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public void setTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }

    public String getColor() {
        return mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public boolean driverIsAsshole() {
        return getTopSpeed() > 175;
    }

    public void runLight() {
        System.out.println("The " + mColor + " " + mBrand + "'s engine roars as the" +
                " asshole driver speeds through the red light!");
    }
}
