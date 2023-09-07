package gmartineza.tetris;

public class DogPiece extends PieceBase{
    byte[][] dogPieceRight1 = {
            { 0, 1, 1 },
            { 1, 1, 0 }
    };

    byte[][] dogPieceRight2 = {
            { 1, 0 },
            { 1, 1 },
            { 0, 1 }
    };

    byte[][] dogPieceLeft1 = {
            { 1, 1, 0 },
            { 0, 1, 1 }
    };

    byte[][] dogPieceLeft2 = {
            { 0, 1 },
            { 1, 1 },
            { 1, 0 }
    };
}