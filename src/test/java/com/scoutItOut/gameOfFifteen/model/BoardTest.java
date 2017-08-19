package com.scoutItOut.gameOfFifteen.model;

import com.scoutItOut.gameOfFifteen.dao.BoardDAO;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author jasquier
 * @since 0.1
 *
 */
public class BoardTest {

    private Board defaultBoard;
    private Cell[][] defaultBoardCells;
    private Cell[][] cellsWithValueEqualToIndex;
    private final int boardDimension = 4;

    @Before
    public void setup() {
        defaultBoard =  new Board();
        defaultBoardCells = new Cell[4][4];
        cellsWithValueEqualToIndex = new Cell[4][4];
        populateDefaultBoardCells();
        populateCellsWithValueEqualToIndex();
    }

    @Test
    public void noArgConstructorShouldPopulateADefaultBoard() {
        Cell[][] actualBoardCells = new Board().getCells();
        assertThat(actualBoardCells, is(defaultBoardCells));
    }

    @Test
    public void constructorWithBoardDAOArgShouldPopulateWithValues() {
        BoardDAO boardDAO = populateBoardDAOWithCellValuesEqualToDefault();
        Board actualBoard = new Board(boardDAO);
        assertThat(actualBoard.getCells(), is(cellsWithValueEqualToIndex));
    }

    @Test
    public void convertBoardToDAOShouldSuccessfullyConvertABoardToABoardDAO() {
        BoardDAO expectedDAO = populateBoardDAOWithCellValuesEqualToDefault();
        BoardDAO actualDAO = defaultBoard.convertBoardToDAO();
        assertThat(actualDAO, is(expectedDAO));
    }

    @Test
    public void theTwoGivenBoardsShouldBeEqual() {
        Board defaultBoard1 = new Board();
        Board defaultBoard2 = new Board();
        assertThat(defaultBoard1, is(defaultBoard2));
    }

    @Test
    public void theTwoGivenBoardsShouldNotBeEqualBecauseTheirCellArraysAreDifferent() {
        Board defaultBoard = new Board();
        Board nonDefaultBoard = slightlyModifiedBoard();
        assertThat(defaultBoard, is(not(nonDefaultBoard)));
    }

    private void populateDefaultBoardCells() {
        Integer[] defaultCellValues = {3, 2, 1, 0, 7, 6, 5, 4, 11, 10, 9, 8, 15, 14 ,13, 12};
        for ( int i = 0; i < boardDimension; i++ ) {
            for ( int j = 0; j < boardDimension; j++ ) {
                defaultBoardCells[i][j] = new Cell(defaultCellValues[(i*boardDimension)+j]);
            }
        }
    }

    private void populateCellsWithValueEqualToIndex() {
        Integer[] cellIndexValues = {0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 22, 23, 30, 31, 32, 33};
        for ( int i = 0; i < boardDimension; i++ ) {
            for ( int j = 0; j < boardDimension; j++ ) {
                cellsWithValueEqualToIndex[i][j] = new Cell(cellIndexValues[(i*boardDimension)+j]);
            }
        }
    }

    private Board slightlyModifiedBoard() {
        Board slightlyModifiedBoard = new Board();
        slightlyModifiedBoard.getCells()[0][0] = new Cell(42);
        return slightlyModifiedBoard;
    }

    private BoardDAO populateBoardDAOWithCellValuesEqualToDefault() {
        BoardDAO boardDAO = new BoardDAO();
        boardDAO.setCell00Value(3);
        boardDAO.setCell01Value(2);
        boardDAO.setCell02Value(1);
        boardDAO.setCell03Value(0);

        boardDAO.setCell10Value(7);
        boardDAO.setCell11Value(6);
        boardDAO.setCell12Value(5);
        boardDAO.setCell13Value(4);

        boardDAO.setCell20Value(11);
        boardDAO.setCell21Value(10);
        boardDAO.setCell22Value(9);
        boardDAO.setCell23Value(8);

        boardDAO.setCell30Value(15);
        boardDAO.setCell31Value(14);
        boardDAO.setCell32Value(13);
        boardDAO.setCell33Value(12);
        return boardDAO;
    }

    // converts a given board to a 1d array
    private Integer[] convertBoardToOneDimensionalArray(Board actualBoard) {
        Integer[] actualValues = new Integer[boardDimension*boardDimension];
        for ( int i = 0; i < boardDimension*boardDimension; i++ ) {
            actualValues[i] = actualBoard.getCells()[i/boardDimension][i%boardDimension].getValue();
        }
        return actualValues;
    }
}
