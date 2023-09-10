package gmartineza.tetris;

import java.util.Arrays;

public class LPieceLeft extends PieceBase {
    public LPieceLeft() {
        super("l left", Arrays.asList(
            new byte[][] {
                { 1, 0, 0 },
                { 1, 1, 1 }
            },
            new byte[][] {
                { 0, 1 },
                { 0, 1 },
                { 1, 1 }
            },
            new byte[][] {
                { 1, 1, 1 },
                { 0, 0, 1 }
            },
            new byte[][] {
                { 1, 1 },
                { 1, 0 },
                { 1, 0 }
            }
        ));
    }
}
