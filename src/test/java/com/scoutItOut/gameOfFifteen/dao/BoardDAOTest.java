package com.scoutItOut.gameOfFifteen.dao;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author jasquier
 */
public class BoardDAOTest {

    @Test
    public void twoBoardDAOsShouldBeEqual() {
        BoardDAO boardDAO1 = new BoardDAO();
        BoardDAO boardDAO2 = new BoardDAO();

        boardDAO1.setCell00Value(0);
        boardDAO2.setCell00Value(0);
        boardDAO1.setCell01Value(1);
        boardDAO2.setCell01Value(1);
        boardDAO1.setCell02Value(2);
        boardDAO2.setCell02Value(2);
        boardDAO1.setCell03Value(3);
        boardDAO2.setCell03Value(3);

        boardDAO1.setCell10Value(10);
        boardDAO2.setCell10Value(10);
        boardDAO1.setCell11Value(11);
        boardDAO2.setCell11Value(11);
        boardDAO1.setCell12Value(21);
        boardDAO2.setCell12Value(21);
        boardDAO1.setCell13Value(31);
        boardDAO2.setCell13Value(31);

        boardDAO1.setCell20Value(20);
        boardDAO2.setCell20Value(20);
        boardDAO1.setCell21Value(21);
        boardDAO2.setCell21Value(21);
        boardDAO1.setCell22Value(22);
        boardDAO2.setCell22Value(22);
        boardDAO1.setCell23Value(23);
        boardDAO2.setCell23Value(23);

        boardDAO1.setCell30Value(30);
        boardDAO2.setCell30Value(30);
        boardDAO1.setCell31Value(31);
        boardDAO2.setCell31Value(31);
        boardDAO1.setCell32Value(32);
        boardDAO2.setCell32Value(32);
        boardDAO1.setCell33Value(33);
        boardDAO2.setCell33Value(33);

        assertThat(boardDAO1, is(boardDAO2));
    }

    @Test
    public void twoBoardDAOsShouldNotBeEqualBecauseCell00DoesntMatch() {

    }
}
