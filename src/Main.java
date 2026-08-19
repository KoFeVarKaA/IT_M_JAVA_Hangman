import data.GetRandomWord;
import stages.GameEndRestart;
import stages.GamePlay;
import stages.GameStart;

import java.util.Scanner;

public class Main{
    public void main() {
        while (true) {
            String word = GetRandomWord.getWord();
            if (GameStart.start_game()) {
                boolean isWin = GamePlay.playGame(word);
                GameEndRestart.endRestartGame(isWin, word);
            }
            else break;
        }
    }
}