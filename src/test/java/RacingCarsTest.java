import model.RacingCars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RacingCarsTest {

    RacingCars racingCars;

    @BeforeEach
    void init(){
        racingCars = new RacingCars(List.of("lee", "chang", "bo"), 4);
    }

    @Test
    @DisplayName("racingCars의 게임이 잘 작동하는지 확인한다.")
    void racingCarsGameFinishTest(){

        //given, when
        racingCars.moveRacingCars(List.of(0, 1, 4));
        racingCars.moveRacingCars(List.of(4, 9, 4));
        racingCars.moveRacingCars(List.of(9, 9, 4));
        racingCars.moveRacingCars(List.of(5, 9, 4));

        //then
        List<String> winner = List.of("bo");
        Assertions.assertAll(
                () -> assertThat(racingCars.isGameFinished()).isEqualTo(true),
                () -> assertThat(racingCars.getWinner()).containsAll(winner)
        );

    }
}
