package view.output;

import model.RacingCar;
import model.RacingCars;

import java.util.List;

public class ResultOutput {

    private final static String TURN_RESULT = "%s : ";
    public static void outputTurnResult(RacingCars racingCars){

        List<RacingCar> listRacingCars = racingCars.getRacingCars();

        listRacingCars.forEach(
                racingCar -> System.out.printf(TURN_RESULT+ "-".repeat(racingCar.getNumOfMove()) + System.lineSeparator(), racingCar.getCarName()));

        System.out.println();
    }

    public static void outputGameResult(List<String> winners){
        String winnersString = "";
        for (int i=0,length= winners.size();i<length;i++) {
            if(i != 0) System.out.print(", ");
            System.out.print(winners.get(i));
        }
        System.out.println("가 최종 우승했습니다");
    }
}
