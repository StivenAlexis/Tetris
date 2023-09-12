package gmartineza.tetris;

public class Tetris {
    private Board board;
    private PieceBase currentPiece;

    public void start() {
        // Iniciar el juego
        while (true) {
           
            // Insertar una nueva pieza aleatoria en la parte superior
            currentPiece = board.spawnNewPiece();
    
            // Bajar la pieza hasta llegar al final
            int row=0;
            int col = 0;
            Object ol;
            while (canPlacePiece(currentPiece,row,col)) {
                movePieceDown();
            }
    
            // Rotar la pieza
            rotatePiece();
    
            // Continuar bajando la pieza hasta llegar al final
            while (canPlacePieceAt(row + 1, randomCol)) {
                movePieceDown();
            }
    
            // Comprobar si el juego ha terminado (por ejemplo, si no se puede insertar una nueva pieza)
            if (!canInsertNewPiece()) {
                break; // El juego ha terminado
            }
        }
    }
    
    private boolean canPlacePiece(PieceBase currentPiece2, int row, int col) {
        return false;
    }

    private boolean canPlacePieceAt(int row, int col) {
        // Comprobar si la pieza actual se puede colocar en la posición especificada utilizando la función de Board
        return board.canPlacePiece(currentPiece, row, col);
    }
    
    private void movePieceDown() {
        // Mover la pieza actual hacia abajo utilizando la función de Board
        board.movePiece(currentPiece, row + 1, randomCol, true);
        row++;
    }
    
    private void rotatePiece() {
        // Rotar la pieza actual utilizando la función de Board
        board.rotatePiece(currentPiece);
    }
    
    private boolean canInsertNewPiece() {
        // Comprobar si se puede insertar una nueva pieza en la parte superior del tablero utilizando la función de Board
        return board.canInsertNewPiece();
    }
    





}
