package squier.john.gameof15;

/**
 * Created by johnsquier on 1/23/17.
 */
public class GameOf15Board {
    // stores the state of the game board as well as handles moving a tile

    private int[][] board;
    private boolean isRandomizedAtStart;

    public GameOf15Board() {
        board = new int[4][4];
        for ( int i = 0; i < 4; i++ ) {
            for ( int j = 0; j < 4; j++ ) {
                board[i][j] = (4 * 4) - (j + 1) - (i * 4);
            }
        }
    }

    public GameOf15Board(boolean isBoardRandomized) {
        this();
        this.isRandomizedAtStart = isBoardRandomized;

        if ( isRandomizedAtStart ) {
            // @@@ randomize board
        }
    }

    public int getTileValueAtIndex(int x, int y) {
        return board[x][y];
    }

    public boolean getIsBoardRandomizedAtStart() {
        return isRandomizedAtStart;
    }



    public static void main(String[] args) {
        GameOf15Board gameOf15Board = new GameOf15Board(false);

        System.out.println("This gameOf15Board is "
                + (gameOf15Board.getIsBoardRandomizedAtStart() ? "" : "not ")
                + "randomized!");

        for ( int i = 0; i < 4; i++ ) {
            for ( int j = 0; j < 4; j++ ) {
                System.out.printf("| %2d ", gameOf15Board.getTileValueAtIndex(i,j));
            }
            System.out.printf("|\n");
        } /* simple gameOf15Board print loop */

    }
}
