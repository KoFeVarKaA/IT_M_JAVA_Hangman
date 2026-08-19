import java.util.Scanner;

public class Main{
    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву: ");

        // 2. Считываем строку, которую ввел пользователь (аналог input() в Python)
        String input = scanner.nextLine();

        System.out.println("Вы ввели: " + input);
    }
}