package stages;

import utils.Errors;

import java.util.Scanner;

public class GameStart {
    public static boolean start_game() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Начать новую игру? д/н");
            String answer = scanner.nextLine();
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
