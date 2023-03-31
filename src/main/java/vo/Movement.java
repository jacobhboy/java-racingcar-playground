package vo;

public class Movement {
    private int numOfMovement;

    public Movement() {
        this.numOfMovement = 0;
    }

    public int getNumOfMovement() {
        return numOfMovement;
    }

    public void increaseMovement(){
        this.numOfMovement++;
    }
}
