package dtos;

public record GameStateDTO(
        char[] wordMask,
        String usedLetters,
        int indexWord,
        int indexMan
) {}
