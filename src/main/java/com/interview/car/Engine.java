package com.interview.car;

public class Engine {
    private int rpms;

    public int getRpms() {
        return rpms;
    }

    public void setRpm(int rpms) {
        this.rpms = rpms;
    }

    public void idle() {
        setRpm(750);
    }
}
