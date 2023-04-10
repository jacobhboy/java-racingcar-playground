package controller;

import model.RacingCars;
import view.input.InputView;
import view.input.RandomNumber;
import view.output.OutputView;
import view.output.ResultOutput;
import vo.Trial;
import vo.Winner;

import java.util.List;

public class RacingCarController {
    public void play() {

        RacingCars racingCars = new RacingCars(getNames(), getTrial());
        Winner winner = playGame(racingCars);

        printResult(racingCars, winner);
    }

    private Winner playGame(RacingCars racingCars) {

        OutputView.PRINT_RESULT();

        while (!racingCars.isGameFinished()) {
            racingCars.moveRacingCars(RandomNumber.getRandomList(racingCars.getLengthOfRacingCar()));
            ResultOutput.outputTurnResult(racingCars);
        }

        return new Winner(racingCars.getWinner());
    }

    private List<String> getNames() {

        OutputView.nameRequireOutput();

        return InputView.getNames();
    }

    private Trial getTrial() {

        OutputView.trialRequireOutput();

        return new Trial(InputView.getTrial());
    }

    private void printResult(RacingCars racingCars, Winner winner) {
        ResultOutput.outputTurnResult(racingCars);
        ResultOutput.outputGameResult(winner);
    }
}
