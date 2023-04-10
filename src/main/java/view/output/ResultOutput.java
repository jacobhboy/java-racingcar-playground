package view.output;

import model.RacingCar;
import model.RacingCars;
import vo.Winner;

import java.util.List;

public class ResultOutput {
    public static void outputTurnResult(RacingCars racingCars){

        List<RacingCar> listRacingCars = racingCars.getRacingCars();

        listRacingCars.forEach(
                racingCar -> System.out.println(racingCar.getCarName() +
                        " : " +
                        "-".repeat(racingCar.getMovement())));

        System.out.println();
    }

    public static void outputGameResult(Winner winners){

        StringBuilder winnersString = new StringBuilder();

        for (int i=0,length= winners.getWinnerLength() ; i<length ;  i++) {
            if(i != 0) winnersString.append(", ");
            winnersString.append(winners.getWinner(i));
        }
        winnersString.append("가 최종 우승했습니다");

        System.out.println(winnersString);
    }
}
