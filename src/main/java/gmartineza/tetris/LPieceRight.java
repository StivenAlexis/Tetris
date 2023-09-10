package gmartineza.tetris;

import java.util.Arrays;

public class LPieceRight extends PieceBase {
    public LPieceRight() {
        super("l right", Arrays.asList(
            new byte[][] {
                { 0, 0, 1 },
                { 1, 1, 1 }
            },
            new byte[][] {
                { 1, 1 },
                { 0, 1 },
                { 0, 1 }
            },
            new byte[][] {
                { 1, 1, 1 },
                { 1, 0, 0 }
            },
            new byte[][] {
                { 1, 0 },
                { 1, 0 },
                { 1, 1 }
            }
        ));
    }
}
