package stages;

import dtos.GameStateDTO;
import utils.Errors;
import utils.Render;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GamePlay {
    final static String[]  ALLOWED_LETTERS = {
            "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м",
            "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ",
            "ы", "ь", "э", "ю", "я"};

    public static boolean playGame(String word){
        Scanner scanner = new Scanner(System.in);
        char[] wordMask = (" " + "_ ".repeat(word.length())).toCharArray();
        String usedLetters = "";
        int indexWord = 0,indexMan = 0;

        while (true) {
            if (indexWord == word.length()) {
                return true;
            }

            GameStateDTO gameStateDTO = new GameStateDTO(
                    wordMask, usedLetters, indexWord, indexMan
            );
            Render.renderGame(gameStateDTO);

            if (indexMan == 6) {
                return false;
            }
            String ch = scanner.nextLine().toLowerCase();
            System.out.printf("%n%n%n%n");
            if (usedLetters.contains(ch) || ch.length() != 1 ||
                    !(Arrays.asList(ALLOWED_LETTERS).contains(ch))) {
                Errors.incorrectInput();
                continue;
            }
            else if (word.contains(ch)) {
                // Увеличиваем количество угаданных букв на количество
                // вхождений символа в слово
                indexWord += word.length() - word.replace(ch, "").length();
                for (int i=0; i<word.length(); i++) {
                    if (ch.charAt(0) == word.charAt(i)) {
                        wordMask[i*2+1] = ch.charAt(0);
                    }
                }
            }
            else indexMan += 1;

            if (!usedLetters.contains(ch)) usedLetters = usedLetters + ch + ", ";
        }


    }
}
