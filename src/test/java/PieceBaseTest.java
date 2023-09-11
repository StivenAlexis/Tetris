import org.junit.Test;
import static org.junit.Assert.*;
import gmartineza.tetris.*;

public class PieceBaseTest{

    @Test
    public void InstantiateTpiecetest(){
        PieceBase t = new TPiece();
        assertNotNull(t);
    }

    @Test
    public void InstantiateLpiecetest(){
        PieceBase t = new LPieceRight();
        assertNotNull(t);
    }

    @Test
    public void InstantiateDogpiecetest(){
        PieceBase t = new DogPieceRight();
        assertNotNull(t);
    }

    @Test
    public void InstantiateSquarepiecetest(){
        PieceBase t = new DogPieceRight();
        assertNotNull(t);
    }

    @Test
    public void InstantiateStickpiecetest(){
        PieceBase t = new StickPiece();
        assertNotNull(t);
    }


    @Test
    public void testOrientationsDogPieceLeftRotateRightTest() {
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
   public void testOrientationsDogPieceRightRotateRightTest() {
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
    public void testOrientationsLPieceLeftRotateRightTest() {
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
    public void testOrientationLPieceRightRotateRightTest() {
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
    public void testOrientationsSquarePieceRotateRightTest() {
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
    public void testOrientationsStickPieceRotateRightTest() {
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
    public void testOrientationsTPieceRotateRightTest() {
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




     @Test
    public void testOrientationtDogPieceLeftRotateLeftTest() {
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
            testPiece.rotateLeft();
        }
    }




   @Test
   public void testOrientationDogPieceRightRotateLeftTest() {
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
            testPiece.rotateLeft();
        }
    }

    @Test
    public void testOrientationLPieceLeft() {
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
            testPiece.rotateLeft();
        }
    }
    
    @Test
    public void testOrientationLPieceRight() {
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
            testPiece.rotateLeft();
        }
    }

    @Test
    public void testOrientationSquarePieceRotateLeftTest() {
        SquarePiece testPiece = new SquarePiece();

         byte[][][] expectedOrientations = {{
            {1, 1},
            {1, 1}
        }};

        for (int i = 0; i < expectedOrientations.length; i++) {
            assertArrayEquals(expectedOrientations[i], testPiece.getCurrentOrientation());
            testPiece.rotateLeft();
        }
    }

    @Test
    public void testOrientationStickPieceRotateLeftTest() {
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
            testPiece.rotateLeft();
        }
    }

    @Test
    public void testOrientationTPieceRotateLeftTest() {
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
            testPiece.rotateLeft();
        }
    }
}
