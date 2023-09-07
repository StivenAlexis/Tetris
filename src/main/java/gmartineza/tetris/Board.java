package gmartineza.tetris;

public class Board {
    private byte[][] board;
    private final byte width = 10;
    private final byte height = 20;

    public Board() {
        board = new byte[height][width];
        for (byte row = 0; row < height; row++) {
            for (byte col = 0; col < width; col++) {
                board[row][col] = 0;
            }
        }
    }

    public spawnNewPiece(){}
}
