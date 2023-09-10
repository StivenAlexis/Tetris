package gmartineza.tetris;

import java.util.Arrays;

public class TPiece extends PieceBase {
    public TPiece() {
        super("stick", Arrays.asList(
            new byte[][] {
                { 0, 1, 0 },
                { 1, 1, 1 }
            },
            new byte[][] {
                { 1, 0 },
                { 1, 1 },
                { 1, 0 }
            },
            new byte[][] {
                { 1, 1, 1 },
                { 0, 1, 0 }
            },
            new byte[][] {
                { 0, 1 },
                { 1, 1 },
                { 0, 1 }
            }
        ));
    }
}
