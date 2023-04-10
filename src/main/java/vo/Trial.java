package vo;

public class Trial {
    private final int trial;

    public Trial(int trial) {
        if (trial < 0) throw new IllegalArgumentException("0 이상의 수만 입력해주세요.");
        this.trial = trial;
    }

    public int getTrial() {
        return trial;
    }


}
