package gmartineza.tetris;

import java.util.Arrays;

public class StickPiece extends PieceBase {
    public StickPiece() {
        super(Arrays.asList(
            new byte[][] {
                { 1 },
                { 1 },
                { 1 },
                { 1 }
            },
            new byte[][] {
                { 1, 1, 1, 1 }
            }
        ));
    }
}
