package com.interview.car;

public class Transmission {
    public enum Gear {
        REVERSE, DRIVE, NEUTRAL, PARK;
    }

    private Gear gear;

    public void shift(Gear gear) {
        this.gear = gear;
    }
}
