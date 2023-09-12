package gmartineza.tetris;
import java.time.Clock;
import java.util.Random;

public class Tetris {
    private Board board;
    private PieceBase currentPiece;
    private Clock clock;
    private Random random = new Random();
    int row = 0;
    int randomCol;
    int col = 0;
        // Iniciar el juego

        public void start() {
            
        
            while (true) {
                // Insertar una nueva pieza aleatoria en la parte superior
                currentPiece = board.spawnNewPiece();
                System.out.println();
                // Bajar la pieza hasta llegar al final
            
                 while (board.canPlacePiece(currentPiece, row, col)) {
            
                   board.movePiece(currentPiece, row + 1);
                   
                }
        
                // Rotar la pieza
                currentPiece.rotateLeft();
        
                // Continuar bajando la pieza hasta llegar al final
               while (board.canPlacePiece(currentPiece, row, col)) {
                   board.movePiece(currentPiece, row + 1);
                   
                }
                
                for (row = 0; row < 21; row++) {
                    board.isSingleLine(row);
                }

                
                
                
                // Comprobar si el juego ha terminado ( Si no se puede insertar una nueva pieza o hacer 5 tetris)
                if (! board.canPlacePiece(currentPiece,0,0)||  ) {
                    break; // El juego ha terminado
                }
            }
        }
        
    

    





}
