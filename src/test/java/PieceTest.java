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

    // TODO: verificar piezas
   
    @Test
    public void check_DogPiece_true() {

        DogPiece T1 = new DogPiece();

        assertEquals(true, T1.checkPiece("1100110000000000"));

    }
    @Test
    public void ccheck_DogPiece_false() {

       DogPiece T1 = new DogPiece();

        assertEquals(false, T1.checkPiece("0100111000000000"));

    }

    @Test
    public void check_LPiece_true() {

        LPiece T1 = new LPiece();

            assertEquals(true, T1.checkPiece("1000100010001100"));

    }

    @Test
        public void check_LPiece_false() {

        LPiece T1 = new LPiece();

            assertEquals(false, T1.checkPiece("10100100010001100"));

    }

    @Test
    public void check_SquarePiece_true() {

            SquarePiece T1 = new SquarePiece();

                assertEquals(true, T1.checkPiece("1100110000000000"));

    }

    @Test
       public void check_SquarePiece_false() {

            SquarePiece T1 = new SquarePiece();

            assertEquals(false, T1.checkPiece("11100100010001100"));

    }

    @Test
        public void check_StickPiece_true() {

            StickPiece T1 = new StickPiece();

                assertEquals(true, T1.checkPiece("1000100010001000"));

    }

    @Test
       public void check_StickPiece_false() {

           StickPiece T1 = new StickPiece();

            assertEquals(false, T1.checkPiece("11100100010001100"));

    }

     @Test
    public void check_TPiece_true() {

        TPiece T1 = new TPiece();

        assertEquals(true, T1.checkPiece("0100111000000000"));

    }

    @Test
    public void check_TPiece_false() {

        TPiece T1 = new TPiece();

        assertEquals(false, T1.checkPiece("1000100010001000"));

    }

    /* 
    @Test
    public void rotate_full_clockwise(){
        //Piece t = new DogPiece();
        //Piece square = new DogPiece();
        //Piece stick = new DogPiece();
        //Piece l = new DogPiece();
        Piece dog = new DogPiece();
    }
     
      // llamar funcion que rote (rotate(counter/clockwise))y chequear que la rota bien (getPieceConfiguration())
        for (short i = 0; i < 4; i++) {
            dog.rotate(clockwise);
            assertEquals(dog.expectedPieceConfiguration(i), dog.getPieceConfiguration());
            // TODO: implementar expectedPieceConfiguration donde cada nro corresponde a una rotacion
        }
    
    }
    */
}