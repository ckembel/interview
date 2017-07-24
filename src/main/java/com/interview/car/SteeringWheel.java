package com.interview.car;

public class SteeringWheel {
    private int currentDegrees;

    public boolean isStraight() {
        return currentDegrees == 0;
    }

    public void straighten() {
        setDegrees(0);
    }

    public void turnClockwise() {
        setDegrees(90);
    }

    public void turnCounterClockwise() {
        setDegrees(-90);
    }

    private void setDegrees(int degrees) {
        currentDegrees = degrees;
    }
}
