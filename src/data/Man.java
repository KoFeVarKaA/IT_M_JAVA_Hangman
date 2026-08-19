package data;

public class Man {
    public static String printStage(int stageNum) {
        return switch(stageNum) {
            case 0 -> """
                                      ┌───┐
                                      │   │
                                          │
                                          │
                                          │
                                          │
                                          │
                                    ───────┘
                    """;
            case 1 -> """
                                      ┌───┐
                                      │   │
                                      O   │
                                          │
                                          │
                                          │
                                          │
                                    ───────┘
                    """;
            case 2 -> """
                                      ┌───┐
                                      │   │
                                      O   │
                                      │   │
                                          │
                                          │
                                          │
                                    ───────┘
                    """;
            case 3 -> """
                                      ┌───┐
                                      │   │
                                      O   │
                                     /│   │
                                          │
                                          │
                                          │
                                    ───────┘
                    """;
            case 4 -> """
                                      ┌───┐
                                      │   │
                                      O   │
                                     /│\\  │
                                          │
                                          │
                                          │
                                    ───────┘
                    """;
            case 5 -> """
                                      ┌───┐
                                      │   │
                                      O   │
                                     /│\\  │
                                     /    │
                                          │
                                          │
                                    ───────┘
                    """;
            case 6 -> """
                                      ┌───┐
                                      │   │
                                      O   │
                                     /│\\  │
                                     / \\  │
                                          │
                                          │
                                    ───────┘
                    """;
            default -> "Ошибка: неверный индекс стадии";
        };
    }
}
