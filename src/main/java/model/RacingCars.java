package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {
    private final List<RacingCar> racingCars;
    private final int trial;

    public RacingCars(List<String> names, int trial){

        this.racingCars = names.stream()
                .map(RacingCar::new)
                .collect(Collectors.toCollection(ArrayList::new));

        this.trial = trial;
    }

    public boolean isGameFinished() {
        return racingCars
                .stream()
                .anyMatch(racingCar -> racingCar.isCarFinished(trial));
    }

    public List<String> getWinner() {

        return racingCars
                 .stream()
                 .filter(r -> r.isCarFinished(trial))
                 .map(RacingCar::getCarName)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void moveRacingCars(List<Integer> numbers) {

        for(int i = 0, size = racingCars.size() ; i < size ; i++){
            racingCars
                    .get(i)
                    .moveRacingCar(numbers.get(i));
        }
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public int getLengthOfRacingCar(){
        return racingCars.size();
    }
}
