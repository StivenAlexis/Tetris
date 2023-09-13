package gmartineza.tetris;


public class Tetris {
    private Board board;
    private PieceBase currentPiece;
    private Clock clock;
    int row = 0;
    int randomCol;
    int col = 0;
    private int Count=0; 
   
        // Iniciar el juego
   
        public void start() {
            
        
            while (true) {
                // Insertar una nueva pieza aleatoria en la parte superior
                currentPiece = board.spawnNewPiece();
                
                // Bajar la pieza hasta llegar al final
                tick();
                
                
                board.lineCount();

                // Comprobar si el juego ha terminado ( Si no se puede insertar una nueva pieza o hacer 5 tetris)
                if (! board.getCanPlacePiece(currentPiece,0,0) || Count==5 ) {
                    break; // El juego ha terminado
                }
            }
        }
        
        public void status(){

                
        }
        private void tick(){

            while (board.getCanPlacePiece(currentPiece, row, col)) {
            
                board.movePiece(currentPiece, row + 1);
            }
    
        }
            
}

         
         





        
    

    






