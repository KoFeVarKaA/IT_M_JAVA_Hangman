package stages;

import utils.Errors;

import java.util.Locale;
import java.util.Scanner;

public class GameStart {
    public static boolean start_game() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Начать новую игру? д/н   ");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("д")) {
                return true;
            }
            else if (answer.equals("н")) {
                return false;
            }
            else {
                Errors.wrongAnswer();
            }
        }
    }
}
