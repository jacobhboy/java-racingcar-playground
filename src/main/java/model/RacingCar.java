package model;

public class RacingCar {
    public static final int THRESHOLD_FOR_MOVE = 4;
    private final String carName;
    private int numOfMove;

    public RacingCar(final String carName) {
        this.carName = carName;
        this.numOfMove = 0;
    }
    
    public void moveRacingCar(final int inputNumber) {
        if (THRESHOLD_FOR_MOVE <= inputNumber) numOfMove++;
    }

    public boolean isCarFinished(final int trial){
        return numOfMove == trial;
    }

    public String getCarName(){
        return carName;
    }

    public int getNumOfMove() {
        return numOfMove;
    }
}
