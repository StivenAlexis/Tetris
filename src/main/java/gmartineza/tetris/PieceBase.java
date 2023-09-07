package gmartineza.tetris;

public class PieceBase {
    public byte width(byte[][] piece) {
        return (byte) piece[0].length;
    }
}
