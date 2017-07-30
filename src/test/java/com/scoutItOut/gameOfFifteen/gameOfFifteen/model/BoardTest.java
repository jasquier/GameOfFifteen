package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jasquier
 * @since 0.1
 */
public class BoardTest {

    private Board board;

    @Before
    public void setup() {
        board = new Board();
    }

    @Test
    public void twoBoardsShouldBeEqual() {
        Board board1 = new Board(1L, "test");
        Board board2 = new Board(1L, "test");

        assertEquals(board1, board2);
    }

    @Test
    public void twoBoardsShouldNotBeEqualBecauseTheirIdsDoNotMatch() {

    }

    @Test
    public void aBoardShouldNotEqualAString() {
        Board board1 = new Board(1L, "test");
        String string1 = "test";

        assertNotEquals(board1, string1);
    }
}
