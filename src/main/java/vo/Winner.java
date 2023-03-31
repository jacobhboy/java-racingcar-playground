package vo;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    List<String> winner;

    public Winner(List<String> winner) {
        this.winner = winner;
    }

    public int getWinnerLength(){
        return winner.size();
    }

    public String getWinner(int index){
        return winner.get(index);
    }
}
