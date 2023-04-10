package view.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    public static final int NUMBER_TO_MAKE_SINGLE_DIGIT = 10;

    public static List<Integer> getRandomList(final int lengthOfRacingCar) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < lengthOfRacingCar; i++) {
            numbers.add(RandomNumber.getRandomNumber());
        }

        return numbers;
    }

    public static int getRandomNumber() {
        Random random = new Random();

        return Math.abs(random.nextInt() % NUMBER_TO_MAKE_SINGLE_DIGIT);
    }
}
