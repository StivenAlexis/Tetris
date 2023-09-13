import org.junit.Test;
import static org.junit.Assert.*;
import gmartineza.tetris.*;

public class TetrisTest {
    @Test
    public void IntantiateTetrisTest(){
        Board b = new Board();
        Clock c = new Clock();
        Tetris t = new Tetris(b, c);

        assertNotNull(b);
        assertNotNull(c);
        assertNotNull(t);
    }
    
    @Test
    public void tetrisState0Test(){
        Board b = new Board();
        Clock c = new Clock();
        Tetris t = new Tetris(b, c);

        assertEquals("No iniciado",t.state());
    }

    @Test
    public void tetrisState1Test(){
        Board b = new Board();
        Clock c = new Clock();
        Tetris t = new Tetris(b, c);
        t.start();

        assertEquals("Jugando",t.state());
    }

    @Test
    public void cannotPlaceNewPieceTest(){
        byte[][] initialBoard = new byte[][] {
            
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
            
        };
        Board b = new Board(initialBoard);
        Clock c = new Clock();
        Tetris t = new Tetris(b, c);
        t.start();
        assertEquals("Game Over", t.state());
    }
}
