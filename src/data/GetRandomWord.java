package data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class GetRandomWord {
    public static String getWord() {
        Path path = Path.of("russian-nouns.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            Random rand = new Random();
            return lines.get(rand.nextInt(lines.size()));
        } catch (IOException e) {
            System.exit(1);
            return "";
        }
    }
}
