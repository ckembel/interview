package com.interview.car;

public class Speedometer {
    private int currentSpeed;

    public int getSpeed() {
        return currentSpeed;
    }

    public boolean isStopped() {
        return currentSpeed == 0;
    }

}
