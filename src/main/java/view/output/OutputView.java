package view.output;

public class OutputView {
    public static void nameRequireOutput(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void trialRequireOutput(){
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void PRINT_RESULT(){
        System.out.println(System.lineSeparator() + "실행 결과");
    }
}
