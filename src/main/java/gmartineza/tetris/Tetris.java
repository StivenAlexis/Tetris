package gmartineza.tetris;

import java.util.Random;

public class Tetris {
    private Board board;
    private PieceBase currentPiece;
    private Clock clock;
    private Random random = new Random();
    int row = 0;
    int randomCol;
    int col = 0;
    private int singleLineCounter;
        // Iniciar el juego
   
        public void start() {
            
        
            while (true) {
                // Insertar una nueva pieza aleatoria en la parte superior
                currentPiece = board.spawnNewPiece();
                
                // Bajar la pieza hasta llegar al final
                clock.tick();
                
                
                tetrisCompleteCounter();

                // Comprobar si el juego ha terminado ( Si no se puede insertar una nueva pieza o hacer 5 tetris)
                if (! board.canPlacePiece(currentPiece,0,0) || singleLineCounter==5 ) {
                    break; // El juego ha terminado
                }
            }
        }
        
        public void status(){

            
        }


        private void tetrisCompleteCounter() {
                    for (int row = 0; row < 21; row++) {
                    board.clearAndShiftRow(row);
                    singleLineCounter++; // Incrementa el contador
            }
        
        }   



}
        
    

    






