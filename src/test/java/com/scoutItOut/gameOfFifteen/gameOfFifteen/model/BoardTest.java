package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import com.scoutItOut.gameOfFifteen.gameOfFifteen.dao.BoardDAO;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author jasquier
 * @since 0.1
 *
 * TODO change tests once board version of equals() is implemented, might not need the 1d arrays if we can compare boards
 */
public class BoardTest {

    private Board board;

    @Before
    public void setup() {

    }

    @Test
    public void noArgConstructorShouldPopulateADefaultBoard() {
        // Call the no argument constructor to generate a default board
        Board actualBoard = new Board();
        // This array represents the default board
        Integer[] expectedValues = {3, 2, 1, 0, 7, 6, 5, 4, 11, 10, 9, 8, 15, 14 ,13, 12};

        Integer[] actualValues = convertBoardToOneDimensionalArray(actualBoard);
        assertThat(actualValues, is(expectedValues));
    }

    @Test
    public void constructorWithBoardDAOArgShouldPopulateWithValues() {
        // create and fill BoardDAO
        BoardDAO boardDAO = new BoardDAO();

        boardDAO.setCell00Value(0);
        boardDAO.setCell01Value(1);
        boardDAO.setCell02Value(2);
        boardDAO.setCell03Value(3);

        boardDAO.setCell10Value(10);
        boardDAO.setCell11Value(11);
        boardDAO.setCell12Value(12);
        boardDAO.setCell13Value(13);

        boardDAO.setCell20Value(20);
        boardDAO.setCell21Value(21);
        boardDAO.setCell22Value(22);
        boardDAO.setCell23Value(23);

        boardDAO.setCell30Value(30);
        boardDAO.setCell31Value(31);
        boardDAO.setCell32Value(32);
        boardDAO.setCell33Value(33);

        // use BoardDAO to construct Board
        Board actualBoard = new Board(boardDAO);

        Integer[] expected = {0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 22, 23, 30, 31, 32, 33};

        // check if Board is correctly populated with BoardDAO values
        Integer[] actual = convertBoardToOneDimensionalArray(actualBoard);
        assertThat(actual, is(expected));
    }

    @Test
    public void convertBoardToDAOShouldSuccessfullyConvertABoardToABoardDAO() {
        // create expected board
        // create a dao
        // convert the board to a dao
        // compare actual DAO to expected DAO

    }

    // converts a given board to a 1d array
    private Integer[] convertBoardToOneDimensionalArray(Board actualBoard) {
        Integer[] actualValues = new Integer[16];
        for ( int i = 0; i < 16; i++ ) {
            actualValues[i] = actualBoard.getCells()[i/4][i%4].getValue();
        }
        return actualValues;
    }
}
