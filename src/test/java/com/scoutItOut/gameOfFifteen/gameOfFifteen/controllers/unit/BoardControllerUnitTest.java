
package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers.unit;

import com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers.BoardController;
import com.scoutItOut.gameOfFifteen.gameOfFifteen.model.Board;
import com.scoutItOut.gameOfFifteen.gameOfFifteen.repository.BoardRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * @author jasquier
 * @since 0.1
 */
public class BoardControllerUnitTest {

    private List<Board> dummyBoards;

    @Mock
    private BoardRepository boardRepository;

    @InjectMocks
    private BoardController boardController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        // setup dummy database
       // dummyBoards = new ArrayList<>();
       // dummyBoards.add(new Board(1L,));
    }

    @Test
    public void exampleBoardTest() {
        Board expected = new Board();

        // no need for mocks here
        Board actual = new Board(boardController.exampleBoard());

        assertEquals(expected, actual);
    }

    /*
    @Test
    public void listBoardsTest() {
        // build expected
        List<Board> expected = new ArrayList<>();
        Board expected1 = new Board(1L, "board1");
        Board expected2 = new Board(2L, "board2");
        expected.add(expected1);
        expected.add(expected2);

        // mock the dependencies in the controller
        when(boardRepository.findAll()).thenReturn(dummyBoards);

        // exercise
        List<Board> actual = boardController.list();

        // ensure the mocked method was called
        verify(boardRepository).findAll();

        assertEquals(expected, actual);
    }
    */
}

