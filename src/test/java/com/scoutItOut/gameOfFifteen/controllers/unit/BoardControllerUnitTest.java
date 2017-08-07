
package com.scoutItOut.gameOfFifteen.controllers.unit;

import com.scoutItOut.gameOfFifteen.dao.BoardDAO;
import com.scoutItOut.gameOfFifteen.controllers.BoardController;
import com.scoutItOut.gameOfFifteen.model.Board;
import com.scoutItOut.gameOfFifteen.model.Cell;
import com.scoutItOut.gameOfFifteen.repository.BoardRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * @author jasquier
 * @since 0.1
 */
public class BoardControllerUnitTest {

    private List<BoardDAO> dummyBoards;

    @Mock
    private BoardRepository boardRepository;

    @InjectMocks
    private BoardController boardController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dummyBoards = initializeListOfBoardDAOs();
    }

    @Test
    public void exampleBoardTest() {
        // generate the default board
        Board expected = new Board();

        // no need for mocks here
        Board actual = new Board(boardController.exampleBoard());

        //assertEquals(expected, actual);
        assertThat(actual, is(expected));
    }


    @Test
    public void listBoardsTest() {
        // build expected
        List<BoardDAO> expected = initializeListOfBoardDAOs();

        // mock the dependencies in the controller
        when(boardRepository.findAll()).thenReturn(dummyBoards);

        // exercise
        List<BoardDAO> actual = boardController.list();

        // ensure the mocked method was called
        verify(boardRepository).findAll();

        //assertEquals(expected, actualDAOs);
        // TODO rework the assert once equals() methods are implemented
        assertThat(actual.size(), is(expected.size()));
        for ( int i = 0; i < actual.size(); i++ ) {
            assertThat(actual.get(i), is(expected.get(i)));
        }
    }

    private List<BoardDAO> initializeListOfBoardDAOs() {
        BoardDAO defaultBoardDAO = new Board().convertBoardToDAO();

        Board slightlyModifiedDefaultBoard = new Board();
        slightlyModifiedDefaultBoard.setId(2L);
        Cell[][] cells = slightlyModifiedDefaultBoard.getCells();
        cells[0][0] = new Cell(1337);
        BoardDAO slightModifiedDefaultBoardDAO = slightlyModifiedDefaultBoard.convertBoardToDAO();

        List<BoardDAO> boardDAOs = new ArrayList<>();
        boardDAOs.add(defaultBoardDAO);
        boardDAOs.add(slightModifiedDefaultBoardDAO);
        return boardDAOs;
    }

}

