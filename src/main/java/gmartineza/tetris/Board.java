package gmartineza.tetris;

public class Board {
    private int[][] board;
    private final int width = 10;
    private final int height = 20;

    public Board() {
        board = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                board[row][col] = 0;
            }
        }
    }
}
