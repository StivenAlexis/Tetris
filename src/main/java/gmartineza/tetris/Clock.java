package gmartineza.tetris;

public class Clock {
    private Board board;
    private PieceBase currentPiece;
    int row = 0;
    int col = 0;
    
    public void tick(){
        
        while (board.canPlacePiece(currentPiece, row, col)) {
            
            board.movePiece(currentPiece, row + 1);}

    }
}
