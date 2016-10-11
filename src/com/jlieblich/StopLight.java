package com.jlieblich;

import java.util.Scanner;

/**
 * Created by jonlieblich on 10/11/16.
 */
public class StopLight {
    private String mLightColor;

    public StopLight() {
        mLightColor = "green";
    }

    public boolean isGreen() {
        return mLightColor.equalsIgnoreCase("green");
    }

    public boolean isYellow() {
        return mLightColor.equalsIgnoreCase("yellow");
    }

    public boolean isRed() {
        return mLightColor.equalsIgnoreCase("red");
    }

    public void setLightColor(String color) {
        switch(color.toLowerCase()) {
            case "green":
                mLightColor = "green";
                break;
            case "yellow":
                mLightColor = "yellow";
                break;
            case "red":
                mLightColor = "red";
                break;
            default:
                System.out.println("The light malfunctioned! Setting to RED to be safe...");
                mLightColor = "red";
        }
    }
}
