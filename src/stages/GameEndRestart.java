package stages;

public class GameEndRestart {
    public static void endRestartGame(Boolean isWin, String word) {
        if (isWin) System.out.println("Победа!");
        else System.out.printf("%n" +
                "Упс. Похоже что вы проиграли. Загаданное слово было %s%n%n%n", word);
    }
}
