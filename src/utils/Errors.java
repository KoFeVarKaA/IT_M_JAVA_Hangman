package utils;

public class Errors {
    public static void incorrectInput() {
        System.out.println("""
                ОШИБКА ввода:
                Можно вводить только одну неиспользованную ранее букву.
                """);
    }

    public static void wrongAnswer() {
        System.out.println("Ошибка: Ответ может быть только 'д' или 'н'");
    }
}
