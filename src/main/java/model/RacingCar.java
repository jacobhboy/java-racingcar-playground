package model;

import vo.Movement;

public class RacingCar {
    public static final int THRESHOLD_FOR_MOVE = 4;
      String carName;
    private final Movement movement;

    public RacingCar(final String carName) {
        this.carName = carName;
        movement = new Movement();
    }

    public void moveRacingCar(final int inputNumber) {
        if (THRESHOLD_FOR_MOVE <= inputNumber) movement.increaseMovement();
    }

    public boolean isCarFinished(final int trial) {
        return movement.getNumOfMovement() == trial;
    }

    public String getCarName() {
        return carName;
    }

    public int getMovement() {
        return movement.getNumOfMovement();
    }
}
