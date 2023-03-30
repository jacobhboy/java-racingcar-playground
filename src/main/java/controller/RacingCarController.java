package controller;

import model.RacingCars;
import view.input.InputView;
import view.input.RandomNumber;
import view.output.OutputView;
import view.output.ResultOutput;

import java.util.List;

public class RacingCarController {
    public void play(){

        RacingCars racingCars = new RacingCars(getNames(), getTrial());
        List<String> winner = playGame(racingCars);

        printResult(racingCars, winner);
    }

    private List<String> getNames() {

        OutputView.nameRequireOutput();

        return InputView.getNames();
    }

    private int getTrial() {

        OutputView.trialRequireOutput();

        return InputView.getTrial();
    }

    private List<String> playGame(RacingCars racingCars) {

        OutputView.PRINT_RESULT();

        while (!racingCars.isGameFinished()) {
            racingCars.moveRacingCars(RandomNumber.getRandomList(racingCars.getLengthOfRacingCar()));
            ResultOutput.outputTurnResult(racingCars);
        }

        return racingCars.getWinner();
    }

    private void printResult(RacingCars racingCars, List<String> winner) {
        ResultOutput.outputTurnResult(racingCars);
        ResultOutput.outputGameResult(winner);
    }
}
