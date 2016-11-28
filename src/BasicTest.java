import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

public class BasicTest {

    /** ===Test 1 ===
     * Test initialization when Controller is created and
     * and game board is initialized.
     *
     * Create a Controller instance and initialize game board.
     */

    @Test
    public void test_Initialization() {
        Controller chessGUI = new Controller();
        chessGUI.initializeGame();
        Board chessBoard = chessGUI.B;

        assertNotNull(chessGUI);
        assertNotNull(chessBoard);
    }

    /** ===Test 2 ===
     * Test the initialization of every chess piece.
     *
     * Create a Controller instance and initialize game board.
     * Initialize every piece and assert the pieces are not null;
     */

    @Test
    public void test_PieceInitialization() {
        Controller chessGUI = new Controller();
        chessGUI.initializeGame();
        Board chessBoard = chessGUI.B;

        assertNotNull(chessBoard.Tiles);

        assertNotNull(chessBoard.Tiles[0][0].getPiece());
        assertNotNull(chessBoard.Tiles[0][1].getPiece());
        assertNotNull(chessBoard.Tiles[0][2].getPiece());
        assertNotNull(chessBoard.Tiles[0][3].getPiece());
        assertNotNull(chessBoard.Tiles[0][4].getPiece());
        assertNotNull(chessBoard.Tiles[0][5].getPiece());
        assertNotNull(chessBoard.Tiles[0][6].getPiece());
        assertNotNull(chessBoard.Tiles[0][7].getPiece());

        assertNotNull(chessBoard.Tiles[1][0].getPiece());
        assertNotNull(chessBoard.Tiles[1][1].getPiece());
        assertNotNull(chessBoard.Tiles[1][2].getPiece());
        assertNotNull(chessBoard.Tiles[1][3].getPiece());
        assertNotNull(chessBoard.Tiles[1][4].getPiece());
        assertNotNull(chessBoard.Tiles[1][5].getPiece());
        assertNotNull(chessBoard.Tiles[1][6].getPiece());
        assertNotNull(chessBoard.Tiles[1][7].getPiece());

        assertNotNull(chessBoard.Tiles[6][0].getPiece());
        assertNotNull(chessBoard.Tiles[6][1].getPiece());
        assertNotNull(chessBoard.Tiles[6][2].getPiece());
        assertNotNull(chessBoard.Tiles[6][3].getPiece());
        assertNotNull(chessBoard.Tiles[6][4].getPiece());
        assertNotNull(chessBoard.Tiles[6][5].getPiece());
        assertNotNull(chessBoard.Tiles[6][6].getPiece());
        assertNotNull(chessBoard.Tiles[6][7].getPiece());

        assertNotNull(chessBoard.Tiles[7][0].getPiece());
        assertNotNull(chessBoard.Tiles[7][1].getPiece());
        assertNotNull(chessBoard.Tiles[7][2].getPiece());
        assertNotNull(chessBoard.Tiles[7][3].getPiece());
        assertNotNull(chessBoard.Tiles[7][4].getPiece());
        assertNotNull(chessBoard.Tiles[7][5].getPiece());
        assertNotNull(chessBoard.Tiles[7][6].getPiece());
        assertNotNull(chessBoard.Tiles[7][7].getPiece());
    }

    @Test
    public void  test_Pawn() {
        Controller chessGUI = new Controller();

        chessGUI.initializeGame();
        Board chessBoard = chessGUI.B;

        Main main = new Main();

        assertNotNull(chessBoard.Tiles[6][3].getPiece());
        assertEquals(chessBoard.Tiles[6][3].getPiece().name, "w_Pawn");


        main.cY = 6;
        main.cX = 3;

        main.nY = 5;
        main.nX = 3;
        main.getListOfMoves(chessBoard);
        main.makeMove(chessBoard);
        assertNotNull(chessBoard.Tiles[4][3].getPiece());
    }

}