package data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class GetRandomWord {
    public static String getWord() {
        Path path = Path.of("src/data/russian-nouns.txt");
        try {
            List<String> lines = Files.readAllLines(path.toAbsolutePath());
            Random rand = new Random();
            return lines.get(rand.nextInt(lines.size()));
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            System.exit(1);
            return "";
        }
    }
}
