package gmartineza.tetris;

import java.util.Arrays;

public class DogPieceLeft extends PieceBase {
    public DogPieceLeft() {
        super("dog left", Arrays.asList(
            new byte[][] {
                { 1, 1, 0 },
                { 0, 1, 1 }
            },
            new byte[][] {
                { 0, 1 },
                { 1, 1 },
                { 1, 0 }
            }
        ));
    }
}
