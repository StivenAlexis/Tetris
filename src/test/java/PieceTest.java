import org.junit.Test;
import static org.junit.Assert.*;
import gmartineza.tetris.*;

public class PieceTest{

    @Test
    public void Instantiate_piece_test(){
        Piece t = new Piece();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Tpiece_test(){
        Piece t = new TPiece();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Lpiece_test(){
        Piece t = new LPiece();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Dogpiece_test(){
        Piece t = new DogPiece();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Squarepiece_test(){
        Piece t = new DogPiece();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Stickpiece_test(){
        Piece t = new StickPiece();
        assertNotNull(t);
    }

    //TODO: verificar piezas

    @Test
    public void rotate_full_clockwise(){
        //Piece t = new DogPiece();
        //Piece square = new DogPiece();
        //Piece stick = new DogPiece();
        //Piece l = new DogPiece();
        Piece dog = new DogPiece();

        // llamar funcion que rote (rotate(counter/clockwise))y chequear que la rota bien (getPieceConfiguration())
        for (short i = 0; i < 4; i++) {
            dog.rotate(clockwise);
            assertEquals(dog.expectedPieceConfiguration(i), dog.getPieceConfiguration());
            // TODO: implementar expectedPieceConfiguration donde cada nro corresponde a una rotacion
        }
    }

    @Test
    public void rotate_full_counter_clockwise(){

    }
}