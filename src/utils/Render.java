package utils;

import data.Man;
import dtos.GameStateDTO;

import java.util.HashMap;

public class Render {
    public static void renderGame(GameStateDTO gameStateDTO) {
        System.out.printf("""
                %s
                %s
                Использованные буквы: %s
                Ошибок:%s
                Введите букву:
                """, Man.printStage(gameStateDTO.indexMan()),
                     String.valueOf(gameStateDTO.wordMask()),
                     gameStateDTO.usedLetters(),
                     gameStateDTO.indexMan());
    }
}
