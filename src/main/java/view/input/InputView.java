package view.input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getTrial(){

        return scanner.nextInt();
    }

    public static List<String> getNames(){

        String name = scanner.nextLine();

        return Arrays
                .stream(splitInName(name))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static String[] splitInName(String name) {

        return name.replace(" ", "").split(",");
    }
}
