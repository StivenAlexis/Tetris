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

    
        public boolean canPlacePiece(PieceBase piece, int row, int col) {
            byte[][] orientation = piece.getCurrentOrientation();
            int pieceHeight = orientation.length;
            int pieceWidth = orientation[0].length;
    
            // Verificar si la pieza cabe en la matriz en la posición especificada
            if (row + pieceHeight > height || col + pieceWidth > width) {
                return false;
            }
    
            // Verificar si las celdas donde se va a insertar la pieza están vacías
            for (int i = 0; i < pieceHeight; i++) {
                for (int j = 0; j < pieceWidth; j++) {
                    if (orientation[i][j] != 0 && board[row + i][col + j] != 0) {
                        return false;
                    }
                }
            }
    
            return true;
        }
    
        public void placePiece(PieceBase piece, int row, int col) {
            byte[][] orientation = piece.getCurrentOrientation();
            int pieceHeight = orientation.length;
            int pieceWidth = orientation[0].length;
    
            // Insertar la pieza en la matriz en la posición especificada
            for (int i = 0; i < pieceHeight; i++) {
                for (int j = 0; j < pieceWidth; j++) {
                    if (orientation[i][j] != 0) {
                        board[row + i][col + j] = orientation[i][j];
                    }
                }
            }
        }
    
}
   
   
    // public spawnNewPiece(){}

