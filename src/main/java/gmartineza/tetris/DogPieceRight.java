package gmartineza.tetris;

import java.util.Arrays;

public class DogPieceRight extends PieceBase {
    public DogPieceRight() {
        super(Arrays.asList(
            new byte[][] {
                { 0, 1, 1 },
                { 1, 1, 0 }
            },
            new byte[][] {
                { 1, 0 },
                { 1, 1 },
                { 0, 1 }
            }
        ));
    }
}
