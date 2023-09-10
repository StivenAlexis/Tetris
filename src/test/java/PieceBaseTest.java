import org.junit.Test;
import static org.junit.Assert.*;
import gmartineza.tetris.*;

public class PieceBaseTest{

    @Test
    public void Instantiate_Tpiece_test(){
        PieceBase t = new TPiece();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Lpiece_test(){
        PieceBase t = new LPieceRight();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Dogpiece_test(){
        PieceBase t = new DogPieceRight();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Squarepiece_test(){
        PieceBase t = new DogPieceRight();
        assertNotNull(t);
    }

    @Test
    public void Instantiate_Stickpiece_test(){
        PieceBase t = new StickPiece();
        assertNotNull(t);
    }

    // TODO: verificar piezas
   /* 
    @Test
    public void check_DogPiece_true() {

        DogPieceRight T1 = new DogPieceRight();

        assertEquals(true, T1.checkPiece("1100110000000000"));

    }
    @Test
    public void ccheck_DogPiece_false() {

       DogPieceRight T1 = new DogPieceRight();

        assertEquals(false, T1.checkPiece("0100111000000000"));

    }

    @Test
    public void check_LPiece_true() {

        LPieceRight T1 = new LPieceRight();

            assertEquals(true, T1.checkPiece("1000100010001100"));

    }

    @Test
        public void check_LPiece_false() {

        LPieceRight T1 = new LPieceRight();

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

*/

    @Test
    public void rotateClowkwiseDog() {

        DogPieceLeft dogL = new DogPieceLeft();

       byte[][] dogExpected =  new byte[][] {
        { 0, 1 },
        { 1, 1 },
        { 1, 0 }};
    
       dogL.rotateClockwise();
       
       assertArrayEquals(dogExpected,dogL.getCurrentOrientation());
    }
    
    @Test
    public void testOrientations() {
        LPieceLeft L1 = new LPieceLeft();

        // Definir las orientaciones esperadas en el mismo orden que se definen en LPieceLeft
         byte[][][] expectedOrientations = {
            {
                { 1, 0, 0 },
                { 1, 1, 1 }
            },
            {
                { 1, 1 },
                { 1, 0 },
                { 1, 0 }
            },
            {
                { 1, 1, 1 },
                { 1, 0, 0 }
            },
            {
                { 1, 1 },
                { 0, 1 },
                { 0, 1 }
            }
        };

        // Probar todas las orientaciones
        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], L1.getCurrentOrientation());
            L1.rotateClockwise();
        }
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