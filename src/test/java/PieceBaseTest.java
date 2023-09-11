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

    @Test
    public void rotateClowkwiseDog() {

        DogPieceLeft dogL = new DogPieceLeft();

        byte[][] dogExpected = new byte[][] {
        { 0, 1 },
        { 1, 1 },
        { 1, 0 }};
    
       dogL.rotateRight();
       
       assertArrayEquals(dogExpected,dogL.getCurrentOrientation());
    }
    
    
    @Test
    public void testOrientationsDogPieceLeft() {
        DogPieceLeft testPiece = new DogPieceLeft();
        
         byte[][][] expectedOrientations = {{
                { 1, 1, 0 },
                { 0, 1, 1 }
            },
            {
                { 0, 1 },
                { 1, 1 },
                { 1, 0 }
            }
        };

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }

   @Test
   public void testOrientationsDogPieceRight() {
       DogPieceRight testPiece = new DogPieceRight();
       
         byte[][][] expectedOrientations = {{
                { 0, 1, 1 },
                { 1, 1, 0 }
            },
            {
                { 1, 0 },
                { 1, 1 },
                { 0, 1 }
            }
        };

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }

    @Test
    public void testOrientationsLPieceLeft() {
        LPieceLeft testPiece = new LPieceLeft();

        // Definir las orientaciones esperadas en el mismo orden que se definen en LPieceLeft
         byte[][][] expectedOrientations = {
            {
                { 1, 0, 0 },
                { 1, 1, 1 }
            },
            {
                { 0, 1 },
                { 0, 1 },
                { 1, 1 }
            },
            {
                { 1, 1, 1 },
                { 0, 0, 1 }
            },
            {
                { 1, 1 },
                { 1, 0 },
                { 1, 0 }
            }
        };

        // Probar todas las orientaciones
        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }
    
    @Test
    public void testOrientationsLPieceRight() {
        LPieceRight testPiece = new LPieceRight();

         byte[][][] expectedOrientations = {{
                { 0, 0, 1 },
                { 1, 1, 1 }
            },
            {
                { 1, 1 },
                { 0, 1 },
                { 0, 1 }
            },
            {
                { 1, 1, 1 },
                { 1, 0, 0 }
            },
            {
                { 1, 0 },
                { 1, 0 },
                { 1, 1 }
            }
        };

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }

    @Test
    public void testOrientationsSquarePiece() {
        SquarePiece testPiece = new SquarePiece();

         byte[][][] expectedOrientations = {{
            {1, 1},
            {1, 1}
        }};

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }

    @Test
    public void testOrientationsStickPiece() {
        StickPiece testPiece = new StickPiece();

         byte[][][] expectedOrientations = {{
                { 1 },
                { 1 },
                { 1 },
                { 1 }
            },
            {
                { 1, 1, 1, 1 }
            }
        };

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }

    @Test
    public void testOrientationsTPiece() {
        TPiece testPiece = new TPiece();

         byte[][][] expectedOrientations = {
            {
                { 0, 1, 0 },
                { 1, 1, 1 }
            },
            {
                { 1, 0 },
                { 1, 1 },
                { 1, 0 }
            },
            {
                { 1, 1, 1 },
                { 0, 1, 0 }
            },
            {
                { 0, 1 },
                { 1, 1 },
                { 0, 1 }
            }
        };

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateRight();
        }
    }
}