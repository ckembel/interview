package com.interview.car;

import static com.interview.car.Transmission.*;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private SteeringWheel steeringWheel;
    private Brakes brakes;
    private Speedometer speedometer;

    public void turnRight() {
        steeringWheel.turnClockwise();
    }

    public void turnLeft() {
        steeringWheel.turnCounterClockwise();
    }

    public void driveForward() {
        if(!steeringWheel.isStraight()) {
            steeringWheel.straighten();
        }
        transmission.shift(Gear.DRIVE);
        engine.setRpm(2000);
    }

    public void driveBackward() {
        if(!steeringWheel.isStraight()) {
            steeringWheel.straighten();
        }
        transmission.shift(Gear.REVERSE);
        engine.setRpm(2000);
    }

    public void stop() {
        engine.idle();
        brakes.apply();
        while(!speedometer.isStopped()) {
            waitASecond();
        }
    }

    public void park() {
        stop();
        transmission.shift(Gear.PARK);
    }

    public void accelerate() {
        int rpms = engine.getRpms();
        engine.setRpm(rpms + 500);
    }

    private void waitASecond() {
        // wait for 1 second
    }


}
